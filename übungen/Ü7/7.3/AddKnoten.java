public class AddKnoten extends BinaerOperatorKnoten {
    
    // Konstruktor
    public AddKnoten(Knoten erster, Knoten zweiter) throws IllegalArgumentException {
        super(erster, zweiter);                                                                      // WICHTIG

    }

    @Override
    public int werteAus() {
        return liefereErstenOperand().werteAus() + liefereZweitenOperand().werteAus();
    }

    @Override
    protected String getOperatorSymbol() {
        return "+";
    }
}
