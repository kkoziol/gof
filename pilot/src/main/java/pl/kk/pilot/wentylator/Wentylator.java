package pl.kk.pilot.wentylator;


public final class Wentylator {

    private Wentylator() {
        System.out.println("Tworzę sprzęt Wentylator");
    };

    public void wlacz() {
        System.out.println("Włączam i ustawiam obroty1");
    }

    public void wylacz() {
        System.out.println("Wyłączam wentylator");
    }

    public void obroty1() {
        System.out.println("Ustawiam obroty na 1");
    }

    public void obroty2() {
        System.out.println("Ustawiam obroty na 2");
    }

    public void obroty3() {
        System.out.println("Ustawiam obroty na 3");
    }
}
