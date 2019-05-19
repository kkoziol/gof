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

    public static void main(String[] args) {
        ChineseFactory factory = new ChineseFactory();


        long start = System.nanoTime();

        factory.setProductionLine(new RaceCar());
        for (int i = 1; i < 5; i++)
            System.out.println(factory.produceNextItem());
        factory.setProductionLine(new Bear());
        for (int i = 1; i < 5; i++)
            System.out.println(factory.produceNextItem());

        long duration = System.nanoTime() - start;
        System.out.println("Produkcja 10 zabawek:" + duration + " srednio na jedą:" + duration / 5);
    }
}