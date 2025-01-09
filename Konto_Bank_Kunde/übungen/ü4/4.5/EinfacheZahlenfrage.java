public class EinfacheZahlenfrage extends AbstrakteZahlenfrage {

	private int richtigeAntwort;
	
	public EinfacheZahlenfrage(String frage, int punkte, int richtigeAntwort) {
		super (frage, punkte);
		this.richtigeAntwort = richtigeAntwort;
	}
	@Override
	public boolean istRichtigBeantwortet() {
		    if (!this.istBeantwortet()) {
			        return false;
		    }
		    return this.richtigeAntwort == this.antwort;
	}

}
