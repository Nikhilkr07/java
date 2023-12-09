// Gues what is the output of these code.

public class Array1 {
    public static void main(String[] args) {
        int x = 10;
        int b[][] = new int[2][];
        int i = 5;
        int j = 10;

        b[0] = new int[i];
        b[1] = new int[j];

        for(int m = 0; m < b.length; m++){
            for(int  n = 0; n < b[m].length; n++){
                b[m][n]++;
            }
        }
        /*
        for(int m = 0; m < b.length; m++){
            for(int  n = 0; n < b[m].length; n++){
                System.out.println(b[m][n]);
            }
        }
        */

        // This code will be print 15 times 1;

        // Second way to printing 2-D array using for each loop.

        for(int p[]: b){
            for(int y: p){
                System.out.println(y);
            }
        }
    }
    
}
