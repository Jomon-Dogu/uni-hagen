public class SchrittproblemIte{

    
    /* Um Schwierigkeiten durch die Array-Indizierung zu vermeiden gibt
    diese Methode den korrekten Array-Index für die Position x auf
    dem Zahlenstrahl zurück, wenn der Zahlenstrahl von -n bis n geht. */

    private int arrayIndex(int x, int n) {
        return n+x+1;
    }


    public double schrittproblemIte(int n, double p, int x) {
    if(n<0) throw new IllegalArgumentException();
    if(x>n) return 0;
    if(-x>n) return 0;

    /* erster Index des Feldes: Position auf dem Zahlenstrahl
    (arrayIndex() verwenden!)
    zweiter Index des Feldes: Anzahl der Schritte */

    double[][] s = new double[2*(n+1)+2][n+1];
 // ###################################################################################################################
    for(int i=0; i<=n;++i) //Schritte
        for(int j=-i; j<=i;++j)//Positionen
            if(i==0) s[arrayIndex(j,n)][i]=1;
            else s[arrayIndex(j,n)][i]=
                s[arrayIndex(j-1,n)][i-1]*(1-p) // von links
                +s[arrayIndex(j+1,n)][i-1]*p; // von rechts
 // ###################################################################################################################

    return s[arrayIndex(x,n)][n];
    }


    public static void main(String[] args){

        SchrittproblemIte neue_instanz = new SchrittproblemIte();
        int n = 3;
        double p = 0.00005;
        int x = 3;

        double result = neue_instanz.schrittproblemIte(n, p, x);
        System.out.print(result);

    }

}