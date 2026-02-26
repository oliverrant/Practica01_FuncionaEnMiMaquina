public class ComportamientoBruja implements ComportamientoHabilidad{
    
    @Override
    public String atacar(String nombreAtacante, String nombreObjetivo){
        return nombreAtacante + " le lanza un hechizo a " + nombreObjetivo + " y lo convierte en una rana";
    }

    @Override
    public String defender(String nombrePersonaje){
        return nombrePersonaje + " se come una hierba magica que es la cura";
    }
    
    @Override
    public int getDanio(){
        return 0;
    }

    @Override
    public int getDefensa(){
        return 0;
    }
}
