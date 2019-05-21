package pl.kk.kaczki;


import pl.kk.kaczki.kwakanie.Kwaczka;
import pl.kk.kaczki.latanie.Latajaca;

public class MandarynkaKaczka extends Kaczka {

    public MandarynkaKaczka(String nazwa) {
        super("Mandarynka:"+nazwa, new Latajaca(), new Kwaczka());
    }
}
