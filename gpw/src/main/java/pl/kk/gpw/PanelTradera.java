package pl.kk.gpw;


public final class PanelTradera {

	private static ServerDanychGieldowych GPW_SERVER = new GpwServer();
	private static ServerDanychGieldowych GPW_SERVER_KONTROLA_ABONAMENTU = new GpwServerKontrolaAbonamentu(GPW_SERVER);
//	private static ServerDanychGieldowych GPW_SERVER_RANDOM = new GpwServerGenerator();

	private final WyswietlaczTikow wyswietlaczTikow = new WyswietlaczTikow();
	private final WyswietlProcentZmiany wyswietlProcentZmiany = new WyswietlProcentZmiany();
	private final WyswietlSrednia3Ostatnie wyswietlSrednia3Ostatnie = new WyswietlSrednia3Ostatnie();

	private static final int ILE_POZYCJI = 51;

	private PanelTradera(ServerDanychGieldowych server) {
	    server.addObserver(wyswietlaczTikow);
	    server.addObserver(wyswietlProcentZmiany);
		server.addObserver(wyswietlSrednia3Ostatnie);
	}

	public static void main(String[] args) {

//		new PanelTradera(PanelTradera.GPW_SERVER);
//		new PanelTradera(PanelTradera.GPW_SERVER_RANDOM);

		System.out.println("-------------- z abonamentem");
		new PanelTradera(PanelTradera.GPW_SERVER_KONTROLA_ABONAMENTU);

		for (int i = 0; i < ILE_POZYCJI; i++) {
			PanelTradera.GPW_SERVER.symulujTransakcje();
//			PanelTradera.GPW_SERVER_KONTROLA_ABONAMENTU.symulujTransakcje();
//			PanelTradera.GPW_SERVER_RANDOM.symulujTransakcje();
		}

	}
}
