package pl.kk.kaczki;


public class Kaczka {
    private final String nazwa;
    private KaczkaTypy typ;

    public Kaczka(KaczkaTypy typ, String nazwa) {
        super();
        this.typ = typ;
        this.nazwa = nazwa;
    }

    public void kwacz() {
        System.out.println("Kwa Kwa!");
    }

    public void lataj() {
        System.out.println("Fruuuuuuu....");
    }

    public void wyswietl() {
        System.out.println(typ.name()+": Jestem " + nazwa);
    }

    public void plywaj() {
        System.out.println("Pływam sobie");
    }


}
