public class ComportamientoZapato implements ComportamientoHabilidad{
    
    @Override
    public String atacar(String nombreAtacante, String nombreObjetivo){
        return nombreAtacante + " le lanza su zapato a " + nombreObjetivo;
    }

    @Override
    public String defender(String nombrePersonaje){
        return nombrePersonaje + " le lanza su zapato también xd";
    }
    
    @Override
    public int getDanio(){
        return 5;
    }

    @Override
    public int getDefensa(){
        return 5;
    }
}