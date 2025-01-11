import java.util.Arrays;


public class Kettenbruch {
	
	public int[] werte;
    public double result;	
    private int index;

    // Konstruktor
	public Kettenbruch(int[] werte) {                   // z.B. [3,2,4,5]
		this.werte = werte;
	}
	
    // Iterative Methode zur Auswertung des Kettenbruchs
	public double werteIterativAus() {
        double result = werte[werte.length - 1]; // Starte mit dem letzten Element

        for (int i = werte.length - 2; i >= 0; i--) { // Rückwärts durch das Array
            result = werte[i] + 1.0 / result; // Kettenbruchregel                                  // ICH KANN ALSO IN SCHLEIFE RESULT AUS SCHLEIFE ZUVOR NUTZEN UND
                                                                                                   // UM NEUES RESULT ZU BERECHNEN !!!!!!!!!!! 
        }
        return result;
    }

    // Rekursive Methode zur Auswertung des Kettenbruchs
    public double werteRekursivAus(int index) {                                              // Bei Rekrsiv: Eine Methode ruft sich selbst auf, um das Problem zu lösen.                                                                                  // bei iterativ: MEthode ruft sich nicht selber auf!!!!

        // Basisbedingung: Letztes Element
        if (index == werte.length - 1) {
            return werte[index];
        }
        // Rekursiver Aufruf: aktueller Wert + 1 / (nächster Teil des Kettenbruchs)
        return werte[index] + 1 / werteRekursivAus(index + 1);                              // hier ruft sie sich selbst auf
    }

  	public static double approximiereWurzel2(int n) {

        int[] final_array_approx_wurzel_2 = berechneWurzel2Folge(n);

        Kettenbruch Instanz2 = new Kettenbruch(final_array_approx_wurzel_2);                // hier wird Instanz erzeugt

        return Instanz2.werteIterativAus();
    }


    public static int[] berechneWurzel2Folge(int n){

        int[] wurzel_2_approx = new int[n];

        wurzel_2_approx[0] = 1;

        for ( int i = 1; i <= wurzel_2_approx.length - 1; i++){
            wurzel_2_approx[i] = 2;

        }


        return wurzel_2_approx;
    }

    public static double approximiereE(int n) {
		int[] eFolge = berechneEFolge(n);
		return new Kettenbruch(eFolge).werteIterativAus();
	}

    public static int[] berechneEFolge(int n) {
		if (n <= 0) {
			return new int[0];
		}
		int[] folge = new int[n];
		// erstes Element ist 2
		folge[0] = 2;
		// die folgenden Elemente besitzen das folgende Schema: 1, (2 * (i / 3 + 1)), 1
		// wobei die beiden 1 an den Positionen 3*n + 1 und 3*n auftreten
		for (int i = 1; i < n; i++) {
			switch(i % 3) {
			case 0:
			case 1:
				folge[i] = 1;
				break;
			case 2:
				folge[i] = 2 * (i / 3 + 1); 
			}
		}
		return folge;
	}

    
    
    // hier ist Platz für Hilfsmethoden

    public static void main(String[] args) {

        int[] werte = {3,2,4,5};
        int laenge_array = werte.length; 
     //   Kettenbruch Instanz = new Kettenbruch(new int[] {3,2,4,5});              // VORSICHT DAS IST DIE SYNTAX !!!!!
     //   double final_result_iterativ = Instanz.werteIterativAus();

        // #######################################################################################################################################

     //   double final_result_rekursiv = Instanz.werteRekursivAus(0);                 // Statt werteRekursivAus(laenge_array) wird jetzt werteRekursivAus(0) aufgerufen.
                                                                                    // Dadurch startet die Rekursion korrekt beim ersten Element des Arrays.
        
    //    System.out.printf("final_result_rekursiv= %.5f %n",final_result_rekursiv);       // printf mit dem Format %d, das für Ganzzahlen (int) gedacht ist.
                                                                                    // Da die Methode werteRekursivAus(0) jedoch einen double zurückgibt,
                                                                                    // musst du stattdessen %f verwenden, um den Wert als Fließkommazahl oder double wert zu formatieren.

        //  ######################################################################################################################################

        int[] final_array_approx_wurzel_2 = Kettenbruch.berechneWurzel2Folge(7);    //  hier wird nur die MEthode von Kettenbruch ausgeführt, es wird 
                                                                                    // aber keine Instanz der Klassse Kettenbruch generiert also brauche
                                                                                    // ich auch nicht den parameter "werte" bei der Klasse anzugeben.
                                                                                    // return ist also das array [1,2,2,2,2]
        
        System.out.printf("final_array_folge_wurzel_2= %s %n", Arrays.toString(final_array_approx_wurzel_2));          
        
        //  ######################################################################################################################################

        
        double resultat = Kettenbruch.approximiereWurzel2(9);                      // HIER BRAUCHE ICH WIE IN DEM BLOCK ZUVOR KEINE INSTANZ ZU ERSTELLEN, DAS 
                                                                                    // PASSIERT IN DER approximiereWurzel2 METHODE !!!!!!
                                                                                    

        System.out.printf(" der approximierte Wert von Wurzel 2 ist= %.9f %n",resultat);

        // ##########################################################################################################################################




    }
}
