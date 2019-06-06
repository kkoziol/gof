package pl.kk.pilot.comands.menu;

import pl.kk.pilot.comands.Command;

public interface MenuPilota {
	String getOpis();
	public void wyswietlMenu();
	Command getCommandForKey(String upperCase);
}
