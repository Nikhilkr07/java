// Question Calculate sum of series a/b^2 + a^3/b^4 + a^5/b^6 +..... and so on same ass Question 4

import java.util.Scanner;
import java.lang.Math;

public class Sumseries {
     public static void main(String[] args) {
          int a,b;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of a ");
        a = sc.nextInt();
        System.out.println("Enter the value of b ");
        b = sc.nextInt();
        System.out.println("Enter no of terms ");
        int n = sc.nextInt();
        Question4 ss = new Question4();
        double d = Math.pow(a,b);
        System.out.println(d);

        // This series logic
        int k = 1;
        double sum = 0.0;
        for(int i = 1; i<=n; i++){
            sum = sum + (Math.pow(a,k)) / (Math.pow(b,k+1));
            k = k+2;
        }
        System.out.println("The sum of this series for " + n +" terms is " + sum);
    }
}
