
class Schrittproblem{

    int Zahlenstrahl_boundary_min;
    int Zahlenstrahl_boundary_max;
    int[] Zahlenstrahl;

    double wahrscheinlichkeit_links;
    double wahrscheinlichkeit_rechts;
    double wahrscheinlichkeit_position_x;
    int zielposition;
    int init_position = 0;
    int current_position;
    int anzahl_durchlaufener_schritte = 0;




    
    public double schrittproblem(int n, double p, int x) {
        if(n<0) throw new IllegalArgumentException();
        if(n<x) return 0;
        if(n<-x) return 0;
        if(n==0) return 1;
        return schrittproblem(n-1,p,x+1)                        // da es rekursiv ist, ruft die methode sich selbst wieder auf
        *p+schrittproblem(n-1,p,x-1)*(1-p);
        }



    public static void main(String[] args) {
        Schrittproblem instanz = new Schrittproblem();

        
        double result = instanz.schrittproblem(6, .9, 6);

        System.out.print(result);
    }

}

