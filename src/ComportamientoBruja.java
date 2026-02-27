/**
 * Implementación de una habilidad especial tipo bruja.
 * 
 * Representa un ataque mágico que transforma al oponente
 * y una defensa basada en una cura mágica.
 */
public class ComportamientoBruja implements ComportamientoHabilidad{
    
    /**
     * Genera el mensaje de ataque con hechizo.
     *
     * @param nombreAtacante nombre del personaje que ataca
     * @param nombreObjetivo nombre del personaje objetivo
     * @return mensaje descriptivo del ataque
     */
    @Override
    public String atacar(String nombreAtacante, String nombreObjetivo){
        return nombreAtacante + " le lanza un hechizo a " + nombreObjetivo + " y lo convierte en una rana";
    }

    /**
     * Genera el mensaje de defensa mágica.
     *
     * @param nombrePersonaje nombre del personaje que se defiende
     * @return mensaje descriptivo de la defensa
     */
    @Override
    public String defender(String nombrePersonaje){
        return nombrePersonaje + " se come una hierba magica que es la cura";
    }
    
    /**
     * Devuelve el daño de esta habilidad.
     *
     * @return valor de daño
     */
    @Override
    public int getDanio(){
        return 0;
    }

    /**
     * Devuelve el valor de defensa de esta habilidad.
     *
     * @return valor de defensa
     */
    @Override
    public int getDefensa(){
        return 0;
    }
}