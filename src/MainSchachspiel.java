public class MainSchachspiel {

	public static void main(String[] args) {
		System.out.println("SCHACH");
		System.out.println("~~~~~~");
		FigurAllgemein k= new FigurAllgemein(EFiguren.KOENIG, 10, EFarbe.SCHWARZ);
		FigurAllgemein d= new FigurAllgemein(EFiguren.DAME, 10, EFarbe.WEISS);
		FigurAllgemein l= new FigurAllgemein(EFiguren.LAUFER, 7, EFarbe.SCHWARZ);
		FigurAllgemein s= new FigurAllgemein(EFiguren.SPRINGER, 7, EFarbe.WEISS);
		FigurAllgemein b= new FigurAllgemein(EFiguren.BAUER, 5, EFarbe.SCHWARZ);
		FigurAllgemein t= new FigurAllgemein(EFiguren.TURM, 7, EFarbe.SCHWARZ);

		EFarbe w=EFarbe.WEISS;
		EFarbe sch=EFarbe.SCHWARZ;
		
		Brett x = new Brett(8);
		x.befuellen(k, 2, 2);
		k.ausgabe();
		x.befuellen(s, 5, 5);
		s.ausgabe();
		x.befuellen(l, 7, 6);
		l.ausgabe();
		x.befuellen(t, 4, 5);
		t.ausgabe();
//		x.befuellen(b, 2, 2);
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("So viele figuren stehen am brett : "+x.anzInsgFiguren());
		System.out.println("so viele sind davon weiss : "+x.anzInsgFiguren(w));
//		x.befuellen(d, 3, 10);	YEAH FEHLERMELDUNG GEHT
	}
}
