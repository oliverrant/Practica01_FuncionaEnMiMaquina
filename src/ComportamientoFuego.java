public class ComportamientoFuego implements ComportamientoHabilidad {
    @Override
    public String atacar(String nombreAtacante, String nombreObjetivo){
        return nombreAtacante + " le lanza bolas de fuego a " + nombreObjetivo;
    }

    @Override
    public String defender(String nombrePersonaje){
        return nombrePersonaje + " crea un escudo impenetrable con su mugre de no bañarse hace 99 años";
    }
    
    @Override
    public int getDanio(){
        return 10;
    }

    @Override
    public int getDefensa(){
        return 7;
    }
}
