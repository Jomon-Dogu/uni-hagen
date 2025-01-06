public class Konto {
    long kontostand = 0;
    long nummer;
    Kunde inhaber;
    Bank bankdaten;


    // Konstruktor

    public Konto(long ktoNr, Bank b, Kunde k){
        nummer = ktoNr;
        bankdaten = b;
        inhaber = k;
        }


    //Methoden

    void auszahlen (long cent){
        kontostand -= cent;

    }

    void einzahlen (long cent){

        kontostand += cent;
    }

    //Getter
    String liefereInhabername(){
        return inhaber.liefereName();
    }

    long liefereBLZ(){
        return bankdaten.liefereBLZ();
    }

    String liefereBankname(){
        return bankdaten.liefereName();
    }

    long liefereKontonummer(){
        return nummer;
    }

    long liefereKontostand(){

        return kontostand;
    }

    public static void main(String[] args){
        Bank bank_bsp = new Bank("CityBank", 2005300);
        Kunde kunde_bsp = new Kunde("Horst Egon");
        Konto konto_bsp = new Konto(7331482, bank_bsp,kunde_bsp);

        long kontostand_neu = konto_bsp.liefereKontostand();

        System.out.println(kontostand_neu);

        konto_bsp.einzahlen(10);

        System.out.println(konto_bsp.liefereKontostand());


    }


}