/**
 * Es para 
 */

public interface Sujeto {

    /**
     * Agregamos un observador a la lista.
     * @param o
     */
    void registrarObservador(Observador o);

    /**
     * Eliminamos un observador de la lista.
     * @param o
     */
    void quitarObservador(Observador o);

    /**
     * Notificamos a todos los observadores.
     * @param notificacion
     */
    void notificarObservadores(String notificacion);

}
