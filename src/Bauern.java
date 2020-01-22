
public class Bauern extends ASpielfigur{
	private int wertigkeit;
	Bauern(String name, int anzahl) {
		super(name, anzahl);
		setWertigkeit(anzahl);
	}

	void wert() {
		this.wertigkeit*=1;
	}

	public int getWertigkeit() {
		return wertigkeit;
	}

	public void setWertigkeit(int wertigkeit) {
		this.wertigkeit = wertigkeit;
	}

}
