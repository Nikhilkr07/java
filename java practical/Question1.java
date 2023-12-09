/* Write a program in java to find average of every row elements of 2D uneven array. */

public class Question1 {
    public static void main(String[] args) {
        int [][] a = {{2,3},{4,5},{7,8,9,10}};
        

        for(int i = 0; i < a.length; i++){
            float s = 0;
            float avg = 0;
            for(int j = 0; j < a[i].length; j++){
                s += a[i][j];
            }
            avg = s/a[i].length;
            System.out.println("The avg of row " + (i+1) +" is "+ avg);
        }
    }
}
