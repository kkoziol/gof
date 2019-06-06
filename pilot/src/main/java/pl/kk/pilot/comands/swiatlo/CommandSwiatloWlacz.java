package pl.kk.pilot.comands.swiatlo;


import pl.kk.pilot.comands.Command;
import pl.kk.pilot.swiatlo.Swiatlo;

public class CommandSwiatloWlacz implements Command {
    public void execute() {
        Swiatlo.instance().wlacz();
    }

    public String getOpis() {
        return "Światło włącz";
    }
}
