package pl.kk.kolednicy.osiedle;

import pl.kk.kolednicy.visitor.Visitor;

import java.util.ArrayList;
import java.util.List;

public class Blok implements Visitable {
    List<Visitable> mieszkania = new ArrayList<>();

    public Blok() {
        //zeby bylo prosciej tutaj soebi zrobie recznie mieszkania...
        mieszkania.add(new Apartament());
        mieszkania.add(new Mieszkanie());
        mieszkania.add(new Mieszkanie());
        mieszkania.add(new Mieszkanie());
        mieszkania.add(new Apartament());
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
        for (Visitable visitable : mieszkania) {
            visitable.accept(visitor);
        }
    }

    @Override
    public boolean pukPukMogeWejsc() {
        return true;
    }
}
