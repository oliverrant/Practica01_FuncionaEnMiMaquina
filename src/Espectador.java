import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Espectador del combate. Cada espectador genera su propia bitácora.
 */
public class Espectador implements ObserverCombate {
    private final int id;
    private final Personaje favorito;
    private final BufferedWriter out;

    /**
     * @param id identificador del espectador
     * @param favorito personaje favorito
     * @param carpetaLogs carpeta donde se guardará la bitácora
     */
    public Espectador(int id, Personaje favorito, String carpetaLogs) {
        this.id = id;
        this.favorito = favorito;

        try {
            File dir = new File(carpetaLogs);
            if (!dir.exists()) dir.mkdirs();

            String filename = carpetaLogs + File.separator + "espectador_" + id + ".txt";
            this.out = new BufferedWriter(new FileWriter(filename, false));
            escribirLinea("Espectador #" + id + " | Favorito: " + favorito.getNombre());
        } catch (IOException e) {
            throw new RuntimeException("No se pudo crear la bitácora del espectador " + id, e);
        }
    }

    public int getId() {
        return id;
    }

    public Personaje getFavorito() {
        return favorito;
    }

    @Override
    public void onEvento(EventoCombate evento) {
        escribirLinea(evento.toString());
    }

    @Override
    public void onFinCombate(Personaje ganador, Personaje favorito) {
        if (ganador == null) {
            escribirLinea("FIN: No hubo ganador (empate o error).");
        } else if (ganador == favorito) {
            escribirLinea("FIN: ¡GANÓ MI FAVORITO! (" + favorito.getNombre() + ")");
        } else {
            escribirLinea("FIN: Perdió mi favorito (" + favorito.getNombre() + "). Ganó: " + ganador.getNombre());
        }
        cerrar();
    }

    private void escribirLinea(String s) {
        try {
            out.write(s);
            out.newLine();
            out.flush();
        } catch (IOException e) {
            throw new RuntimeException("Error escribiendo bitácora del espectador " + id, e);
        }
    }

    private void cerrar() {
        try {
            out.flush();
            out.close();
        } catch (IOException e) {
            // no reventamos el programa por esto
        }
    }
}
