import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ConfiguracionCombate {
   public static Combate crearCombate(Random random) {
        Korby korby = new Korby();
        MeganMan meganMan = new MeganMan();
        Dittuu dittuu = new Dittuu();

        List<Personaje> personajes = new ArrayList<>();
        personajes.add(korby);
        personajes.add(meganMan);
        personajes.add(dittuu);

        List<Observador> observadores = new ArrayList<>();
        observadores.add(new ObservadorConcreto("espectador123", korby));
        observadores.add(new ObservadorConcreto("espectador456", meganMan));
        observadores.add(new ObservadorConcreto("gamer99", dittuu));
        observadores.add(new ObservadorConcreto("jugador007", korby));

        SujetoConcreto sujetoConcreto = new SujetoConcreto(observadores);
        GestorCombate gestorCombate = new GestorCombate(personajes, random);

        return new Combate(sujetoConcreto, gestorCombate);
   } 
}
