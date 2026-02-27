import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Espectador implements Observador{
    private int id;
    private Personaje personaje;
    private BufferedWriter bw;
    private boolean combateTerminado;

    public Espectador(int id, Personaje personaje){
        this.id = id;
        this.personaje = personaje;

        try {
            this.bw = new BufferedWriter(new FileWriter(id + "_bitacora.txt"));
            } catch (IOException e) {
                System.out.println("Error al crear la bitacora");
            }
    }

    @Override public void recibirActualizacion(String actualizacion){
        if (combateTerminado) return;
        if(bw != null){
            try{
                bw.write(actualizacion);
                bw.newLine();
            // esto hay que hacerlo mas robusto porque puede contener 
            // vendedor/perdedor y solo estamos contando ganador,
            // entonces el programa se puede romper 
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
