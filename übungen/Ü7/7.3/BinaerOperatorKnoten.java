

public abstract class BinaerOperatorKnoten implements Knoten{

    private Knoten ersterOperand;
    private Knoten zweiterOperand;

    //Konstruktor
    public BinaerOperatorKnoten(Knoten erster, Knoten zweiter) throws IllegalArgumentException{  // DER KONSTRUKTOR SOLL JA EINE AUSNAHME WERFEN

        if (erster == null || zweiter == null){
            throw new IllegalArgumentException("Operanden dürfen nicht Null sein");
        }

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