/**
 * Interfaz Observer (patrón Observer).
 */
public interface ObserverCombate {
    void onEvento(EventoCombate evento);
    void onFinCombate(Personaje ganador, Personaje favorito);
}
