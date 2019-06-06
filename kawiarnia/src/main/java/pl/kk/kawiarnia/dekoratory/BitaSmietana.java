package pl.kk.kawiarnia.dekoratory;

import pl.kk.kawiarnia.napoje.Napoj;

public class BitaSmietana extends NapojDekorator {
    
	private static final double CENA_DODATKU = 2.50;
    private static final String OPIS_DODATKU = " z bitą śmietaną";

    public BitaSmietana(Napoj napoj) {
        super(napoj);
        System.out.println("Dodaję bitą śmietanę  (cena " + CENA_DODATKU + " zł)");
    }

    public String getNazwa() {
        return getNapoj().getNazwa() + OPIS_DODATKU;
    }

    public double getCena() {
        return getNapoj().getCena() + CENA_DODATKU;
    }
    
	@Override
	public String toString() {
		return "BS [nazwa()=" + getNazwa() + ", cena=" + getCena() + "]";
	}
}
