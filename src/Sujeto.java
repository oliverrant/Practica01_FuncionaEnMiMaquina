public interface Sujeto {
    void registrarObservador(Observador o);
    void quitarObservador(Observador o);
    void notificarObservadores(String evento);
    void cerrar(String nombreGanador);
}
