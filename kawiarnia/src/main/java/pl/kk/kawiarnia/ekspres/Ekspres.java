package pl.kk.kawiarnia.ekspres;

import pl.kk.kawiarnia.napoje.Napoj;

public abstract class Ekspres {

    public final Napoj dajNapoj() {
        Napoj napoj;
        //krok1
        ugotujPlyn();
        //krok2
        napoj = zrobNapoj();
        //krok3
        napoj = dodajDodatki(napoj);
        //krok4
        nalejDoPojemnika();
        return napoj;
    }
	//Kroki kolejne algorytmu
    protected abstract void ugotujPlyn();

    protected abstract Napoj zrobNapoj();

    protected abstract Napoj dodajDodatki(Napoj napoj);

    protected abstract void nalejDoPojemnika();

}
