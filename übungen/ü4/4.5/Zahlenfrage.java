public interface Zahlenfrage {
    

    public boolean istBeantwortet();

    public boolean istRichtigBeantwortet();

    void legeAntwortFest(int antwort);

    public int liefereErreichtePunkte();

    public String liefereFrage();
    
    public int liefereMoeglichePunkte();
    

}
