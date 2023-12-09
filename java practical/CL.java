// Question on command line argument
// Write a program to passing element from command line argument and add only all positive integer.

public class CL {
    public static void main(String[] s) {
        int sum = 0;

        int l = s.length;

        for(int i = 0; i < l; i++){
            int x = Integer.parseInt(s[i]);

            if(x > 0){
                sum += x;
            }
        }
        System.out.println("The sum of all the positive integer is "+ sum);
    }
}
