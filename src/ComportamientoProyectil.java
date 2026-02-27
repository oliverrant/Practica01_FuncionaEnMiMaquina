/**
 * Implementación de una habilidad de tipo proyectil.
 * 
 * Representa un ataque lanzando un proyectil grande
 * y una defensa basada en el movimiento constante.
 */
public class ComportamientoProyectil implements ComportamientoHabilidad {
    
    /**
     * Genera el mensaje de ataque con proyectil.
     *
     * @param nombreAtacante nombre del personaje que ataca
     * @param nombreObjetivo nombre del personaje objetivo
     * @return mensaje descriptivo del ataque
     */
    @Override
    public String atacar(String nombreAtacante, String nombreObjetivo){
        return nombreAtacante + " le lanza un proyectil (grande) a " + nombreObjetivo;
    }

    /**
     * Genera el mensaje de defensa.
     *
     * @param nombrePersonaje nombre del personaje que se defiende
     * @return mensaje descriptivo de la defensa
     */
    @Override
    public String defender(String nombrePersonaje){
        return nombrePersonaje + " corre en círculos";
    }
    
    /**
     * Devuelve el daño de la habilidad.
     *
     * @return valor de daño
     */
    @Override
    public int getDanio(){
        return 6;
    }

    /**
     * Devuelve el valor de defensa de la habilidad.
     *
     * @return valor de defensa
     */
    @Override
    public int getDefensa(){
        return 1;
    }
}