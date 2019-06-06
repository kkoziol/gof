package pl.kk.kaczki;


import pl.kk.kaczki.kwakanie.Niemowa;

import java.util.ArrayList;
import java.util.List;

public class Symulator {

    public static void main(String[] args) {

        Kaczka dzika = new DzikaKaczka("dziwaczka");

        dzika.kwacz();
        dzika.lataj();
        dzika.wyswietl();

        Kaczka gumowa = new GumowaKaczka("żółta");
        Kaczka drewniana = new DrewnianaKaczka("Dębowa");
        Kaczka mandarynka = new MandarynkaKaczka("samiec");

        List<Kaczka> kaczki = new ArrayList<Kaczka>();
        kaczki.add(dzika);
        kaczki.add(gumowa);
        kaczki.add(drewniana);
        kaczki.add(mandarynka);

        for (Kaczka kaczka : kaczki) {
            kaczka.wyswietl();
            kaczka.lataj();
            kaczka.plywaj();
            kaczka.kwacz();
        }
        System.out.println("-------------------------------");
        gumowa.kwacz();

        gumowa.setKwakanie(new Niemowa());

        gumowa.kwacz();

    }

}
