<<<<<<< HEAD
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
=======
public class Combate {
    
>>>>>>> 16d6634381e5288c164f7d54b76ea50939ac0b33
}
