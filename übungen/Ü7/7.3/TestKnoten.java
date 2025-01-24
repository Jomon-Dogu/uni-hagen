public class TestKnoten {
    public static void main(String[] args) {
        // Teste einen Baum: (5 + 3) * (8 - 2)
        try {
            Knoten addKnoten = new AddKnoten(new IntKnoten(5), new IntKnoten(3)); // (5 + 3)
            Knoten subKnoten = new SubKnoten(new IntKnoten(8), new IntKnoten(2)); // (8 - 2)
            Knoten DivKnoten = new DivKnoten(addKnoten, subKnoten);             // (5 + 3) * (8 - 2)
            Baum test_baum = Baum.erzeugeBeispielBaum(3,5,6,7,1);
            // Ergebnis berechnen
            System.out.println("Ergebnis: " + DivKnoten.werteAus()); // Erwartet: 48

            // Baumstruktur ausgeben
            System.out.println("Baum: " + DivKnoten.toString()); // Erwartet: ((5 + 3) * (8 - 2))

            System.out.println("Baum: " + test_baum.toString());

            // Berechnung des Wertes
            System.out.println("Ergebnis: " + test_baum.werteAus());
        
        } catch (IllegalArgumentException e) {
            System.out.println("So nicht, weil: " + e.getMessage());
        
        } catch (ArithmeticException e) {
            System.out.println("Das geht nicht, weil: " + e.getMessage());
        }
        

    }
}
