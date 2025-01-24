 interface Knoten{

    int werteAus() throws ArithmeticException;
    String toString();
}

/**
 * 
 * 
 *        (*)
         /   \
       (+)    (-)
      /   \   /   \
    (5)   (3) (8)  (2)

MultKnoten.werteAus() ruft AddKnoten.werteAus() und SubKnoten.werteAus() auf.
AddKnoten.werteAus() ruft IntKnoten.werteAus() für 5 und 3 auf, summiert die Ergebnisse und liefert 8 zurück.
SubKnoten.werteAus() ruft IntKnoten.werteAus() für 8 und 2 auf, subtrahiert die Ergebnisse und liefert 6 zurück.
MultKnoten.werteAus() multipliziert dann 8 und 6 und liefert das Ergebnis 48.

*/