public class ComportamientoHipnotizar implements ComportamientoHabilidad {
    
    @Override
    public String atacar(String nombreAtacante, String nombreObjetivo){
        return nombreAtacante + " hiptnotiza con serpientes a " + nombreObjetivo;
    }

    @Override
    public String defender(String nombrePersonaje){
        return nombrePersonaje + "parpadea muchas veces";
    }
    
    @Override
    public int getDanio(){
        return 9;
    }

    @Override
    public int getDefensa(){
        return 0;
    }
}
