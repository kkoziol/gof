package pl.kk.pilot.comands.tv;

import pl.kk.pilot.comands.Command;
import pl.kk.pilot.tv.Telewizor;

public class CommandTelewizorKanalMinus implements Command {
    public void execute() {
        Telewizor.instance().kanalMinus();
    }

    public String getOpis() {
        return "Telewizor kanał --";
    }
}
