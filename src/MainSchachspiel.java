public class MainSchachspiel {

	public static void main(String[] args) {
		FigurAllgemein k= new FigurAllgemein(EFiguren.KOENIG, 10);
		FigurAllgemein d= new FigurAllgemein(EFiguren.DAME, 10);
		FigurAllgemein l= new FigurAllgemein(EFiguren.LAUFER, 7);
		l.ausgabe();
		FigurAllgemein s= new FigurAllgemein(EFiguren.SPRINGER, 7);
		FigurAllgemein b= new FigurAllgemein(EFiguren.BAUER, 5);
		Brett x = new Brett();
		x.hallo();
	}

}
