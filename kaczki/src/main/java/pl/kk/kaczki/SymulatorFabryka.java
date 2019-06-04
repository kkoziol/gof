package pl.kk.kaczki;

import pl.kk.kaczki.kwakanie.Niemowa;

import java.util.ArrayList;
import java.util.List;

public class SymulatorFabryka {

    public static void main(String[] args) {

        Kaczka dzika = Kaczka.dajKaczke(KaczkaTypy.Dzika, "dziwaczka");

        dzika.kwacz();
        dzika.lataj();
        dzika.wyswietl();

        Kaczka gumowa = Kaczka.dajKaczke(KaczkaTypy.Gumowa, "żółta");
        Kaczka drewniana = Kaczka.dajKaczke(KaczkaTypy.Drewniana, "Dębowa");
        Kaczka mandarynka = Kaczka.dajKaczke(KaczkaTypy.Mandarynka, "samiec");

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

		Kaczka gesAdapter =
		Kaczka.dajKaczke(KaczkaTypy.Ges, "dziką");

		kaczki.add(gesAdapter);

		gesAdapter.wyswietl();
		gesAdapter.lataj();
		gesAdapter.plywaj();
		gesAdapter.kwacz();

		Kaczka zepsuta = Kaczka.dajKaczke(KaczkaTypy.ZepsutaGumowa,"Nie piska :(");
		zepsuta.kwacz();

//        Przyklad na uzycie ala fabryk z enumem
		 Kaczka kaczka = KaczkaTypy.Drewniana.dajKaczke("Enumowata");
		 kaczka.wyswietl();
        System.out.println("-------------- z fabryki w enumie i interfejsie");
		 zepsuta = KaczkaTypy.ZepsutaGumowa.dajKaczke("zepsuta");
		 zepsuta.wyswietl();
		 zepsuta.kwacz();
		 zepsuta.lataj();
    }
}
