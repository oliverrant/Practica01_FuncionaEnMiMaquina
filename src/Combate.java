/**
 * Clase para representar el combate. Para ello implementa Sujeto, 
 * mantiene una lista de observadores, permite registrarlos y quitarlos,
 * les notifica actualizaciones y puede simular una pelea.
 * 
 */

import java.util.ArrayList;
import java.util.List;

public class Combate implements Sujeto{
    
    private List<Observador> observadores = new ArrayList<>();

    /**
     * Quita al observador.
     * 
     * @param o observador que ve el combate.
     */
    @Override public void quitarObservador(Observador o){
        observadores.remove(o);
    }

    /**
     * Agrega un observador a la lista para que reciba 
     * actualizaciones del combate.
     * 
     * @param o observador que ve el combate.
     */
    @Override public void registrarObservador(Observador o){
        observadores.add(o);
    }
    
    /**
     * Notifica a todos los observadores registrados sobre algun
     * evento que ocurra durante el combate.
     * 
     * @param notificacion es lo que sucede en el combate.
     */
    @Override public void notificarObservadores(String notificacion){
        for (Observador observador : observadores) {
            observador.recibirActualizacion(notificacion);
        }
    }

    /**
     * Simulamos el combate, es decir, genera eventos, notifica a
     * los observadores y tiene la lógica del combate. No tiene 
     * retorno, es solo comportamiento.
     */
    public void simular(){

    }
}
