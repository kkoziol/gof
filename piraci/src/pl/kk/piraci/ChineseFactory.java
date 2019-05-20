package pl.kk.piraci;

class RaceCar extends Toy {
    public RaceCar() {
        super("Wyscigówa");
        System.out.println("-----------------------");
    }

    @Override
    public String toString() {
        return "RaceCar [nazwa=" + nazwa + "]" + super.toString();
    }
}

class Bear extends Toy {
    public Bear() {
        super("Misio");
        System.out.println("-----------------------");
    }

    @Override
    public String toString() {
        return "Bear [nazwa=" + nazwa + "]" + super.toString();
    }
}

public class ChineseFactory {
    private Toy toClone;

    public void setProductionLine(Toy toy) {
        toClone = toy;
    }

    public Thing produceNextItem() {
        return new Toy(toClone.getNazwa());
    }

    public Thing cloneNextItem() {
        return toClone.clone();
    }

    public static void main(String[] args) {
        ChineseFactory factory = new ChineseFactory();



        factory.setProductionLine(new RaceCar());
        long start = System.nanoTime();
        for (int i = 1; i <= 10; i++)
            factory.produceNextItem();
        long duration = System.nanoTime() - start;
        System.out.println("Produkcja  10 RaceCar:" + duration + " srednio na jedą:" + duration / 10);
        start = System.nanoTime();
        for (int i = 1; i <= 10; i++)
            factory.cloneNextItem();
        duration = System.nanoTime() - start;
        System.out.println("Klonowanie 10 RaceCar:" + duration + " srednio na jedą:" + duration / 10);

        factory.setProductionLine(new Bear());
        start = System.nanoTime();
        for (int i = 1; i <= 10; i++)
            factory.produceNextItem();
        duration = System.nanoTime() - start;
        System.out.println("Produkcja  10 Misiów:" + duration + " srednio na jedą:" + duration / 10);
        start = System.nanoTime();
        for (int i = 1; i <= 10; i++)
            factory.cloneNextItem();
        duration = System.nanoTime() - start;
        System.out.println("Klonowanie 10 Misiów:" + duration + " srednio na jedą:" + duration / 10);

    }
}