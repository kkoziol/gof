package pl.kk.pilot.comands.tv;

import pl.kk.pilot.comands.Command;
import pl.kk.pilot.tv.Telewizor;

public class CommandTelewizorKanalPlus implements Command {
    public void execute() {
        Telewizor.instance().kanalPlus();;
    }

    public String getOpis() {
        return "Telewizor kanał ++";
    }
}
