public class MainSchachspiel {

	public static void main(String[] args) {
//		EFarbe xfarbe = new EFarbe();	//WARUMM EGHT DES NED
//		xfarbe.vorhandeneFarben();
		FigurAllgemein k= new FigurAllgemein(EFiguren.KOENIG, 10, EFarbe.SCHWARZ);
		FigurAllgemein d= new FigurAllgemein(EFiguren.DAME, 10, EFarbe.WEISS);
		FigurAllgemein l= new FigurAllgemein(EFiguren.LAUFER, 7, EFarbe.SCHWARZ);
//		l.ausgabe();
		FigurAllgemein s= new FigurAllgemein(EFiguren.SPRINGER, 7, EFarbe.WEISS);
		FigurAllgemein b= new FigurAllgemein(EFiguren.BAUER, 5, EFarbe.SCHWARZ);
		
		Brett x = new Brett(8);
		x.befuellen(k, 2, 2);
		x.befuellen(s, 5, 5);
		x.befuellen(l, 7, 6);
		x.befuellen(b, 2, 2);
//		x.befuellen(d, 3, 10);	YEAH FEHLERMELDUNG GEHT
	}
}
