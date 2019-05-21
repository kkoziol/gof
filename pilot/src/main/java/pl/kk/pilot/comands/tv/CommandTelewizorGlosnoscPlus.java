package pl.kk.pilot.comands.tv;

import pl.kk.pilot.comands.Command;
import pl.kk.pilot.tv.Telewizor;

public class CommandTelewizorGlosnoscPlus implements Command {

    public void execute() {
        Telewizor.instance().glosnoscPlus();
    }

    public String getOpis() {
        return "Telewizor głośność ++";
    }
}
