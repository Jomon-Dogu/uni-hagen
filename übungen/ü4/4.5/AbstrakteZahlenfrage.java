
public abstract class AbstrakteZahlenfrage implements Zahlenfrage{


    private String frage;
    int punkte;
    boolean istBeantwortet;
    protected int antwort;
    

    //Konstruton
    public AbstrakteZahlenfrage(String frage, int punkte){              //frag: übergebene Fragestellung, punkte: maximal mögliche Punkte

        this.frage = frage;
        this.punkte = punkte;
    }

    public boolean istBeantwortet(){

            return istBeantwortet;
    }

    public void legeAntwortFest(int antwort){
            
            this.istBeantwortet = true;
            this.antwort = antwort;
        }

    public int liefereErreichtePunkte(int punkte){

        return this.punkte = punkte;
    }

    public String liefereFrage(String frage){

        return this.frage = frage;
    }


    public int liefereMoeglichePunkte(){

        return this.punkte;
    }
