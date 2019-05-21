package pl.kk.kaczki;


import pl.kk.kaczki.kwakanie.Piskajaca;
import pl.kk.kaczki.latanie.Nielot;

public class GumowaKaczka extends Kaczka {

    public GumowaKaczka(String nazwa) {
        super("Gumowa:"+nazwa, new Nielot(), new Piskajaca());
    }
}
