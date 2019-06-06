package pl.kk.kaczki;


import pl.kk.kaczki.kwakanie.Niemowa;
import pl.kk.kaczki.latanie.Nielot;

public class DrewnianaKaczka extends Kaczka {

    public DrewnianaKaczka(String nazwa) {
        super("Drewniana:"+nazwa, new Nielot(), new Niemowa());
    }

}
