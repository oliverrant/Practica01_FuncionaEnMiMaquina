import java.util.ArrayList;
import java.util.List;

public class Combate implements Sujeto{
    
    private List<Observador> observadores = new ArrayList<>();

    @Override public void quitarObservador(Observador o){
        observadores.remove(o);
    }

    @Override public void registrarObservador(Observador o){
        observadores.add(o);
    }
    
    @Override public void notificarObservadores(String notificacion){
        for (Observador observador : observadores) {
            observador.recibirActualizacion(notificacion);
        }
    }

    /**
     * Simulamos el combate.
     */
    public void simular(){

    }
}
