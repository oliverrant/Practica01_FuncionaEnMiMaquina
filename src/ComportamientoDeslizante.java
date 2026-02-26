public class ComportamientoDeslizante implements ComportamientoHabilidad {
    
    @Override
    public String atacar(String nombreAtacante, String nombreObjetivo){
        return nombreAtacante + " le lanza su zapato a " + nombreObjetivo;
    }

    @Override
    public String defender(String nombrePersonaje){
        return nombrePersonaje + " crea un escudo con su mugre";
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
