/**
 * Implementación del catálogo de habilidades para Korby.
 * 
 * Proporciona la lista de habilidades disponibles
 * que pueden ser utilizadas por los personajes.
 */
import java.util.List;

public class CatalogoKorby implements CatalogoHabilidades{
    
    /**
     * Devuelve la lista de habilidades disponibles en este catálogo.
     *
     * @return lista de comportamientos de habilidad
     */

    @Override
    public List<ComportamientoHabilidad> getHabilidades() {
        return List.of(new ComportamientoCuchillo(), new ComportamientoBomba(), new ComportamientoSuenio());
    }

}
