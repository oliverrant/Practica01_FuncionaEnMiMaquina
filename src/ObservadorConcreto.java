import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Clase ObservadorConcreto que representa al espectador en Observer, que lo
 * que hace es observar el desarrollo del combate y registrar en una
 * bitácora (archivo de texto) todas las actualizaciones recibidas.
 * Cuando detecta que el combate ha finalizado, escribe el resultado
 * correspondiente a su personaje y deja de registrar eventos.
 */
public class ObservadorConcreto implements Observador{
    private String id;
    private Personaje personajeFavorito;
    private BufferedWriter escritorBitacora;

    /**
     * Crea un nuevo espectador asociado a un personaje.
     * Además, inicializa la bitácora donde se guardarán los eventos del combate.
     *
     * @param id identificador del espectador (usado para nombrar la bitácora)
     * @param personaje personaje al que el espectador sigue durante el combate
    */
    public ObservadorConcreto(String id, Personaje personajeFavorito){
        this.id = id;
        this.personajeFavorito = personajeFavorito;

        try {
            escritorBitacora = new BufferedWriter(new FileWriter(id + "_bitacora.txt"));
            escritorBitacora.write("Bitácora del espectador: " + id + "\n");
            escritorBitacora.write("Personaje favorito: " + personajeFavorito + "\n\n");
            } catch (IOException e) {
                System.out.println("Error al crear la bitacora");
            }
    }

    /**
     * Recibe una actualización del combate. Lo que hace es registrar
     * el evento en la bitácora. Si la actualización indica
     * el ganador del combate, escribe si su personaje ganó o perdió
     * y marca el combate como finalizado.
     *
     * @param actualizacion mensaje enviado por el sujeto (Combate)
     */
    @Override public void recibirActualizacion(String actualizacion){
        try {
            escritorBitacora.write(actualizacion + "\n");
        } catch (IOException e) {
            System.out.println("Error al actualizar la bitacora");
        }
        
    }

    /**
     * Cierra la bitácora asociada al espectador.
     * 
     * @param nombreGanador es el nombre que escribimos en la bitacora.
     */
    public void cerrarBitacora(String nombreGanador){
        try {
            if (nombreGanador.equals(personajeFavorito.getNombre())) {
                escritorBitacora.write("\n¡Tu personaje favorito " + personajeFavorito.getNombre() + " gano el combate!");
            } else {
                escritorBitacora.write("\nTu personaje favorito " + personajeFavorito.getNombre()+ " perdio el combate." + nombreGanador + " gano el combate.");
            }
            escritorBitacora.close();
        } catch (IOException e) {
            System.out.println("Error al escribir el ganador en la bitacora");
        }
    }

}
