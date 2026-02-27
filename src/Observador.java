/**
 * Representa al Observador en Observer, el cual se suscribe 
 * a un sujeto para recibir notificaciones cuando ocurre algún 
 * cambio o evento relevante en él.
 */
public interface Observador {


    /**
     * El metodo recibe la actualización de lo que está pasando.
     * @param actualizacion. Es la descripción de lo que está 
     * pasando en el combate.
     */
    void recibirActualizacion(String actualizacion);
    
    /**
     * El metodo recibe el nombre del ganador.
     * 
     * @param nombreGanador del combate
     */
    void cerrarBitacora(String nombreGanador);
}