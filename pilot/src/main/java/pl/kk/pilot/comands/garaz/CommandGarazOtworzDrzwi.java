package pl.kk.pilot.comands.garaz;

import pl.kk.pilot.comands.Command;
import pl.kk.pilot.garaz.Garaz;

public class CommandGarazOtworzDrzwi implements Command {
    public void execute() {
        Garaz.instance().drzwiGora();
    }

    public String getOpis() {
        return "Garaż otwórz";
    }
}
