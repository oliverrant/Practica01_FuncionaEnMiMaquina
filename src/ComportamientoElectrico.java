/**
 * Implementación de una habilidad de tipo eléctrico.
 * 
 * Representa un ataque con rayos eléctricos y una defensa
 * basada en volverse intangible.
 */
public class ComportamientoElectrico implements ComportamientoHabilidad {
    
    private String nombre = "Habilidades Electricas";
   
     @Override
    public String getNombre() {
        return nombre;
    }

    /**
     * Genera el mensaje de ataque eléctrico.
     *
     * @param nombreAtacante nombre del personaje que ataca
     * @param nombreObjetivo nombre del personaje objetivo
     * @return mensaje descriptivo del ataque
     */
    @Override
    public String atacar(String nombreAtacante, String nombreObjetivo){
        return nombreAtacante + " lanza rayos electricos a " + nombreObjetivo;
    }

    /**
     * Genera el mensaje de defensa eléctrica.
     *
     * @param nombrePersonaje nombre del personaje que se defiende
     * @return mensaje descriptivo de la defensa
     */
    @Override
    public String defender(String nombrePersonaje){
        return nombrePersonaje + " se hace electrocutante a todo aquel que vea";
    }
    
    /**
     * Devuelve el daño de la habilidad.
     *
     * @return valor de daño
     */
    @Override
    public int getDanio(){
        return 10;
    }

    /**
     * Devuelve el valor de defensa de la habilidad.
     *
     * @return valor de defensa
     */
    @Override
    public int getDefensa(){
        return 10;
    }
}