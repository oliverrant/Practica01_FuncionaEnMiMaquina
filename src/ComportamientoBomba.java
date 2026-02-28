/**
 * Implementación de una habilidad especial tipo bomba (de agua).
 * 
 * Proporciona un ataque con bombas de agua y una defensa alta.
 */
public class ComportamientoBomba implements ComportamientoHabilidad{

    private String nombre = "Habilidades Bomba";
   
     @Override
    public String getNombre() {
        return nombre;
    }

    /**
     * Genera el mensaje de ataque con bombas.
     *
     * @param nombreAtacante nombre del personaje que ataca
     * @param nombreObjetivo nombre del personaje objetivo
     * @return mensaje descriptivo del ataque
     */
    @Override
    public String atacar(String nombreAtacante, String nombreObjetivo){
        return nombreAtacante + " le lanza bombas (de agua) a " + nombreObjetivo;
    }

    /**
     * Genera el mensaje de defensa usando paraguas.
     *
     * @param nombrePersonaje nombre del personaje que se defiende
     * @return mensaje descriptivo de la defensa
     */
    @Override
    public String defender(String nombrePersonaje){
        return nombrePersonaje + " abre su paraguas como escudo";
    }

    /**
     * Devuelve el daño de la habilidad bomba.
     *
     * @return valor de daño
     */
    @Override
    public int getDanio(){
        return 2;
    }

    /**
     * Devuelve el valor de defensa de la habilidad bomba.
     *
     * @return valor de defensa
     */
    @Override
    public int getDefensa(){
        return 10;
    }
}
