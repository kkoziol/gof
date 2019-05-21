package pl.kk.pilot.comands.swiatlo;


import pl.kk.pilot.comands.Command;
import pl.kk.pilot.swiatlo.Swiatlo;

public class CommandSwiatloWylacz implements Command {
	public void execute() {
		Swiatlo.instance().wylacz();
	}

	public String getOpis() {
		return "Światło wyłącz";
	}
}
