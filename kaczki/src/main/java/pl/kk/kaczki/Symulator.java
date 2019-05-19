package pl.kk.kaczki;


import java.util.ArrayList;
import java.util.List;

public class Symulator {

	public static void main(String[] args) {

		Kaczka dzika = new Kaczka(KaczkaTypy.Dzika,"dziwaczka");

		dzika.wyswietl();
		dzika.kwacz();
		dzika.lataj();

		Kaczka mandarynka = new Kaczka(KaczkaTypy.Mandarynka,"Kolorowy samiec jak sie patrzy");

		List<Kaczka> kaczki = new ArrayList<Kaczka>();
		kaczki.add(dzika);
		kaczki.add(mandarynka);

		for (Kaczka kaczka : kaczki) {
			kaczka.wyswietl();
			kaczka.plywaj();
			kaczka.kwacz();
			kaczka.lataj();
		}
		System.out.println("-------------------------------");
	}
}
