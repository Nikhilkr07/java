
import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number ");
        n = sc.nextInt();

        int c = Prime.checkPrime(n);

        if(c == 0){
            System.out.println(n + " is not prime number");
        }
        else 
        System.out.println(n+" is prime Number");
    }   

    static int checkPrime(int n){
        int i,m,flag = 0;
        m = n/2;
        if(n == 0 || n == 1){
            return 0;
        }

        for(i = 2 ; i <= m; i++){
            if(n % i == 0){
                flag = 1;
            }
        }
        if(flag == 0){
            return 1;
        }
        else
        return 0;
        
    }
    
    
}
