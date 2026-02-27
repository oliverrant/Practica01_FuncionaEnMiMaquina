import java.util.ArrayList;
import java.util.List;

public class Combate implements Sujeto{
    
    private List<Observador> espectadores = new ArrayList<>();

    @Override public void quitarObservador(Observador o){
        espectadores.remove(o);
    }

    @Override public void registrarObservador(Observador o){
        espectadores.add(o);
    }
    
    @Override public void notificarObservadores(String notificacion){
        for (Observador observador : espectadores) {
            observador.recibirActualizacion(notificacion);
        }
    }
}
