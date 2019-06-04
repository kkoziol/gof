package pl.kk.kawiarnia.ekspres;

import pl.kk.kawiarnia.dekoratory.Mleko;
import pl.kk.kawiarnia.napoje.Kawa;
import pl.kk.kawiarnia.napoje.Napoj;

public class EkspresKawa extends Ekspres {
    private final Napoj k = new Kawa();

    @Override
    protected Napoj zrobNapoj() {
        System.out.println("Robię napój - Kawa  (cena " + k.getCena() + " zł)");
        return k;
    }

    @Override
    protected void nalejDoPojemnika() {
        System.out.println("Nalewam do filiżanki");
    }

    @Override
    protected void ugotujPlyn() {
        System.out.println("Gotuję wodę...");
    }

	@Override
	protected Napoj dodajDodatki(Napoj napoj) {
		return new Mleko(napoj);
	}
}
