public class GefaehrlicheKlasse {
    public static void a(int x) throws Exception {              // 1; Methode a(int x) wird aufgerufen:
        b(x);                                                   // 2; b(10) wird aufgerufen.
                                                                // 13. Die Exception("Fehler!") wird an die Methode a weitergegeben und schließlich
                                                                //     an den ursprünglichen Aufrufer von a.
                                                                //      -----> Die Ausnahme, die an den Aufrufer von GefaehrlicheKlasse.a(10) weitergereicht wird,
                                                                //             ist eine Exception mit der Nachricht "Fehler!".
    }
    public static void b(int x) throws Exception {              // 3; Die Methode b(int x) kann Exception werfen
                                                                // 3; Methode b(int x) wird ausgeführt!!!!
        if (x < 10) {
            d(x, x);
        } else {                                                // 4; x = 10, daher wird der else-Zweig ausgeführt.
            try {
                c(-x);                                          // 5. In diesem Zweig wird die Methode c(-x) (d.h. c(-10)) aufgerufen.
            } catch (RuntimeException e) {                      // 12. Die neue Exception aus c wird nicht direkt im try-Block von b abgefangen,
                                                                //     da b nur RuntimeException abfängt
                                                                //     Daher wird die Exception("Fehler!") an den Aufrufer von b weitergereicht.
                throw new IllegalArgumentException();
            }
        }
    }
    private static void c(int i) throws Exception {             // 6. Methode c(int i) wird ausgeführt
        try {
            e(2 * i, i - i);                                    // 7. i = -10, daher wird e(2 * -10, -10 - (-10)) aufgerufen. Das ergibt e(-20,0)
        } catch (Exception e) {                                 // 10. Behandlung der ArithmeticException in c. Dazu wird ArithmeticException vom
                                                                //     catch-Block in Methode c abgefangen
            throw new Exception("Fehler!");                     // 11. Eine neue Exception mit der Nachricht "Fehler!" wird geworfen !!!!!!!!
        }
    }
    private static int e(int i, int j) {                        // 8. Methode e(int i, int j) wird aufgerufen
        return i / j;                                           // 9. Hier wird -20 / 0 versucht. Eine Division durch 0
                                                                //    in Java führt zu einer ArithmeticException (eine Unterklasse von RuntimeException).
    }
    private static void d(int x, int i) {
        int[] f = new int[i];
        for (int k = 0; k <= x; k++) {
            f[k] = i;
        }
    }
}