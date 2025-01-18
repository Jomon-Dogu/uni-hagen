import java.util.NoSuchElementException;



public class Stapel {


    private StapelElement head;
    private int anzahl = 0;



	// TODO Ergaenzen Sie zunaechst die geforderten Methoden, 
	// so dass der Testfall kompiliert

    public Stapel(){
        this.head = null;
    }


    void fuegeElementHinzu(String s){
        this.head = fuegeElementHinzu(this.head, s);
        this.anzahl++;

    }

    // Hilfsmethode für den rekursiven Aufruf
    private StapelElement fuegeElementHinzu(StapelElement current, String s) {
        if (current == null) {
            // Wenn die Liste leer ist, erstellen wir ein neues StapelElement
            return new StapelElement(s);
        } else {

            // Ansonsten gehen wir weiter zum nächsten Element
            current.setNext(fuegeElementHinzu(current.getNext(), s));       // setNext und getNext
            return current;
        }
    }


    String entferneOberstesElement() {
        // Nutze die Methode liefereOberstesElement(), um den Wert des obersten Elements zu erhalten
        String entferntesElement = liefereOberstesElement();

        // Entferne das oberste Element, indem der Kopf auf das nächste Element gesetzt wird
        this.head = this.head.getNext();

        // Verringere die Anzahl der Elemente im Stapel
        this.anzahl--;

        // Gib das entfernte Element zurück
        return entferntesElement;
    }

    String liefereOberstesElement() {

        if (this.head == null || this.head.getNext() == null) {
        throw new NoSuchElementException("Der Stapel ist leer oder hat nur ein Element!");
        }
        
        if (this.head == null && this.head.getNext() == null) {


        }
        // Zugriff über Getter
        return this.head.getEntry();
    }

    long liefereGroesse(){
        return anzahl;
    }

    boolean istLeer(){
        if (this.anzahl == 0){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {

        Stapel stapel_instanz = new Stapel();

        stapel_instanz.fuegeElementHinzu("hihaho     9");
        stapel_instanz.fuegeElementHinzu("hihaho     2");
        stapel_instanz.fuegeElementHinzu("hihaho     8");
        stapel_instanz.fuegeElementHinzu("hihaho     1");

       // System.out.printf("%s%n",(stapel_instanz.head.next_eintrag));                   // Der nächste Eintrag ist immer ein Objekt!!
                                                                                        // kein String bzw. Name der Nächsten Karte!!!!

                                                                                        // next_eintrag ========= ein Objekt

      //  System.out.printf("%s%n",(stapel_instanz.head.next_eintrag.next_eintrag));

        System.out.printf("###########################----1----########################%n");


        System.out.printf("%s%n",(stapel_instanz.head.getNext().getNext().getNext()));

        System.out.printf("############################----2----#######################%n");

        String oberstes_element = stapel_instanz.liefereOberstesElement();

        System.out.printf("Oberstes Element ist %s",oberstes_element);

        System.out.printf("%n##########################----3----#########################%n");

        int groeße = stapel_instanz.anzahl;
        System.out.printf("Groeße array %d",groeße);

        System.out.printf("%n##########################----4----#########################%n");

        boolean leer_oder_voll = stapel_instanz.istLeer();
        System.out.printf("Ist  das array leer? %b",leer_oder_voll);

        System.out.printf("%n##########################----5----#########################%n");

        String removed_entry = stapel_instanz.entferneOberstesElement();
        System.out.printf("was wurde entfernt? %s%n",removed_entry);
        System.out.println("Test: ");
        String oberstes_element_test = stapel_instanz.liefereOberstesElement();
        System.out.printf("Nun ist das oberste Element %s",oberstes_element_test);

    }

}
