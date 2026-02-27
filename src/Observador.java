/**
 * Representa al Observador en Observer, el cual se suscribe 
 * a un sujeto para recibir notificaciones cuando ocurre algún 
 * cambio o evento relevante en él.
 */
public interface Observador {


    /**
     * El método recibe la actualización de lo que está pasando.
     * @param actualizacion. Es la descripción de lo que está 
     * pasando en la pelea.
     */
    void recibirActualizacion(String actualizacion);
    
    void cerrarBitacora(String nombreGanador);
}