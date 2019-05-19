package pl.kk.chinese;


import pl.kk.fso.Fabryka;
import pl.kk.fso.Thing;
import pl.kk.fso.car.Car;

public class ChineseFactory {
    private Thing toClone;

    public void setProductionLine(Thing thing) {
        toClone = thing;
    }

    public Thing produceNextItem() {
        return toClone.clone();
    }

    public static void main(String[] args) {
        ChineseFactory factory = new ChineseFactory();

        Fabryka fabryka = new Fabryka();


        System.out.println("-----------------------");
        long start = System.nanoTime();
        Car car = fabryka.kupSedana();
        System.out.println("Produkcja pierwszego cara:" + (System.nanoTime() - start));
        System.out.println(car);

        start = System.nanoTime();
        car = fabryka.kupSedana();
        System.out.println("Produkcja drugiego cara:" + (System.nanoTime() - start));
        System.out.println(car);

        System.out.println("Jeden z nich trafia do kraju na dalekim wschodzie...");
        start = System.nanoTime();
        factory.setProductionLine(car);
        Thing[] produkcja = new Thing[5];
        for (int i = 0; i < 5; i++)
            produkcja[i] = factory.produceNextItem();
        long duration = System.nanoTime() - start;
        System.out.println("Klon 5 carów:" + duration + " srednio na jeden:" + duration / 5);
        
        for (int i = 0; i < produkcja.length; i++) {
            System.out.println(produkcja[i]);
        }
    }
}