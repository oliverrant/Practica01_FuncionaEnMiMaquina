/**
 * Implementación básica de una habilidad.
 * 
 * Representa el comportamiento por defecto de ataque y defensa
 * de un personaje.
 */
public class ComportamientoBase implements ComportamientoHabilidad{
    
     /**
     * Genera el mensaje de un ataque básico.
     *
     * @param nombreAtacante nombre del personaje que ataca
     * @param nombreObjetivo nombre del personaje que recibe el ataque
     * @return mensaje descriptivo del ataque
     */
    @Override
    public String atacar(String nombreAtacante, String nombreObjetivo) {
        return nombreAtacante + " lanza un ataque básico a " + nombreObjetivo;
    }

    /**
     * Genera el mensaje de una defensa básica.
     *
     * @param nombrePersonaje nombre del personaje que se defiende
     * @return mensaje descriptivo de la defensa
     */
    @Override
    public String defender(String nombrePersonaje) {
        return nombrePersonaje + " se defiende de forma básica";
    }

    /**
     * Devuelve el daño base de esta habilidad.
     *
     * @return valor de daño
     */
    @Override
    public int getDanio() {
        return 2;
    }

    /**
     * Devuelve la defensa base de esta habilidad.
     *
     * @return valor de defensa
     */
    @Override
    public int getDefensa() {
        return 1;
    }
}
