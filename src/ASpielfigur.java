abstract class ASpielfigur {

	public EFiguren fig;
	private int w;
	public EFarbe fab;

	ASpielfigur(EFiguren x,int wert, EFarbe f) {
		fig=x;
		w=wert;
		fab=f;
	}
	
	abstract void wert();
	
	public void ausgabe() {
		System.out.print(" dem/der "+fig+", welcher/welche ");
		if (w==10) {
			System.out.print("viel wert");
		}
		if (w==7) {
			System.out.print("m‰ﬂig viel wert");
		}
		if (w==5) {
			System.out.print("ned so viel wert");
		}
		System.out.println(" ist und hat die Farbe "+fab+" hat");
	}
}
