import java.io.*;
import java.util.*;

public class DateiSortierer {

    // Methode zum Einlesen der Datei und Rückgabe einer Liste der Zeilen
    public List<String> einlesen(String dateiname) throws DateiNichtGefundenAusnahme {          // throws signalisiert, dass ausnahme geworfen werden kann
        List<String> stringListe = new ArrayList<>();
        System.out.println("Versuche, die Datei " + dateiname + " zu lesen...");
        
        
        try (BufferedReader br = new BufferedReader(new FileReader(dateiname))) {               // hier wird versucht(try) ob ein bestimmter code durchläuft oder probleme hat
            String zeile;

            while ((zeile = br.readLine()) != null)  {
                System.out.println("Gelesene Zeile: " + zeile); // Ausgabe jeder Zeile
                stringListe.add(zeile);
            }
        }
        
         catch (FileNotFoundException e) {                                                      // wenn er problme hat wird hier mit catch dieses Problem versucht weiter zu behandeln
            System.out.println("Nun wird auf die Ausnahme Klasse verwiesen...");
            throw new DateiNichtGefundenAusnahme(dateiname);                                    // mit throw OHNE s new wird die Ausnahmemethode zur behandlung des Fehlers erstellt
        }
        
         catch (IOException e) {
            System.out.println("Fehler beim Lesen der Datei: " + e.getMessage());
            e.printStackTrace();                                                                // Detaillierte Fehlerausgabe
        }

        return stringListe;
    }

    public static void main(String[] args) {
        DateiSortierer test = new DateiSortierer();
        try {
            List<String> inhalt = test.einlesen("/home/wolff/git-repository/uni-hagen/übungen/Ü7/Ein-/Ausgabe/beispieldatei.txt");
            if (inhalt.isEmpty()) {
                System.out.println("Die Datei ist leer.");
            } else {
                System.out.println("Dateiinhalt:");
                for (String zeile : inhalt) {
                    System.out.println(zeile);
                }
            }
        } catch (DateiNichtGefundenAusnahme e) {
            System.out.println("Fehler: " + e.getMessage());
        
        }
    }
}

