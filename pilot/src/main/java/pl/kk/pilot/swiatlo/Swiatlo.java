package pl.kk.pilot.swiatlo;

public final class Swiatlo {
    private static Swiatlo instance = new Swiatlo();

    private Swiatlo() {
        System.out.println("Tworzę sprzęt Swiatlo");
    };

    public static Swiatlo instance() {
        return instance;
    }

    public void wlacz() {
        System.out.println("Włączam światło");
    }

    public void wylacz() {
        System.out.println("Wyłączam światło");
    }
}
