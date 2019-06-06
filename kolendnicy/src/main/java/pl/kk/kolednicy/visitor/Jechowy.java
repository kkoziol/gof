package pl.kk.kolednicy.visitor;

import pl.kk.kolednicy.osiedle.*;

public class Jechowy implements Visitor {

    private int odwiedziny;

    @Override
    public void visit(Mieszkanie mieszkanie) {
        System.out.print("Mozemy porozmawiac...");
        if (mieszkanie.pukPukMogeWejsc()) {
            odwiedziny++;
            System.out.println("TAK");
        }else{
            System.out.println("NIE");
        }

    }

    @Override
    public void visit(Dom dom) {
        System.out.print("Mozemy porozmawiac...");
        if (dom.pukPukMogeWejsc()) {
            odwiedziny++;
            System.out.println("TAK");
        }else{
            System.out.println("NIE");
        }
    }

    @Override
    public void visit(Apartament apartament) {
        System.out.print("Mozemy porozmawiac...");
        if (apartament.pukPukMogeWejsc()) {
            odwiedziny++;
            System.out.println("TAK");
        }else{
            System.out.println("NIE");
        }
    }

    @Override
    public void visit(Visitable visitable) {
        System.out.print("Mozemy porozmawiac...");
        if (visitable.pukPukMogeWejsc()) {
            odwiedziny++;
            System.out.println("TAK");
        }else{
            System.out.println("NIE");
        }
    }

    @Override
    public void visit(Blok blok) {

    }

    @Override
    public void visit(Osiedle osiedle) {

    }

    @Override
    public void printStats() {
        System.out.println("Udanych odwiedzin:" + odwiedziny);
    }
}
