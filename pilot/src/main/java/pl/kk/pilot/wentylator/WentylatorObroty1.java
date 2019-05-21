package pl.kk.pilot.wentylator;

public class WentylatorObroty1 implements WentylatorStan {

    private Wentylator wentylator;

	public WentylatorObroty1(Wentylator wentylator) {
    	this.wentylator = wentylator;
	}

	public WentylatorStan wlacz() {
        System.out.println("Nic nie robię");
        return this;
    }

    public WentylatorStan wylacz() {
        System.out.println("Wyłączam wentylator");
        return wentylator.WYLACZONY;
    }

    public WentylatorStan obroty1() {
        System.out.println("Nic nie robię");
        return this;
    }

    public WentylatorStan obroty2() {
        System.out.println("Zwiększam obroty na 2");
        return wentylator.OBROTY2;
    }

    public WentylatorStan obroty3() {
        System.out.println("Nic nie robię");
        return this;
    }
}
