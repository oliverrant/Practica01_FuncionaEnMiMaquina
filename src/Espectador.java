/**
 * Clase Espectador que representa al espectador en Observer, que lo
 * que hace es observar el desarrollo del combate y registrar en una
 * bitácora (archivo de texto) todas las actualizaciones recibidas.
 * Cuando detecta que el combate ha finalizado, escribe el resultado
 * correspondiente a su personaje y deja de registrar eventos.
 */

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Espectador implements Observador{
    private int id;
    private Personaje personaje;
    private BufferedWriter bw;
    private boolean combateTerminado;

    /**
     * Crea un nuevo espectador asociado a un personaje.
     * Además, inicializa la bitácora donde se guardarán los eventos del combate.
     *
     * @param id identificador del espectador (usado para nombrar la bitácora)
     * @param personaje personaje al que el espectador sigue durante el combate
    */
    public Espectador(int id, Personaje personaje){
        this.id = id;
        this.personaje = personaje;

        try {
            this.bw = new BufferedWriter(new FileWriter(id + "_bitacora.txt"));
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
        if (combateTerminado) return;
        if(bw != null){
            try{
                bw.write(actualizacion);
                bw.newLine();
            if(actualizacion.contains("Ganador:")){
                if(actualizacion.contains(personaje.getNombre())){
                    bw.write("Tu personaje gano");
                } else {
                    bw.write("Tu personaje perdio");
                }
                bw.newLine();
                combateTerminado = true;
            }
            bw.flush();
        } catch (IOException e) {
                System.out.println("Error al escribir en la bitacora");
            }
        }
    }

    /**
     * Cierra la bitácora asociada al espectador.
     */
    public void cerrarBitacora(){
        if(bw != null){
            try {
                bw.close();
            } catch (Exception e) {
                System.out.println("Error al cerrar");
            }
            
        }
    }

}
