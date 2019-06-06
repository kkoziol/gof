package pl.kk.kaczki.ges;

public class Ges {
    private final String name;

    public Ges() {
        this.name = "Gęś";
    }

    public Ges(String nazwa) {
        this.name = nazwa;
    }

    public void gegaj() {
        System.out.println("Gę, gę");
    }

    public void wyswietlGes() {
        System.out.println("Jestem gęsią:" + name);
    }

    public void plywajPoGesiemu() {
        System.out.println("Pływam sobie gęsiowo");
    }

    public void latajPoGesiemu() {
        System.out.println("Latam sobie gęsiowo");
    }
}
