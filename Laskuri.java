package simulaattori;

public class Laskuri {

    private static double promillet;
    private static int valinnat;

    public static int getValinnat() {
        return valinnat;
    }

    public static double getPromillet() {
        return promillet;
    }

    public Laskuri() {
        promillet = 0.0;
        valinnat = 0;
    }

    public double lisääPromille(double prom) {
        promillet += prom;
        return promillet;
    }

    public Laskuri(double promillet) {
        this.promillet = promillet;
    }

    public double vähennäPromille(double prom) {
        if (promillet >= 0.3) {
            promillet -= prom;
        }
        return promillet;
    }

    public double nollaaPromille(double prom) {
        promillet = 0.0;

        return promillet;

    }

    public int lisääValinta() {
        valinnat++;
        return valinnat;
    }
}
