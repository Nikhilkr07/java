// Write a program to print sum of all positive integers as passed from command line arguments.

public class PostiveInteger {
    public static void main(String[] a) {

        // First we need to find length
        int l = a.length;
        // then take variable sum and assingn to 0.
        int sum = 0;

        // then run a loop and go for further logic
        
        for(int i=0;i<l;i++){
            int x = Integer.parseInt(a[i]);
            if(x > 0){
                sum += x;
            }
            }

        System.out.println("The sum is  "+sum);
    }
}

