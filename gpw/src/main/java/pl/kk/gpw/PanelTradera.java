package pl.kk.gpw;


public final class PanelTradera {

	private static GpwServer GPW_SERVER = new GpwServer();

	private static final int ILE_POZYCJI = 51;

	private PanelTradera(GpwServer server) {
	}

	public static void main(String[] args) {

		new PanelTradera(PanelTradera.GPW_SERVER);

		for (int i = 0; i < ILE_POZYCJI; i++) {
			PanelTradera.GPW_SERVER.symulujTransakcje();
		}

	}
}
