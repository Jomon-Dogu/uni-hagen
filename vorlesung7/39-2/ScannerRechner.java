
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ScannerRechner{

    String dateiname_intern;
    //Konstruktor
    public ScannerRechner(String dateiname){
        this.dateiname_intern = dateiname;
    }

    public long scannen(){
            long summe = 0;

        try {
            Scanner datei = new Scanner(new FileReader(this.dateiname_intern));

            while (datei.hasNext()) { // Solange es weitere Tokens gibt

                String line = datei.next();
                if (line.equalsIgnoreCase("Ende")) {
                    break; // Schleife beenden, wenn "Ende" gefunden wird
                }
                try {
                    summe += Long.parseLong(line); // Token in Zahl umwandeln und summieren
                } catch (NumberFormatException e) {
                    System.out.println("Ungültiger Wert: " + line);
                }
                
            }
            datei.close(); // Scanner erst nach Abschluss der Schleife schließen
        
        }   catch(IOException e){
            System.out.println("Datei kann nicht gelesen werden");
        }
        
        return summe;
    }


    public static void main(String[] args) {
        ScannerRechner test_case = new ScannerRechner("/home/wolff/git-repository/uni-hagen/vorlesung7/39-1/zahlenText.txt");
        long result = test_case.scannen();
        System.out.print(result);
    }
}