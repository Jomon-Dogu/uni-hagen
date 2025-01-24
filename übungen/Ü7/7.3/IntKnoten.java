public class IntKnoten implements Knoten{

    private final int wert_intern;

    // Konstruktor
    public IntKnoten(int wert){

        this.wert_intern = wert;

    }

    @Override
    public int werteAus(){
        return wert_intern; // Liefert den gespeicherten Wert des Knotens
    }

    @Override
    public String toString(){
        return Integer.toString(wert_intern);
    }
}