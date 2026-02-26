public class ComportamientoCuchillo implements ComportamientoHabilidad  {
    
    @Override
    public String atacar(String nombreAtacante, String nombreObjetivo){
        return nombreAtacante + " le lanza varios cuchillos, uno tras otro, a " + nombreObjetivo;
    }

    @Override
    public String defender(String nombrePersonaje){
        return nombrePersonaje + " los esquiva";
    }
    
    @Override
    public int getDanio(){
        return 9;
    }

    @Override
    public int getDefensa(){
        return 3;
    }
}
