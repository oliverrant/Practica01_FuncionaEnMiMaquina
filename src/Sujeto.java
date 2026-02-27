/**
 * Representa al Sujeto de Observer, es decir, mantiene
 * un conjunto de observadores interesados en sus cambios
 * de estado, por lo que podemos registrarlos y quitarlos, 
 * y les envía notificaciones cuando ocurre algún evento.
 */

public interface Sujeto {

    /**
     * Registra un observador para que reciba notificaciones del sujeto.
     * 
     * @param o el observador.
     */
    void registrarObservador(Observador o);

    /**
     * Eliminamos un observador de la lista.
     * 
     * @param o el observador.
     */
    void quitarObservador(Observador o);

    /**
     * Notificamos a todos los observadores registrados sobre 
     * algun evento que ocurra durante la pelea.
     * 
     * @param notificacion
     */
    void notificarObservadores(String notificacion);

}
