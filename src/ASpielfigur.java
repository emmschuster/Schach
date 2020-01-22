abstract class ASpielfigur {

	private EFiguren fig;
	private int w;

	ASpielfigur(EFiguren x,int wert) {
		fig=x;
		w=wert;
	}
	
	abstract void wert();
	
	public void ausgabe() {
		System.out.print("Der/Die "+fig+" ist ");
		if (w==10) {
			System.out.print("viel wert");
		}
		if (w==7) {
			System.out.print("m‰ﬂig viel wert");
		}
		if (w==5) {
			System.out.print("ned so viel wert");
		}
	}
}
