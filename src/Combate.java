public class Combate {
    
    private Sujeto sujeto;
    private GestorCombate gestorCombate;

    public Combate(Sujeto sujeto, GestorCombate gestorCombate) {
        this.sujeto = sujeto;
        this.gestorCombate = gestorCombate;
    }

    public void iniciar() {
        sujeto.notificarObservadores("¡El combate ha comenzado!");

        while (gestorCombate.personajesVivos() > 1) {
            String eventos = gestorCombate.ejecutarRonda();
            sujeto.notificarObservadores(eventos);
        }

        Personaje ganador = gestorCombate.obtenerGanador();
        if (ganador != null) {
            sujeto.notificarObservadores("¡El combate ha terminado! El ganador es " + ganador.getNombre());
            sujeto.cerrar(ganador.getNombre());
        } else {
            sujeto.notificarObservadores("¡El combate ha terminado en empate!");
            sujeto.cerrar("ninguno");
        }
    }

}