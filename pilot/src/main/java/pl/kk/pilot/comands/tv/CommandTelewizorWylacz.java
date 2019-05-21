package pl.kk.pilot.comands.tv;

import pl.kk.pilot.comands.Command;
import pl.kk.pilot.tv.Telewizor;

public class CommandTelewizorWylacz implements Command {
    public void execute() {
        Telewizor.instance().wylacz();
    }

    public String getOpis() {
        return "Wyłącz telewizor";
    }
}
