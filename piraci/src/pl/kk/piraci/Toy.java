package pl.kk.piraci;

class Toy extends Thing {
    String nazwa;
    
    public Toy(String nazwa) {
        super();
        this.nazwa = nazwa;
    }

    public String getNazwa() {
        return nazwa;
    }
}