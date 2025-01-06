/**
 * Programm zur Berechnung des Durschnittes aus einem Array von int-Zahlen.
 */
import java.util.Random;
public class Durchschnitt {

	/**
	 * Methode zur Berechnung des Durchschnittes eines Arrays 
	 * von nichtnegativen int-Zahlen.
	 * 
	 * @param feld ein Array von int-Zahlen.
	 * @return Der berechnete Durchschnitt der Zahlen im Array.
	 */



	public double berechneDurchschnitt(int[] feld) {
		// TODO: Hier bitte die entsprechende Berechnung ergaenzen.
		int zaehler = 0;
		for (int o = 0; o < 20; o++){
			zaehler += feld[o];
			
		}



		int laenge_array = 0;
		laenge_array = feld.length;

		int durchschitt_final = zaehler/laenge_array;

		return durchschitt_final;


	}



	public static void main(String args[]){


		int[] feld = new int[20];
		Random random = new Random();

		for (int i = 0; i<20; i++){

        // Zufallszahl zwischen 0 und 99 (einschließlich)
        feld[i] = random.nextInt(100);	
		}

		for (int j = 0; j < 20; j++){
			System.out.print(feld[j]+" ");

		}
		Durchschnitt d = new  Durchschnitt();
		double durchschnittFinal = d.berechneDurchschnitt(feld);
		System.out.printf(" Durchschnitt %.3f \n ", durchschnittFinal);

	}
}
