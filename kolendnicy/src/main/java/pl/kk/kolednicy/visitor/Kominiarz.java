package pl.kk.kolednicy.visitor;

import pl.kk.kolednicy.osiedle.*;

public class Kominiarz implements Visitor{
    private int kalendarze;
    private int przeglady;

    @Override
    public void visit(Mieszkanie mieszkanie) {
        System.out.print("Kup kalendarz...");
        if (mieszkanie.kalendarzPotrzebny()) {
            kalendarze++;
            System.out.println("TAK");
        }else{
            System.out.println("NIE");
        }

    }

    @Override
    public void visit(Dom dom) {
        System.out.print("A może przegląd komina?...");
        if (dom.przegladKomina()) {
            przeglady++;
            System.out.println("TAK");
        }else{
            System.out.println("NIE");
        }
        //kalendarz w promocji...
        kalendarze++;
    }

    @Override
    public void visit(Apartament apartament) {
        System.out.print("Kup kalendarz...");
        if (apartament.mozePrzydalBySieKalendarz()) {
            kalendarze++;
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
    public void visit(Visitable visitable) {
        System.out.println("Kup kalendarz...");
        //a tu co? tej metody nie ma w interfejsie...
//        if (visitable.mozePrzydalBySieKalendarz()) {
//            kalendarze++;
//            System.out.println("TAK");
//        }else{
//            System.out.println("NIE");
//        }

    }

    @Override
    public void printStats() {
        System.out.println("Sprzedanych kalendarzy:" + kalendarze + " Umówionych przeglądów:" + przeglady);
    }
}
