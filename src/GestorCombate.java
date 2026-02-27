import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class GestorCombate {
    private List<Personaje> participantes;
    private Random random;
    private int numeroRonda = 0;

    public GestorCombate(List<Personaje> participantes, Random random) {
        this.participantes = participantes;
        this.random = random;
    }

    public String ejecutarRonda() {
        numeroRonda++;
        StringBuilder eventos = new StringBuilder();
        eventos.append("--- Ronda " + numeroRonda + " ---\n");
        
        for (Personaje p : participantes) {
            if (p.estaVivo() && random.nextInt(100) < 30) {
                p.adquirirPoder(random);
                eventos.append(p.getNombre() + " ha consumido un poder y ahora usa " + p.getComportamiento().getNombre() + "\n");
            }
        }

        for (Personaje atacante : participantes) {
            if (atacante.estaVivo()) {
                Personaje objetivo = obtenerObjetivoAleatorio(atacante);
                if (objetivo != null) {
                    eventos.append(ejecutarAtaque(atacante, objetivo));
                }
            }
        }

        return eventos.toString();
    }

    private String ejecutarAtaque(Personaje atacante, Personaje objetivo) {
        int danioFinal = Math.max(0, atacante.getComportamiento().getDanio() - objetivo.getComportamiento().getDefensa());
        objetivo.recibirDanio(danioFinal);

        return atacante.atacar(objetivo.getNombre()) + "\n"
             + objetivo.defender() + "\n"
             + objetivo.getNombre() + " recibe " + danioFinal + " puntos de daño. "
             + "Le quedan " + objetivo.getPuntosVida() + " puntos de vida.\n";
    }

    private Personaje obtenerObjetivoAleatorio(Personaje atacante) {
        List<Personaje> objetivos = new ArrayList<>();
        for (Personaje p : participantes) {
            if (p != atacante && p.estaVivo()) {
                objetivos.add(p);
            }
        }
        if (objetivos.isEmpty()) return null;
        return objetivos.get(random.nextInt(objetivos.size()));
    }

    public int personajesVivos() {
        int count = 0;
        for (Personaje p : participantes) {
            if (p.estaVivo()) count++;
        }
        return count;
    }

    public Personaje obtenerGanador() {
        for (Personaje p : participantes) {
            if (p.estaVivo()) return p;
        }
        return null;
    }
}
