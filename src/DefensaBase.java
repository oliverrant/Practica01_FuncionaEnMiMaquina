/**
 * Defensa base: no mitiga nada.
 */
public class DefensaBase implements DefensaBehavior {
    @Override
    public int mitigarDanio(Personaje defensor, Personaje atacante, int danioCrudo) {
        return Math.max(0, danioCrudo);
    }

    @Override
    public String nombre() {
        return "DefensaBase";
    }
}
