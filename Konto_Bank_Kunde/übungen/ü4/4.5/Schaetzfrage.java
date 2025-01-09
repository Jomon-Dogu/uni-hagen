
class SchaetzFrage extends AbstrakteZahlenfrage{

    private int richtigeAntwort;

    //Konstruktor
    public SchaetzFrage(String frage, int punkte, int richtigeAntwort, int prozentualeAbweichung) {
        super(frage, punkte);
        this.richtigeAntwort = richtigeAntwort;

    }

    public boolean istRichtigBeantwortet(){
        if (!this.istBeantwortet()) {
			return false;
		}
        return this.richtigeAntwort == this.richtigeAntwort;


    }
    
}