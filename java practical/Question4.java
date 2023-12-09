// Question Calculate sum of series a/b^2 + a^3/b^4 + a^5/b^6 +..... and so on

import java.util.Scanner;

class Question4 {
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
        double d = ss.pow(a,b);
        System.out.println(d);

        int k = 1;
        double sum = 0.0;
        for(int i = 1; i<=n; i++){
            sum = sum + (ss.pow(a,k)) / (ss.pow(b,k+1));
            k = k+2;
        }
        System.out.println("The sum of this series for " + n +" terms is " + sum);
    }

    double pow(int m, int n){
        if(n == 0){
            return 1.0;
        }
        else{
            return (m*pow(m,n-1));
        }
    }
}
