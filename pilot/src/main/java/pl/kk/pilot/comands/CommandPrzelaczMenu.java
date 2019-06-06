package pl.kk.pilot.comands;

import pl.kk.pilot.Pilot;

public class CommandPrzelaczMenu implements Command {

	public Pilot pilot=null;

	public CommandPrzelaczMenu() {
	}

	public CommandPrzelaczMenu(Pilot pilot) {
		this.pilot = pilot;
	}

	public void execute() {
		pilot.przelaczMenu();
	}

	public String getOpis() {
		return "Przełaczenie menu";
	}
}