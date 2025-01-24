public class MultKnoten extends BinaerOperatorKnoten{

    //Konstruktor

    public MultKnoten(Knoten erster, Knoten zweiter)throws IllegalArgumentException{

        super(erster, zweiter);
    }

    @Override
    public int werteAus(){
        return liefereErstenOperand().werteAus() * liefereZweitenOperand().werteAus();
    }

    @Override
    public String getOperatorSymbol(){
        return "*";
    }
}