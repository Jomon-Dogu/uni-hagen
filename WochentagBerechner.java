public class WochentagBerechner {

	/**
	 * es wird der Wochentag zu einem gueltigen Datum bestimmt
	 * 
	 * @param tag der Tag (0 < tag <= 31)
	 * @param monat der Monat (0 < monat <= 12)
	 * @param jahr die vierstellige Jahreszahl (z. B. 2009)
	 */
	public void berechneWochentag(int tag, int monat, int jahr) {
		int j = jahr;
		int m = monat;
		int d = tag;
		// Januar oder Februar als Monat 13 bzw. 14 des Vorjahres darstellen
		if (m == 1 || m == 2) {
			m += 12;
			j--;
		}
		int y = j % 100; // letzten Beiden Ziffern des Jahre bestimmen
		int c = j / 100; // Jahrhunder bestimmen
		int w = (d + (26 * (m + 1)) / 10 + (5 * y) / 4 + c / 4 + 5 * c - 1) % 7;
		switch (w) {
		case 0:
			System.out.print("Sonntag");
			break;
		case 1:
			System.out.print("Montag");
			break;
		case 2:
			System.out.print("Dienstag");
			break;
		case 3:
			System.out.print("Mittwoch");
			break;
		case 4:
			System.out.print("Donnerstag");
			break;
		case 5:
			System.out.print("Freitag");
			break;
		case 6:
			System.out.println("Samstag");
			break;
		}
	}

    public static void main(String[] args) {
        
        new WochentagBerechner().berechneWochentag(5, 6, 2009);  // new = In Java wird new verwendet, um neue Objekte zu erstellen (instanziieren). 
    }

}
