/**
 * Implementación de una habilidad de tipo hipnosis.
 * 
 * Representa un ataque que utiliza hipnosis
 * y una defensa basada en distracción.
 */
public class ComportamientoHipnotizar implements ComportamientoHabilidad {
    
    private String nombre = "Habilidades hipnóticas";
   
     @Override
    public String getNombre() {
        return nombre;
    }

    /**
     * Genera el mensaje de ataque hipnótico.
     *
     * @param nombreAtacante nombre del personaje que ataca
     * @param nombreObjetivo nombre del personaje objetivo
     * @return mensaje descriptivo del ataque
     */
    @Override
    public String atacar(String nombreAtacante, String nombreObjetivo){
        return nombreAtacante + " hipnotiza con serpientes a " + nombreObjetivo;
    }

    /**
     * Genera el mensaje de defensa.
     *
     * @param nombrePersonaje nombre del personaje que se defiende
     * @return mensaje descriptivo de la defensa
     */
    @Override
    public String defender(String nombrePersonaje){
        return nombrePersonaje + " parpadea muchas veces";
    }
    
    /**
     * Devuelve el daño de la habilidad.
     *
     * @return valor de daño
     */
    @Override
    public int getDanio(){
        return 9;
    }

    /**
     * Devuelve el valor de defensa de la habilidad.
     *
     * @return valor de defensa
     */
    @Override
    public int getDefensa(){
        return 0;
    }
}