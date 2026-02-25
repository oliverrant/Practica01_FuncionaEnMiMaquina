/**
 * Strategy: comportamiento de ataque.
 */
public interface AtaqueBehavior {
    /**
     * Calcula el daño crudo (antes de defensa) que infligirá el atacante.
     */
    int calcularDanio(Personaje atacante, Personaje objetivo);
    String nombre();
}
