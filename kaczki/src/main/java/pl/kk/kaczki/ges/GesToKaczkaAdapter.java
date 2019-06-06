package pl.kk.kaczki.ges;

import pl.kk.kaczki.Kaczka;
import pl.kk.kaczki.kwakanie.Niemowa;
import pl.kk.kaczki.latanie.Nielot;

public class GesToKaczkaAdapter extends Kaczka {
    private Ges ges;

    public GesToKaczkaAdapter(Ges ges) {
        super("", new Nielot(), new Niemowa());
        this.ges = ges;
    }

    @Override
    public void wyswietl() {
        ges.wyswietlGes();
    }

    @Override
    public void plywaj() {
        ges.plywajPoGesiemu();
    }

    @Override
    public void lataj() {
        ges.latajPoGesiemu();
    }

    @Override
    public void kwacz() {
        ges.gegaj();
    }

    public Ges getGes() {
        return ges;
    }

    public void setGes(Ges ges) {
        this.ges = ges;
    }
}
