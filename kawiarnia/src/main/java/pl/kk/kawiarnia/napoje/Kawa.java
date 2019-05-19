package pl.kk.kawiarnia.napoje;


public class Kawa implements Napoj {
    private static final double CENA_NAPOJU = 6.50;
    private static final String NAZWA_NAPOJU = "Kawa";

    public String getNazwa() {
        return NAZWA_NAPOJU;
    }

    public double getCena() {
        return CENA_NAPOJU;
    }

	@Override
	public String toString() {
		return "Kawa [nazwa()=" + getNazwa() + ", cena=" + getCena() + "]";
	}
    
    
}
