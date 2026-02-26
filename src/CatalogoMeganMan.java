import java.util.List;

public class CatalogoMeganMan implements CatalogoHabilidades {
    
    @Override
    public List<ComportamientoHabilidad> getHabilidades() {
        return List.of(new ComportamientoElectrico(), new ComportamientoProyectil(), new ComportamientoDeslizante());
    }

}
