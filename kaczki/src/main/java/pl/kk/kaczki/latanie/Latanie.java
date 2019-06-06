package pl.kk.kaczki.latanie;

public interface Latanie {
    void lataj();

    static Latanie dajLatanie(boolean umieLatac) {
        if (umieLatac) {
            return new Latajaca();
        } else {
            return new Nielot();
        }
    }
}
