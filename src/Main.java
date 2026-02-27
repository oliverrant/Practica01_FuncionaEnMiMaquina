import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random selector = new Random();
        int caso = selector.nextInt(3);

        if (caso == 0) ejecutarCombate(new Random(111));
        else if (caso == 1) ejecutarCombate(new Random(222));
        else ejecutarCombate(new Random(333));
    }

    static void ejecutarCombate(Random random) {
        Combate combate = ConfiguracionCombate.crearCombate(random);
        combate.iniciar();
    }
}
