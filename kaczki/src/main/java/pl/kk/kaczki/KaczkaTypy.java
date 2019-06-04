package pl.kk.kaczki;

import pl.kk.kaczki.ges.Ges;
import pl.kk.kaczki.ges.GesToKaczkaAdapter;
import pl.kk.kaczki.kwakanie.Niemowa;
import pl.kk.kaczki.latanie.Latanie;

public enum KaczkaTypy {
	Dzika{
		@Override
		public Kaczka dajKaczke(String name) {
			return new DzikaKaczka(name);
		}
	}, Mandarynka {
		@Override
		public Kaczka dajKaczke(String name) {
			return new MandarynkaKaczka(name);
		}
	}, Gumowa {
		@Override
		public Kaczka dajKaczke(String name) {
			return new GumowaKaczka(name);
		}
	}, Drewniana {
		@Override
		public Kaczka dajKaczke(String name) {
			return new DrewnianaKaczka(name);
		}
	},
	Ges{
		@Override
		public Kaczka dajKaczke(String name) {
			return new GesToKaczkaAdapter(new Ges(name));
		}
	},
	ZepsutaGumowa{
		@Override
		public Kaczka dajKaczke(String name) {
			GumowaKaczka gumowaKaczka = new GumowaKaczka(name);
			gumowaKaczka.setKwakanie(new Niemowa());
			gumowaKaczka.setLatanie(Latanie.dajLatanie(false));
			return gumowaKaczka;
		}
	};

	public abstract Kaczka dajKaczke(String name);
}
