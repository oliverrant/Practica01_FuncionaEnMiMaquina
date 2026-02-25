/**
 * Clase base para personajes. Contexto de Strategy (Ataque/Defensa).
 */
public abstract class Personaje {
    private final String nombre;
    private final int hpMax;
    private int hpActual;

    private AtaqueBehavior ataque;
    private DefensaBehavior defensa;

    protected Personaje(String nombre, int hpMax, AtaqueBehavior ataque, DefensaBehavior defensa) {
        if (hpMax <= 0) throw new IllegalArgumentException("hpMax debe ser > 0");
        this.nombre = nombre;
        this.hpMax = hpMax;
        this.hpActual = hpMax;
        this.ataque = ataque;
        this.defensa = defensa;
    }

    public String getNombre() {
        return nombre;
    }

    public int getHpMax() {
        return hpMax;
    }

    public int getHpActual() {
        return hpActual;
    }

    public boolean estaVivo() {
        return hpActual > 0;
    }

    public AtaqueBehavior getAtaque() {
        return ataque;
    }

    public DefensaBehavior getDefensa() {
        return defensa;
    }

    public void setAtaque(AtaqueBehavior ataque) {
        if (ataque == null) throw new IllegalArgumentException("ataque no puede ser null");
        this.ataque = ataque;
    }

    public void setDefensa(DefensaBehavior defensa) {
        if (defensa == null) throw new IllegalArgumentException("defensa no puede ser null");
        this.defensa = defensa;
    }

    /**
     * Ejecuta un ataque del personaje hacia el objetivo, aplicando defensa del objetivo.
     * @return daño final aplicado
     */
    public int atacar(Personaje objetivo) {
        int danioCrudo = ataque.calcularDanio(this, objetivo);
        int danioFinal = objetivo.recibirDanio(this, danioCrudo);
        return danioFinal;
    }

    /**
     * Aplica mitigación y descuenta HP.
     * @return daño final aplicado
     */
    public int recibirDanio(Personaje atacante, int danioCrudo) {
        int danioFinal = defensa.mitigarDanio(this, atacante, danioCrudo);
        danioFinal = Math.max(0, danioFinal);
        hpActual = Math.max(0, hpActual - danioFinal);
        return danioFinal;
    }

    @Override
    public String toString() {
        return nombre + " (HP " + hpActual + "/" + hpMax + ")";
    }
}
