 class Baum implements Knoten {

    private final Knoten wurzel_intern;

    //Konstruktor
    public Baum(Knoten wurzel) throws IllegalArgumentException{

        if (wurzel == null){
            throw new IllegalArgumentException("0 ist schlecht für die Wurzel");        // FEHLERMELDUNG NOCH ALS STRING SCHREIBEN
        }

        this.wurzel_intern = wurzel;
    }

    @Override
    public int werteAus(){
        return wurzel_intern.werteAus();
    }

    public Knoten liefereWurzel(){
        return wurzel_intern;
    }

    @Override
    public String toString(){
        return wurzel_intern.toString();

    }

    public static Baum erzeugeBeispielBaum(int a, int b, int c, int d, int e){

        // ((a * b) + (c / (d - e)))
        Knoten knotenA = new IntKnoten(a);
        Knoten knotenB = new IntKnoten(b);
        Knoten knotenC = new IntKnoten(c);
        Knoten knotenD = new IntKnoten(d);
        Knoten knotenE = new IntKnoten(e);

        Knoten mult = new MultKnoten(knotenA, knotenB);       // (a * b)
        Knoten sub = new SubKnoten(knotenD, knotenE);         // (d - e)
        Knoten div = new DivKnoten(knotenC, sub);             // (c / (d - e))
        Knoten add = new AddKnoten(mult, div);                // ((a * b) + (c / (d - e)))

        return new Baum(add); // Der Baum wird mit dem Wurzelknoten erstellt

    }
}