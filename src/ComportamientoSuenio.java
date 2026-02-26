public class ComportamientoSuenio implements ComportamientoHabilidad{
    
    @Override
    public String atacar(String nombreAtacante, String nombreObjetivo){
        return nombreAtacante + " le canta una canción para dormir a " + nombreObjetivo;
    }

    @Override
    public String defender(String nombrePersonaje){
        return nombrePersonaje + " se tapa los oidos";
    }
    
    @Override
    public int getDanio(){
        return 4;
    }

    @Override
    public int getDefensa(){
        return 0;
    }
}
