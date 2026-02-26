import java.util.List;

public class CatalogoKorby implements CatalogoHabilidades{
    
    @Override
    public List<ComportamientoHabilidad> getHabilidades() {
        return List.of(new ComportamientoCuchillo(), new ComportamientoBomba(), new ComportamientoSuenio());
    }

}
