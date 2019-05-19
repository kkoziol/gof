package pl.kk.fso;

public class Thing implements Cloneable {

    @Override
    public Thing clone() {
        Thing clone = null;
        try {
            clone = (Thing) super.clone();
            // here make deep copy for mutable objects
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return clone;
    }

}
