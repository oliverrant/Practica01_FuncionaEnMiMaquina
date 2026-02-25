import java.util.Random;

public class Main {
    public static void main(String[] args) {
        // 3 casos de prueba distintos (puedes cambiar HP/seed)
        Caso[] casos = new Caso[] {
                new Caso(80, 80, 80, 123L),
                new Caso(64, 96, 72, 456L),
                new Caso(120, 60, 90, 789L)
        };

        Random rng = new Random();
        Caso elegido = casos[rng.nextInt(casos.length)];

        Personaje k = new Korby(elegido.hpKorby);
        Personaje m = new MeganMan(elegido.hpMeganMan);
        Personaje d = new Dittuu(elegido.hpDittuu);

        Combate combate = new Combate(k, m, d, elegido.seed);

        // 4 espectadores (ids + favorito)
        combate.registrarObserver(new Espectador(1, k, "logs"));
        combate.registrarObserver(new Espectador(2, m, "logs"));
        combate.registrarObserver(new Espectador(3, d, "logs"));
        combate.registrarObserver(new Espectador(4, k, "logs"));

        combate.ejecutar();
    }

    private static class Caso {
        final int hpKorby;
        final int hpMeganMan;
        final int hpDittuu;
        final long seed;

        Caso(int hk, int hm, int hd, long seed) {
            this.hpKorby = hk;
            this.hpMeganMan = hm;
            this.hpDittuu = hd;
            this.seed = seed;
        }
    }
}
