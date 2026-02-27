/**
 * Implementación de una habilidad de tipo fuego.
 * 
 * Representa un ataque con bolas de fuego y una defensa
 * basada en la creación de un escudo.
 */
public class ComportamientoFuego implements ComportamientoHabilidad {

    private String nombre = "Habilidades de Fuego";
   
     @Override
    public String getNombre() {
        return nombre;
    }

    /**
     * Genera el mensaje de ataque con fuego.
     *
     * @param nombreAtacante nombre del personaje que ataca
     * @param nombreObjetivo nombre del personaje objetivo
     * @return mensaje descriptivo del ataque
     */
    @Override
    public String atacar(String nombreAtacante, String nombreObjetivo){
        return nombreAtacante + " le lanza bolas de fuego a " + nombreObjetivo;
    }

    /**
     * Genera el mensaje de defensa con escudo.
     *
     * @param nombrePersonaje nombre del personaje que se defiende
     * @return mensaje descriptivo de la defensa
     */
    @Override
    public String defender(String nombrePersonaje){
        return nombrePersonaje + " crea un escudo impenetrable con su mugre de no bañarse hace 99 años";
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
        return 7;
    }
}