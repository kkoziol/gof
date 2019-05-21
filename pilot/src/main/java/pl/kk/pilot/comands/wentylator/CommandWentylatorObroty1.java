package pl.kk.pilot.comands.wentylator;

import pl.kk.pilot.comands.Command;
import pl.kk.pilot.wentylator.Wentylator;

public class CommandWentylatorObroty1 implements Command {
    public void execute() {
        Wentylator.instance().obroty1();
    }

    public String getOpis() {
        return "Wentylator ustaw na obroty1";
    }
}
