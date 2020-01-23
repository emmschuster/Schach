public class Brett {
	private int anzF = 8;
//	EFarbe [] [] br;
//	EFarbe s,w;
	FigurAllgemein[][] br;

	public Brett(int x) {
//		s=EFarbe.SCHWARZ;
//		w=EFarbe.WEISS;
		br = new FigurAllgemein[x][x];
	}

	public void befuellen(FigurAllgemein a, int b, int c) {
		try {
			if (pureufen(b, c)) {
				br[b][c] = a;
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Dein Feld existiert nicht, da das Feld nur " + anzF + "x" + anzF + " groﬂ ist");
		}
	}

	private boolean pureufen(int b, int c) {
		if (br[b][c] == null) {
			return false;
		} else {
			return true;
		}
	}

//	public void farbigMachen() {
//		for(int i = 0; i<anzF; i=i+2) {
//			br [0] [i] = s;
//		}
//		for(int i=1; i <=anzF; i=i+2) {
//			br [1] [i] =w;
//		}
//	}

}
