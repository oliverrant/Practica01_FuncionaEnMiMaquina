public interface ComportamientoHabilidad {
   
    String atacar(String nombreAtacante, String nombreObjetivo);
    String defender(String nombrePersonaje);
    int getDanio();
    int getDefensa();
    String getNombre();
}
