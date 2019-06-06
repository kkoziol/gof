package pl.kk.pilot.comands.tv;

import pl.kk.pilot.comands.Command;
import pl.kk.pilot.tv.Telewizor;

public class CommandTelewizorWlacz implements Command {
    public void execute() {
        Telewizor.instance().wlacz();
    }

    public String getOpis() {
        return "Włącz telewizor";
    }
}
