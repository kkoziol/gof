package pl.kk.pilot.comands.tv;


import pl.kk.pilot.comands.Command;
import pl.kk.pilot.tv.Telewizor;

public class CommandTelewizorGlosnoscMinus implements Command {

    public void execute() {
        Telewizor.instance().glosnoscMinus();
    }

    public String getOpis() {
        return "Telewizor głośność --";
    }
}
