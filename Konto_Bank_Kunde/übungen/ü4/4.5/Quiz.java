
public class Quiz{
       

    private Zahlenfrage[] fragen;
    private int fragenAnzahl = 0;
    
    // Konstruktor
    public Quiz(int fragenAnzahl){
		this.fragen = new Zahlenfrage[fragenAnzahl];        // erzeugt ein neues Quiz, mit maximal fragenAnzahl Fragen

    }

    public boolean fuegeFrageHinzu(Zahlenfrage f){
		if (f == null) {
			return false;
		}
		if (this.fragenAnzahl < this.fragen.length) {
			this.fragen[this.fragenAnzahl] = f;
			this.fragenAnzahl++;
			return true;
		}
		return false;
	}


    public int berechneErreichtePunkte(){
        int summe = 0 ;

        for ( Zahlenfrage f : this.fragen){

            if (f == null){
                continue;
            }

            summe += f.liefereErreichtePunkte();

    }
    return summe;
    }

    public int berechneMaximalMoeglichePunkte(){
        int moegliche_summe = 0;

        for ( Zahlenfrage f : this.fragen){
            
            moegliche_summe += f.liefereMoeglichePunkte();
        }
        return moegliche_summe;
    }

    public Zahlenfrage liefereFrage(int index){

        if (index < 0 || index >= liefereFragenAnzahl()){  // liefereFragenAnzahl siehe nächte Methode!!!
            return  null;
        }
        else
        return fragen[index];

    }

    public int liefereFragenAnzahl(){

        return fragenAnzahl;

    }
}