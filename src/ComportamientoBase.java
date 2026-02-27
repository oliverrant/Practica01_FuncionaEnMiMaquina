public class ComportamientoBase implements ComportamientoHabilidad{
    
    private String nombre = "Habilidades Básicas";
   
     @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public String atacar(String nombreAtacante, String nombreObjetivo) {
        return nombreAtacante + " lanza un ataque básico a " + nombreObjetivo;
    }

    @Override
    public String defender(String nombrePersonaje) {
        return nombrePersonaje + " se defiende de forma básica";
    }

    @Override
    public int getDanio() {
        return 2;
    }

    @Override
    public int getDefensa() {
        return 1;
    }
}
