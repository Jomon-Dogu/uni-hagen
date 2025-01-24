public class DivKnoten extends BinaerOperatorKnoten{

    //Konstruktor
    public DivKnoten(Knoten erster, Knoten zweiter)throws IllegalArgumentException{
        super(erster, zweiter);
    }

    @Override
    public int werteAus() throws ArithmeticException{

        int devisor = liefereZweitenOperand().werteAus();

        if (devisor == 0){
            throw new ArithmeticException("Division durch Null geht nicht");    // THROW NEW !!!!
        }
        return liefereErstenOperand().werteAus() / devisor;
    }

    @Override
    public String getOperatorSymbol(){
        return "/";
    }
    }
