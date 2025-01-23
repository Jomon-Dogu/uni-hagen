
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Rechner{

    String dateiname;
    //Konstruktor

    public Rechner(String input_dateiname){
        this.dateiname = input_dateiname;
    }


    public long addiere(){
        long summe = 0;
        try{
            BufferedReader br = new BufferedReader(new FileReader(this.dateiname));
        
            try{
            String line = br.readLine();                            // erwartet exception IOException
                                                                    // The .readLine() method is a member of BufferedReader.
                                                                    // It reads a line of text from the input stream.

            while (line != null && !"Ende".equals(line)){
                summe += Long.parseLong(line);                      // Long.parseLong(line) ist eine Methode in Java, die verwendet wird,
                                                                    // um einen String (z. B. "12345") in einen long-Wert (z. B. 12345) umzuwandeln.
                                                                    // Sie wird oft genutzt, wenn man mit Text arbeitet, der Zahlen enthält, und diese
                                                                    // Zahlen für Berechnungen oder andere numerische Operationen benötigt.
                line = br.readLine();
            }
            }
            finally {                                               // The finally block is a part of Java's exception handling mechanism.
                                                                    // It ensures that the code inside it will always execute, regardless
                                                                    // of whether an exception occurs in the try block or not.
                                                                    // The finally block is typically used to clean up resources, such as closing files,
                                                                    // database connections, or network sockets.
                                                                    // Even if the try block throws an exception, the finally block will execute
                                                                    // before the program moves to the catch block or terminates.

                br.close();                                         // The .close() method is used to release resources held by a stream or reader
                                                                    // (e.g., BufferedReader, FileReader).
                                                                    // It ensures the file or stream being read is closed and the underlying system resources
                                                                    // (like file descriptors) are freed.
            }
        }
        catch(FileNotFoundException e){
            System.out.println("Datei wurde nicht gefunden");
        }
        catch(IOException e){
            System.out.println("Datei kann nicht gelesen werden");
        }
        catch(NumberFormatException e){
            System.out.println("Datei enthält unzulässige " + "Zeichen.");
        }
        return summe;
    }

    public static void main(String[] args) {
        Rechner test = new Rechner("/home/wolff/git-repository/uni-hagen/vorlesung7/39-1/zahlenText.txt");
        System.out.println(test.addiere());
    }
}


/**
 * Summary of How They Work Together:

    try Block:
        Opens the file (new FileReader(this.dateiname)).
        Reads each line of the file using .readLine().
        Parses and processes the content (Long.parseLong(line)).

    finally Block:
        Ensures the file is closed using .close(), whether or not the reading succeeds.

    .readLine():
        Reads the next line in the file or returns null if the end is reached.

Using these mechanisms ensures safe and efficient file handling in Java.
 */