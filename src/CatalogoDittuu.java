import java.util.List;

public class CatalogoDittuu implements CatalogoHabilidades {
   
    @Override
    public List<ComportamientoHabilidad> getHabilidades() {
        return List.of(new ComportamientoBicho(), new ComportamientoFantasma(), new ComportamientoMagia());
    }
    
}
