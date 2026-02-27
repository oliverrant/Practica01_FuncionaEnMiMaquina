/**
 * Implementación del catálogo de habilidades para Dittuu.
 * 
 * Proporciona la lista de habilidades disponibles
 * que pueden ser utilizadas por los personajes.
 */

import java.util.List;

public class CatalogoDittuu implements CatalogoHabilidades {
   
    /**
     * Devuelve la lista de habilidades disponibles en este catálogo.
     *
     * @return lista de comportamientos de habilidad
     */
    @Override
    public List<ComportamientoHabilidad> getHabilidades() {
        return List.of(new ComportamientoBruja(), new ComportamientoFuego(), new ComportamientoZapato());
    }
    
}
