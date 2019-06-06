package pl.kk.pilot.comands;

import pl.kk.pilot.SprzetyFasade;

public class CommandWylaczWszystkoWyjezdzam implements Command {

    public void execute() {
        SprzetyFasade.wylaczWszystkoWyjezdzam();
    }

    public String getOpis() {
        return "Wylacz wszystko otwóż garaż";
    }
}
