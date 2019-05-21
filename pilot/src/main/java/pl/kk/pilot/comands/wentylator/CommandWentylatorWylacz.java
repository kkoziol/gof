package pl.kk.pilot.comands.wentylator;

import pl.kk.pilot.comands.Command;
import pl.kk.pilot.wentylator.Wentylator;

public class CommandWentylatorWylacz implements Command {
    public void execute() {
        Wentylator.instance().wylacz();
    }

    public String getOpis() {
        return "Wentylator wyłącz";
    }
}
