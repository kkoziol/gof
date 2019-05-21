package pl.kk.pilot.comands.wentylator;

import pl.kk.pilot.comands.Command;
import pl.kk.pilot.wentylator.Wentylator;

public class CommandWentylatorWlacz implements Command {
    public void execute() {
        Wentylator.instance().wlacz();
    }

    public String getOpis() {
        return "Wentylator włącz";
    }
}
