public class ComportamientoBomba implements ComportamientoHabilidad{
   
    @Override
    public String atacar(String nombreAtacante, String nombreObjetivo){
        return nombreAtacante + " le lanza bombas (de agua) a " + nombreObjetivo;
    }

    @Override
    public String defender(String nombrePersonaje){
        return nombrePersonaje + " abre su paraguas";
    }
    
    @Override
    public int getDanio(){
        return 2;
    }

    @Override
    public int getDefensa(){
        return 10;
    }
}
