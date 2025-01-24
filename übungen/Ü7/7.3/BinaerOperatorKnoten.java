

public abstract class BinaerOperatorKnoten implements Knoten{

    private Knoten ersterOperand;
    private Knoten zweiterOperand;

    //Konstruktor
    public BinaerOperatorKnoten(Knoten erster, Knoten zweiter){

        this.ersterOperand = erster;
        this.zweiterOperand = zweiter;
    }

    protected  Knoten liefereErstenOperand(){

        return ersterOperand;
    }

    protected Knoten liefereZweitenOperand(){

        return zweiterOperand;
    }

    protected abstract String getOperatorSymbol();                      // ABSTRAKTE METHODE

    @Override
    public String toString(){
        return "(" + ersterOperand.toString() + " " + getOperatorSymbol() + " " + zweiterOperand.toString() + ")";
    }

}