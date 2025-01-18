

public class MeinMietpreisBerechner {

    int tage_gefahren = 0;
    int km_gefahren = 0;
    double aktueller_mietpreis = 0;

    protected int tage_schwellwert = 14;
    protected double pro_km_ueber_tage_schwellwert = 0.12;
    protected int pauschale_ueber_tage_schwellwert = 300;
    protected int pro_tag_unter_tage_schwellwert = 20;



    protected int km_schwellwert = 200;
    protected int pauschale_unterbis_km_schwellenwert = 40;
    protected double pro_km_über_km_schwellwert = 0.15;



	public double berechneMietpreis(int tage, int km) throws UngueltigeKilometerangabeAusnahme, UngueltigeTagesanzahlAusnahme{     // hier wird allg. gesagt das Methode werfen kann

            tage_gefahren = tage;
            km_gefahren = km;
            


            if (km_gefahren <= 0){
                throw new UngueltigeKilometerangabeAusnahme(km_gefahren);                       // und hier wirft dann die Methode im speziellen den throw
            }

            if (tage_gefahren <= 0){
                throw new UngueltigeTagesanzahlAusnahme(tage_gefahren);                       // und hier wirft dann die Methode im speziellen den throw
            }

            
            if (tage_gefahren >= tage_schwellwert ){   
                this.aktueller_mietpreis = pauschale_ueber_tage_schwellwert + (km_gefahren * pro_km_ueber_tage_schwellwert); // 300 euro + (gefahrene_km*0.12)
                                                                                                                                     // und long nicht vergessen!!!
            }

            if (tage_gefahren < tage_schwellwert && km <= km_schwellwert ){   
                this.aktueller_mietpreis = pro_tag_unter_tage_schwellwert * tage_gefahren + pauschale_unterbis_km_schwellenwert;
            }

            if (tage_gefahren < tage_schwellwert && km >= km_schwellwert){
                this.aktueller_mietpreis = pauschale_unterbis_km_schwellenwert + (pro_tag_unter_tage_schwellwert * tage_gefahren) + (pro_km_über_km_schwellwert*(km_gefahren-km_schwellwert));
            }



            return this.aktueller_mietpreis;

    }


    public static void main(String[] args) {
        try {                                                                       // Try and catch sind dann wichtig wenn ich eine Methode,
                                                                                    // in dem Fall berechneMietpreberechneMietpreis(x,y) aufrufe
                                                                                    // weil berechneMietpreis(x,y) in der implementierung einen throw wirft
            MeinMietpreisBerechner berechner = new MeinMietpreisBerechner();
            double preis = berechner.berechneMietpreis(0, 0);                     // die methode wirft, also in try block !!!!!
            System.out.println("Der Mietpreis beträgt: " + preis + " Euro");
        
        } catch (UngueltigeKilometerangabeAusnahme e) {
            System.out.println(e.getMessage());
        } catch (UngueltigeTagesanzahlAusnahme e) {
            System.out.println(e.getMessage());
            }

        
    }
}




// Klasse UngueltigeKilometerangabeAusnahme wird folgend implementiert

class UngueltigeKilometerangabeAusnahme extends Exception{               // "extends Exception"      ist wichtig !!!!!!!!!!!!!

    //Konstruktor

    public UngueltigeKilometerangabeAusnahme(int km_gefahren){

        super("Ungültige Kilometerangabe: " + km_gefahren + ". Die Kilometeranzahl muss größer als 0 sein.");

    }

}


// Klasse UngueltigeTagesanzahlAusnahme wird folgend implementiert


class UngueltigeTagesanzahlAusnahme extends Exception{               // "extends Exception"      ist wichtig !!!!!!!!!!!!!

    //Konstruktor

    public UngueltigeTagesanzahlAusnahme(int tage_gefahren){

        super("Ungültige Tagesangabe: " + tage_gefahren + ". Die Tagesangabe muss größer als 0 sein.");

    }

}


/**
 * 
 * Zu erst muss ausnahmeKlasse implimentiert werden, d.h.: class UngueltigeTagesanzahlAusnahme extends Exception{} (extends Exception wichtig!!!!!)
 * Dann: super(tage_gefahren)
 * 
 * Als zweites Verweis der neu implimentierten Klasse an der stelle wo sie benötigt wird.
 * D.h bei der if Verzweigung innerhalb einer anderen( normalen Klasse):
 * if (km_gefahren <= 0){
                throw new UngueltigeKilometerangabeAusnahme(km_gefahren);                                       ACHTE AUF DAS KLEINE new           
            }

    Als drittes folgt, dass wenn man eine AusnahmeMethode(UngueltigeKilometerangabeAusnahme()) mit new in einer MEthode einer anderen Klasse instanzieren will,
    muss man das bei der Deklenation der (normalen) Klasse bereits ankündigen.

    public double berechneMietpreis(int tage, int km) throws UngueltigeKilometerangabeAusnahme, UngueltigeTagesanzahlAusnahme{}

            
 */

