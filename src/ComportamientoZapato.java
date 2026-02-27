/**
 * Implementación de una habilidad de tipo zapato.
 * 
 * Representa un ataque y defensa utilizando un zapato
 * como recurso principal.
 */
public class ComportamientoZapato implements ComportamientoHabilidad{
    
    /**
     * Genera el mensaje de ataque con zapato.
     *
     * @param nombreAtacante nombre del personaje que ataca
     * @param nombreObjetivo nombre del personaje objetivo
     * @return mensaje descriptivo del ataque
     */
    @Override
    public String atacar(String nombreAtacante, String nombreObjetivo){
        return nombreAtacante + " le lanza su zapato a " + nombreObjetivo;
    }

    /**
     * Genera el mensaje de defensa con zapato.
     *
     * @param nombrePersonaje nombre del personaje que se defiende
     * @return mensaje descriptivo de la defensa
     */
    @Override
    public String defender(String nombrePersonaje){
        return nombrePersonaje + " le lanza su zapato también xd";
    }
    
    /**
     * Devuelve el daño de la habilidad.
     *
     * @return valor de daño
     */
    @Override
    public int getDanio(){
        return 5;
    }

    /**
     * Devuelve el valor de defensa de la habilidad.
     *
     * @return valor de defensa
     */
    @Override
    public int getDefensa(){
        return 5;
    }
}