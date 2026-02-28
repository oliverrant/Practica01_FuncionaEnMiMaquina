/**
 * Implementación de una habilidad de tipo sueño.
 * 
 * Representa un ataque que induce al sueño
 * y una defensa basada en bloquear el sonido.
 */
public class ComportamientoSuenio implements ComportamientoHabilidad{
    
    private String nombre = "Habilidades de Sueño";
   
     @Override
    public String getNombre() {
        return nombre;
    }

    /**
     * Genera el mensaje de ataque para inducir sueño.
     *
     * @param nombreAtacante nombre del personaje que ataca
     * @param nombreObjetivo nombre del personaje objetivo
     * @return mensaje descriptivo del ataque
     */
    @Override
    public String atacar(String nombreAtacante, String nombreObjetivo){
        return nombreAtacante + " pone a ver One Piezzzzzz a " + nombreObjetivo;
    }

    /**
     * Genera el mensaje de defensa.
     *
     * @param nombrePersonaje nombre del personaje que se defiende
     * @return mensaje descriptivo de la defensa
     */
    @Override
    public String defender(String nombrePersonaje){
        return nombrePersonaje + " se duerme un ratito";
    }
    
    /**
     * Devuelve el daño de la habilidad.
     *
     * @return valor de daño
     */
    @Override
    public int getDanio(){
        return 4;
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