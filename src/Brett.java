public class Brett {
	private int anzF=8;
	EFarbe [] [] br;
	EFarbe s,w;
	public Brett() {
		s=EFarbe.SCHWARZ;
		w=EFarbe.WEISS;
		br = new EFarbe [2] []; 
		br [0] = new EFarbe [anzF];
		br [1] = new EFarbe [anzF];	
		farbigMachen();
//		besetzt(brett[0][0]);
	}

	public void hallo() {
		System.out.println("hallo");
	}
	
	private void farbigMachen() {
		for(int i = 0; i<anzF; i=i+2) {
			br [0] [i] = s;
		}
		for(int i=1; i <=anzF; i=i+2) {
			br [1] [i] =w;
		}
	}
}
