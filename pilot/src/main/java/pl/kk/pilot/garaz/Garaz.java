package pl.kk.pilot.garaz;

public final class Garaz {
	private static Garaz instance = new Garaz();

	private Garaz() {
		System.out.println("Tworzę sprzęt Garaz");
	};

	public static Garaz instance() {
		return instance;
	}

	public void drzwiDol() {
		System.out.println("Zamykam Garaż");
	}

	public void drzwiGora() {
		System.out.println("Otwieram Garaż");
	}
}
