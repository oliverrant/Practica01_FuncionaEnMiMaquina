/**
 * Strategy: comportamiento de defensa.
 */
public interface DefensaBehavior {
    /**
     * Modifica el daño recibido (mitigación).
     */
    int mitigarDanio(Personaje defensor, Personaje atacante, int danioCrudo);
    String nombre();
}
