package pl.kk.gpw;

public final class GpwServer {

    private final Tik[] tiki;
    private final int licznikMax = 10;
    private int licznik;

    public GpwServer() {
        tiki = new Tik[licznikMax];
        tiki[0] = new Tik("KGH", 10);
        tiki[1] = new Tik("FIS", 1);
        tiki[2] = new Tik("PKO", 100);
        tiki[3] = new Tik("PKO", 120);
        tiki[4] = new Tik("FIS", 1.1);
        tiki[5] = new Tik("KGH", 10.6);
        tiki[6] = new Tik("PKO", 123);
        tiki[7] = new Tik("PKN", 34.5);
        tiki[8] = new Tik("ATN", 21.5);
        tiki[9] = new Tik("KGH", 11.1);
    }

    private Tik pobierzTik() {
        if (licznik >= licznikMax) {
            licznik = 0;
        }
        return tiki[licznik++];
    }

    public void symulujTransakcje() {
        pobierzTik();
    }
}
