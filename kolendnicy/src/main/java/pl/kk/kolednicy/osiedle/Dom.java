package pl.kk.kolednicy.osiedle;

import pl.kk.kolednicy.visitor.Visitor;

import java.util.Random;

public class Dom implements Visitable {
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
    @Override
    public boolean pukPukMogeWejsc() {
        return new Random().nextBoolean();
    }

    public boolean przegladKomina() {
        return new Random().nextBoolean();
    }

    public int coLaska() {
        return (int) (new Random().nextDouble()*200);
    }
}
