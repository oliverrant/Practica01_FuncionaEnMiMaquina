import java.util.List;
import java.util.Random;

public abstract class Personaje {
        protected String nombre;
    protected int puntosVida;
    protected ComportamientoHabilidad comportamiento;
    protected CatalogoHabilidades catalogo;

    public void recibirDanio(int danio){
        int vidaResultante = this.puntosVida - danio;
        this.puntosVida = vidaResultante > 0 ? vidaResultante : 0;
    }

    public void adquirirPoder(){
        List<ComportamientoHabilidad> opciones = catalogo.getHabilidades();
        this.comportamiento = opciones.get(new Random().nextInt(opciones.size()));
    }
  
    public boolean estaVivo(){
        return this.puntosVida > 0;
    }

    public ComportamientoHabilidad getComportamiento() {
        return this.comportamiento;
    }

    public String getNombre() {
        return this.nombre;
    }

    public int getPuntosVida() {
        return this.puntosVida;
    }



    public abstract String atacar();
    public abstract String defender();
}
