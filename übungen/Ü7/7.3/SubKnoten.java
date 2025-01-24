public class SubKnoten extends BinaerOperatorKnoten{

    //Konstruktor
    public SubKnoten(Knoten erster, Knoten zweiter) throws IllegalArgumentException{
        super(erster, zweiter);
    }

    @Override
    public int werteAus(){
        return liefereErstenOperand().werteAus() - liefereZweitenOperand().werteAus();
    }

    @Override
    public String getOperatorSymbol(){
        return "-";
    }



}