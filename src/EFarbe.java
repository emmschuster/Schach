public enum EFarbe {
	SCHWARZ, WEISS;
	void vorhandeneFarben() {
		for(EFarbe f : EFarbe.values()) {
			System.out.println(f);
		}
	}
}
