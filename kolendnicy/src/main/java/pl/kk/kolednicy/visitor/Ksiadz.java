package pl.kk.kolednicy.visitor;

import pl.kk.kolednicy.osiedle.*;

public class Ksiadz implements Visitor{
    private int odwiedziny;
    private double coLaska;

    @Override
    public void visit(Mieszkanie mieszkanie) {
        // a tu musi byc tak bo coLaska nie jest w interfejsie...
        //co jest słabe bo moze nie chce wolac tej metody jak nie bedzie kolendy???
        kolenduj(mieszkanie, mieszkanie.coLaska());

    }

    @Override
    public void visit(Dom dom) {
        kolenduj(dom, dom.coLaska());
    }

    @Override
    public void visit(Apartament apartament) {
        kolenduj(apartament, apartament.coLaska());
    }

    private void kolenduj(Visitable visitable, double kasa) {
        System.out.print("Kolenda...");
        if (visitable.pukPukMogeWejsc()) {
            odwiedziny++;
            System.out.println("TAK "+kasa);
            coLaska += kasa;
        }else{
            System.out.println("NIE");
        }
    }

    @Override
    public void visit(Blok blok) {
        System.out.println("Wchodzi do bloku");
    }

    @Override
    public void visit(Osiedle osiedle) {

    }

    @Override
    public void visit(Visitable visitable) {
        //a tu??? co jakas lipka?
    }

    @Override
    public void printStats() {
        System.out.println("Udanych odwiedzin:" + odwiedziny + " Kasa zebrana:"+coLaska);
    }
}
