public class ComportamientoElectrico implements ComportamientoHabilidad {
    
    @Override
    public String atacar(String nombreAtacante, String nombreObjetivo){
        return nombreAtacante + " lanza rayos electricos a " + nombreObjetivo;
    }

    @Override
    public String defender(String nombrePersonaje){
        return nombrePersonaje + " se hace fantasma";
    }
    
    @Override
    public int getDanio(){
        return 10;
    }

    @Override
    public int getDefensa(){
        return 10;
    }
}
