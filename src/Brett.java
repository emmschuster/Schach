public class Brett {
	private int anzF = 8;
	FigurAllgemein[][] br;
	EFarbe s=EFarbe.SCHWARZ;
	EFarbe w=EFarbe.WEISS;

	public Brett(int x) {
		br = new FigurAllgemein[x][x];
	}

	public void befuellen(FigurAllgemein a, int b, int c) {
		try {
			if (pureufen(b, c)) {
				System.out.println(b+" x "+c+" ist schon besetzt"); return;
			}
			br[b][c] = a;
			System.out.println("Befuellung erfolgreich von feld "+b+" x "+c);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Dein Feld existiert nicht, da das Feld nur " + anzF + "x" + anzF + " gro� ist");
		}
	}

	private boolean pureufen(int b, int c) {
		if (br[b][c] == null) {
			return false;
		} else {
			return true;
		}
	}

	public int anzInsgFiguren() {
		int numberOfPieces = anzInsgFiguren(s) + anzInsgFiguren(w);
		return numberOfPieces;
	}
	public int anzInsgFiguren(EFarbe ef) {
		int anz = 0;
		for (int i = 0; i < br.length; i++) {
			for (int j = 0; j < br[i].length; j++) {
				if (br[i][j] != null && br[i][j].fab == ef) {
					anz++;
				}
			}
		}
		return anz;
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
