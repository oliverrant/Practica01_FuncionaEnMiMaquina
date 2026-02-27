/**
 * Implementación del catálogo de habilidades para MeganMan.
 * 
 * Proporciona la lista de habilidades disponibles
 * que pueden ser utilizadas por los personajes.
 */

import java.util.List;

public class CatalogoMeganMan implements CatalogoHabilidades {
    
    /**
     * Devuelve la lista de habilidades disponibles en este catálogo.
     *
     * @return lista de comportamientos de habilidad
     */
    @Override
    public List<ComportamientoHabilidad> getHabilidades() {
        return List.of(new ComportamientoElectrico(), new ComportamientoProyectil(), new ComportamientoHipnotizar());
    }

}
