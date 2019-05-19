package pl.kk.pilot.tv;

public final class Telewizor {

	private final int MAX_VOLUME = 10;
	private final int MAX_KANAL = 10;

	private int currentKanal = 1;
	private int currentVolume = 5;

	public Telewizor() {
		System.out.println("Tworzę sprzęt Telewizor");
	};

	public void wlacz() {
		System.out.println("Włączam TV i ustawiam kanal 1");
		currentKanal = 1;
		currentVolume = 5;
	}

	public void wylacz() {
		System.out.println("Wyłączam Telewizor");
	}

	public void kanalPlus() {
		if (currentKanal < MAX_KANAL) {
			currentKanal++;
		} else {
			currentKanal = 1;
		}
		System.out.println("Aktualny kanał:" + currentKanal);
	}

	public void kanalMinus() {
		if (currentKanal > 1) {
			currentKanal--;
		} else {
			currentKanal = MAX_KANAL;
		}
		System.out.println("Aktualny kanał:" + currentKanal);
	}

	public void glosnoscPlus() {
		if (currentVolume < MAX_VOLUME) {
			currentVolume++;
		}
		System.out.println("Głośność:" + currentVolume);
	}

	public void glosnoscMinus() {
		if (currentVolume > 1) {
			currentVolume--;
		}
		System.out.println("Głośność:" + currentVolume);
	}
}
