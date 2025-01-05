public class PrimzahlTester {

    public void istPrimzahl(long n) {
        if (n <= 1){
        //    System.out.printf("ist keine Primzahl: %d%n", n);
            return;
            
        }
        for (int i = 2; i <= Math.sqrt(n); i++){

            if (n % i == 0) {
               

        //        System.out.printf("%d ist keine Primzahl %n", n);
                return;

            }
        }
                System.out.printf("%d  %n", n);


            
        }
        
    
    public static void main(String[] args) {
        int max_value = 200;

        for (int j = 0; j <= max_value; j++){
            new PrimzahlTester().istPrimzahl(j);

        }
        
    }
}