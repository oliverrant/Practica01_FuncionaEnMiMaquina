/**
 * Interfaz para registrar y remover observadores.
 */
public interface Observador {


    /**
     * El método recibe la actualización de lo que está pasando.
     * @param actualizacion. Es la descripción de lo que está 
     * pasando en la pelea.
     */
    void recibirActualizacion(String actualizacion);
    
}