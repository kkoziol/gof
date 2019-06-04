package pl.kk.kawiarnia;

import pl.kk.kawiarnia.dekoratory.BitaSmietana;
import pl.kk.kawiarnia.dekoratory.Cukier;
import pl.kk.kawiarnia.dekoratory.Mleko;
import pl.kk.kawiarnia.napoje.Czekolada;
import pl.kk.kawiarnia.napoje.Kawa;
import pl.kk.kawiarnia.napoje.Napoj;

public abstract class Kawiarnia {

	public static void main(String[] args) {

		Napoj kawa = new Kawa();
		System.out.println(kawa);

		// Zrobić kawę (late) z mlekiem i bitą smietaną
        kawa = new Mleko(kawa);
		System.out.println(kawa);
		kawa = new BitaSmietana(kawa);
		System.out.println(kawa);

		// Zrobić kawę z podwojnym cukrem
		kawa = new Kawa();
		kawa = new Cukier(kawa);
		System.out.println(kawa);
		kawa = new Cukier(kawa);
		System.out.println(kawa);

		System.out.println("-------- Czekolada --------");

		Napoj czekolada = new Czekolada();
		System.out.println(czekolada);

		czekolada = new BitaSmietana(czekolada);
		System.out.println(czekolada);
	}

}

//		System.out.println("----- Kawiarnia z enuma -----");
//		Napoj cos = new Kawa();
//		Napoj cos2 = DodatkiTypy.Mleko.dodaj(cos);
//		Napoj cos3 = DodatkiTypy.Cukier.dodaj(cos2);
//
//		System.out.println(cos);
//		System.out.println(cos3);
//
//		System.out.println("------- Template Metod -----");
//		Ekspres ekspres = new EkspresCzekolada();
//		Napoj napoj = ekspres.dajNapoj();
//		System.out.println(napoj);
//
//	}
//
//}
//
//