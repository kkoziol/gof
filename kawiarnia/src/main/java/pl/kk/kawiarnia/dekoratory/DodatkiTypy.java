package pl.kk.kawiarnia.dekoratory;

import pl.kk.kawiarnia.napoje.Napoj;

public enum DodatkiTypy {
    Cukier {
        @Override
        public Napoj dodaj(Napoj napoj) {
            return new Cukier(napoj);
        }
    }, Mleko {
        @Override
        public Napoj dodaj(Napoj napoj) {
            return new Mleko(napoj);
        }
    }, BitaSmietana {
        @Override
        public Napoj dodaj(Napoj napoj) {
            return new BitaSmietana(napoj);
        }
    };

    public abstract Napoj dodaj(Napoj napoj);
}