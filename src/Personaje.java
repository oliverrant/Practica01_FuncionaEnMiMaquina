import java.util.List;
import java.util.Random;

/**
 * Clase abstracta que representa un personaje del juego.
 * 
 * Define los atributos y comportamientos comunes de todos los personajes,
 * como nombre, puntos de vida y habilidad actual.
 * 
 * Utiliza el patrón Strategy para cambiar dinámicamente
 * el comportamiento de habilidad durante el juego.
 */
public abstract class Personaje {

    /** Nombre del personaje */
    protected String nombre;

    /** Puntos de vida actuales del personaje */
    protected int puntosVida;

    /** Comportamiento actual de habilidad del personaje */
    protected ComportamientoHabilidad comportamiento;

    /** Catálogo de habilidades disponibles para el personaje */
    protected CatalogoHabilidades catalogo;

    /**
     * Constructor del personaje.
     *
     * @param nombre nombre del personaje
     * @param puntosVida puntos de vida iniciales
     * @param catalogo catálogo de habilidades disponibles
     */
    public Personaje(String nombre, int puntosVida, CatalogoHabilidades catalogo) {
        this.nombre = nombre;
        this.puntosVida = puntosVida;
        this.catalogo = catalogo;
        this.comportamiento = new ComportamientoBase();
    }

    /**
     * Reduce los puntos de vida del personaje según el daño recibido.
     * Si el resultado es menor que cero, se establece en cero.
     *
     * @param danio cantidad de daño recibido
     */
    public void recibirDanio(int danio){
        int vidaResultante = this.puntosVida - danio;
        this.puntosVida = vidaResultante > 0 ? vidaResultante : 0;
    }

    /**
     * Asigna aleatoriamente una nueva habilidad del catálogo
     * al personaje.
     *
     * @param random generador de números aleatorios
     */
    public void adquirirPoder(Random random){
        List<ComportamientoHabilidad> opciones = catalogo.getHabilidades();
        this.comportamiento = opciones.get(random.nextInt(opciones.size()));
    }
  
    /**
     * Indica si el personaje sigue con vida.
     *
     * @return true si los puntos de vida son mayores a cero
     */
    public boolean estaVivo(){
        return this.puntosVida > 0;
    }

    /**
     * Devuelve el comportamiento actual del personaje.
     *
     * @return comportamiento de habilidad actual
     */
    public ComportamientoHabilidad getComportamiento() {
        return this.comportamiento;
    }

    /**
     * Devuelve el nombre del personaje.
     *
     * @return nombre del personaje
     */
    public String getNombre() {
        return this.nombre;
    }

    /**
     * Devuelve los puntos de vida actuales.
     *
     * @return puntos de vida
     */
    public int getPuntosVida() {
        return this.puntosVida;
    }

    /**
     * Ejecuta el ataque utilizando el comportamiento actual.
     *
     * @param nombreObjetivo nombre del personaje objetivo
     * @return mensaje descriptivo del ataque
     */
    public String atacar(String nombreObjetivo){
        return comportamiento.atacar(this.nombre, nombreObjetivo);
    }

    /**
     * Ejecuta la defensa utilizando el comportamiento actual.
     *
     * @return mensaje descriptivo de la defensa
     */
    public String defender(){
        return comportamiento.defender(this.nombre);
    }
}