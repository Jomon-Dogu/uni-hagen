public class Testklasse {
    public static void main (String[] args) {

        // Breite und Länge eines Rechtecks
        int breite; 
        breite = 1200;      // zwei zeilen version!
        int laenge = 27;    // abgekürzt
        final int KOMPLETT; // nur zur übung!!! finale Variable die nicht mehr überschrieben werden kann.
        KOMPLETT =8;        //Namen von Konstanten sollten nur in Großbuchstaben geschrieben werden

        double o = 1/4;
        System.out.println(o); // wichtig


        // Berechnung der Flaeche
        int flaeche = breite * laenge;
        // KOMPLETT = 9;        würde hier zum Beispiel nicht funktionieren

        // Ausgabe der Flaeche
        System.out.print("Die Berechnung lautet: ");    // print
        System.out.println(flaeche);                    // println

    }
}