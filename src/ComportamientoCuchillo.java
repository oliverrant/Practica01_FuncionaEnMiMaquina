/**
 * Implementación de una habilidad tipo cuchillo.
 * 
 * Representa un ataque con múltiples cuchillos
 * y una defensa basada en la evasión.
 */
public class ComportamientoCuchillo implements ComportamientoHabilidad  {
    
    private String nombre = "Habilidades Cuchillo";
   
     @Override
    public String getNombre() {
        return nombre;
    }

    /**
     * Genera el mensaje de ataque con cuchillos.
     *
     * @param nombreAtacante nombre del personaje que ataca
     * @param nombreObjetivo nombre del personaje objetivo
     * @return mensaje descriptivo del ataque
     */
    @Override
    public String atacar(String nombreAtacante, String nombreObjetivo){
        return nombreAtacante + " le lanza varios cuchillos, uno tras otro, a " + nombreObjetivo;
    }

    /**
     * Genera el mensaje de defensa evasiva.
     *
     * @param nombrePersonaje nombre del personaje que se defiende
     * @return mensaje descriptivo de la defensa
     */
    @Override
    public String defender(String nombrePersonaje){
        return nombrePersonaje + " los esquiva";
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
        return 3;
    }
}