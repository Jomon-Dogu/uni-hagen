    public class Konto {


        // Klassenattribute
        Bank bank;
        Kunde inhaber;
        long kontostand;
        long nummer;

        // Konstruktor
        public Konto(long kontoNr, Bank b, Kunde k) {
            nummer = kontoNr;
            bank = b;
            inhaber = k;
        }

        // Methoden
        void auszahlen(long cent){
            Konto.this.kontostand = kontostand - cent;      // Konto.this kann weg weil kein Nameskonflikt!

        }

        void einzahlen(long cent){
            Konto.this.kontostand = kontostand + cent;      // Konto.this kann weg weil kein Nameskonflikt!
        }
        
        // Getter
        String liefereInhabername() {

                return inhaber.liefereName();
        }
        
        String liefereBankname() {
            
                return bank.liefereName();
        }

        long liefereBLZ(){

                return bank.liefereBLZ();
        }
        
        long liefereKontonummer(){
            return Konto.this.nummer;      // Konto.this kann weg weil kein Nameskonflikt!
        }

        long liefereKontostand(){
            return Konto.this.kontostand;      // Konto.this kann weg weil kein Nameskonflikt!
        }
    }
