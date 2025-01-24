public class DivKnoten extends BinaerOperatorKnoten{

    //Konstruktor
    public DivKnoten(Knoten erster, Knoten zweiter){
        super(erster, zweiter);
    }

    @Override
    public int werteAus(){
        return liefereErstenOperand().werteAus() / liefereZweitenOperand().werteAus();
    }

    @Override
    public String getOperatorSymbol(){
        return "/";
    }
    }
