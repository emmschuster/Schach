abstract class ASpielfigur {

	private String fig;
	private int anz;

	ASpielfigur(String name,int anzahl) {
		fig=name;
		anz=anzahl;
	}
	
	abstract void wert();
	
	public void ausgabe() {
		System.out.println("Von "+fig+" gibt es insgesamt "+anz+" pro Team");
	}
}
