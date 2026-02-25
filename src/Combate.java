import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Combate entre tres personajes. Subject del patrón Observer.
 */
public class Combate {
    private final List<Personaje> participantes;
    private final List<ObserverCombate> observers;
    private final Random rng;

    public Combate(Personaje a, Personaje b, Personaje c, long seed) {
        this.participantes = new ArrayList<>();
        participantes.add(a);
        participantes.add(b);
        participantes.add(c);

        this.observers = new ArrayList<>();
        this.rng = new Random(seed);
    }

    public void registrarObserver(ObserverCombate obs) {
        observers.add(obs);
    }

    private void notificar(EventoCombate e) {
        for (ObserverCombate obs : observers) {
            obs.onEvento(e);
        }
    }

    /**
     * Ejecuta el combate hasta que quede un ganador.
     */
    public Personaje ejecutar() {
        notificar(new EventoCombate(EventoTipo.INICIO_COMBATE,
                "Inicia combate entre: " + participantes.get(0) + ", " + participantes.get(1) + ", " + participantes.get(2)));

        int turno = 1;

        while (vivos().size() > 1) {
            notificar(new EventoCombate(EventoTipo.TURNO, "===== TURNO " + turno + " ====="));

            List<Personaje> vivos = vivos();
            // atacante aleatorio
            Personaje atacante = vivos.get(rng.nextInt(vivos.size()));

            // objetivo aleatorio distinto
            Personaje objetivo = atacante;
            while (objetivo == atacante) {
                objetivo = vivos.get(rng.nextInt(vivos.size()));
            }

            int danio = atacante.atacar(objetivo);
            notificar(new EventoCombate(EventoTipo.ATAQUE,
                    atacante.getNombre() + " ataca a " + objetivo.getNombre()
                            + " | daño=" + danio
                            + " | " + objetivo.getNombre() + " queda en HP=" + objetivo.getHpActual()
                            + " | atk=" + atacante.getAtaque().nombre()
                            + " | def(obj)=" + objetivo.getDefensa().nombre()
            ));

            if (!objetivo.estaVivo()) {
                notificar(new EventoCombate(EventoTipo.MUERTE, objetivo.getNombre() + " ha sido derrotado."));
            }

            turno++;
            // seguridad anti-loop (por si alguien mete una defensa que nulifica siempre)
            if (turno > 5000) {
                notificar(new EventoCombate(EventoTipo.FIN_COMBATE, "Se alcanzó límite de turnos (posible loop)."));
                break;
            }
        }

        Personaje ganador = null;
        List<Personaje> vivosFinal = vivos();
        if (vivosFinal.size() == 1) ganador = vivosFinal.get(0);

        notificar(new EventoCombate(EventoTipo.FIN_COMBATE,
                "Fin del combate. Ganador: " + (ganador == null ? "Ninguno" : ganador.getNombre())));

        // cierre personalizado por espectador (mensaje final)
        for (ObserverCombate obs : observers) {
            if (obs instanceof Espectador) {
                Espectador e = (Espectador) obs;
                obs.onFinCombate(ganador, e.getFavorito());
            } else {
                obs.onFinCombate(ganador, null);
            }
        }

        return ganador;
    }

    private List<Personaje> vivos() {
        List<Personaje> res = new ArrayList<>();
        for (Personaje p : participantes) {
            if (p.estaVivo()) res.add(p);
        }
        return res;
    }
}
