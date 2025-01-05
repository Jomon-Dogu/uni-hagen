public class BeispielPublicPrivate {
    public String name = "öffentlich";

    public void zeigeName() {
        System.out.println("Name: " + name);
    }
}


    public class Main {
    public static void main(String[] args) {
        Beispiel b = new Beispiel();
        System.out.println(b.name);  // Zugriff auf das öffentliche Feld
        b.zeigeName();               // Zugriff auf die öffentliche Methode
    }
}


/////////////////////////////////////////////////////////////////////////////////////


public class BeispielPublicPrivate {
    private String name = "privat";

    private void zeigeName() {
        System.out.println("Name: " + name);
    }

    public void zeigeNameÖffentlich() {
        // Zugriff auf private Methode innerhalb der Klasse
        zeigeName();
    }
}


public class Main {
    public static void main(String[] args) {
        Beispiel b = new Beispiel();
        // System.out.println(b.name);  // Fehler: name ist privat
        // b.zeigeName();               // Fehler: zeigeName() ist privat
        
        b.zeigeNameÖffentlich();       // Funktioniert, da die Methode öffentlich ist
    }
}
