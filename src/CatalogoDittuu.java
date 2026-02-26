import java.util.List;

public class CatalogoDittuu implements CatalogoHabilidades {
   
    @Override
    public List<ComportamientoHabilidad> getHabilidades() {
        return List.of(new ComportamientoBruja(), new ComportamientoFuego(), new ComportamientoZapato());
    }
    
}
