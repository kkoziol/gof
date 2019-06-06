package pl.kk.pilot.comands.garaz;

import pl.kk.pilot.comands.Command;
import pl.kk.pilot.garaz.Garaz;

public class CommandGarazZamknijDrzwi implements Command {
    public void execute() {
        Garaz.instance().drzwiDol();
    }

    public String getOpis() {
        return "Garaż zamknij";
    }
}
