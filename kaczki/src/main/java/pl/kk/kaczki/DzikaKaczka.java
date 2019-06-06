package pl.kk.kaczki;

import pl.kk.kaczki.kwakanie.Kwaczka;
import pl.kk.kaczki.latanie.Latajaca;

public class DzikaKaczka extends Kaczka {

    public DzikaKaczka(String nazwa) {
        super("Dzika:" + nazwa, new Latajaca(), new Kwaczka());
    }
}
