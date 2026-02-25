import java.time.LocalDateTime;

/**
 * Evento inmutable del combate. Se usa para notificar a los Observers.
 */
public final class EventoCombate {
    private final EventoTipo tipo;
    private final String mensaje;
    private final LocalDateTime timestamp;

    public EventoCombate(EventoTipo tipo, String mensaje) {
        this.tipo = tipo;
        this.mensaje = mensaje;
        this.timestamp = LocalDateTime.now();
    }

    public EventoTipo getTipo() {
        return tipo;
    }

    public String getMensaje() {
        return mensaje;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    @Override
    public String toString() {
        return "[" + timestamp + "] " + tipo + " :: " + mensaje;
    }
}

