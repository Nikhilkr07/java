//Write a program in java to find average of every row elements of 2D uneven array as initialilze 

public class Arrayq{
    public static void main(String[] args) {
        int a[][] = {{1,2,3},{4,5},{7,8,9,10}};

        // Here solving program using nested for loop.
       /*for(int i=0;i<a.length;i++){
            float sum = 0;
            float avg = 0;
            for(int j=0;j<a[i].length;j++){
                sum = sum + a[i][j];
            }
            avg = sum/a[i].length;
            System.out.println("The Average of Row " + (i+1) +" is " + avg);
        }
        */

        //Here solving this problem using for-each loop.

        int row = 0;

        for(int i[]: a){
            int n = 0;
            float sum = 0;
            float avg = 0;
            row++;
            for(int j: i){
                n++;
                sum = sum + j;
            }
            avg = sum/n;
            System.out.println("The Average of Row " + row +" is " + avg);
        }
    }
}