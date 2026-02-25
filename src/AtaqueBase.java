/**
 * Ataque base: daño fijo como fracción de HP máximo del objetivo.
 */
public class AtaqueBase implements AtaqueBehavior {
    private final int denominador;

    /**
     * @param denominador por ejemplo 8 => daño base ~ HPmax/8
     */
    public AtaqueBase(int denominador) {
        if (denominador <= 0) throw new IllegalArgumentException("denominador debe ser > 0");
        this.denominador = denominador;
    }

    @Override
    public int calcularDanio(Personaje atacante, Personaje objetivo) {
        int base = (int) Math.ceil(objetivo.getHpMax() / (double) denominador);
        return Math.max(1, base);
    }

    @Override
    public String nombre() {
        return "AtaqueBase(HPmax/" + denominador + ")";
    }
}
