public class ComportamientoProyectil implements ComportamientoHabilidad {
    
    private String nombre = "Habilidades Proyectil";
   
     @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public String atacar(String nombreAtacante, String nombreObjetivo){
        return nombreAtacante + " le lanza un proyectil (grande) a " + nombreObjetivo;
    }

    @Override
    public String defender(String nombrePersonaje){
        return nombrePersonaje + " corre en círculos";
    }
    
    @Override
    public int getDanio(){
        return 6;
    }

    @Override
    public int getDefensa(){
        return 1;
    }
}
