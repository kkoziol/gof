package pl.kk.kolednicy.osiedle;

import pl.kk.kolednicy.visitor.Visitor;

import java.util.ArrayList;
import java.util.List;

public class Osiedle implements Visitable {

    List<Visitable> osiedle = new ArrayList<>();

    public Osiedle() {
        //zeby bylo prosciej tutaj soebi zrobie recznie mieszkania...
        osiedle.add(new Dom());
        osiedle.add(new Dom());
        Blok blok = new Blok();
        osiedle.add(blok);
        blok = new Blok();
        osiedle.add(blok);
        osiedle.add(new Dom());
        blok = new Blok();
        osiedle.add(blok);
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
        for (Visitable visitable : osiedle) {
            visitable.accept(visitor);
        }
    }

    //Wlasnie dlatego jest ta metoda dyskusyjna....
    @Override
    public boolean pukPukMogeWejsc() {
        return true;
    }
}
