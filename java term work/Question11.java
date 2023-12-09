/*11.	WAP to initialize 2D string array at runtime and to print reverse value of diagonal position only? */
import java.util.*;
public class Question11 {
    public static void main(String[] args) {
        /*in case of diagonal a matrix must a square matrix */
        // here enter the square matrix order
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter order of a Square matrix ");
        n = sc.nextInt();
        String s[][] = new String[n][n];

        System.out.println("Enter "+(n*n)+" Element in Array ");

        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                s[i][j] = sc.next();
            }
        }

        /*Printing diagonal element in reverse order */
        System.out.println("Printing diagonal element in reverse order ");
        for(int i = 0; i < n; i++){
            for(int j=0;j<i;j++){
                System.out.print("   ");
            }
            System.out.print("  ");
            for(int j = 0; j < n; j++){
                if(s[i] == s[j]){
                    System.out.print(Question11.reverse(s[i][j]));
                }
            }
            System.out.println();
        }

        
    }
    static String reverse(String s){
        StringBuffer sb = new StringBuffer(s);
        return sb.reverse().toString();
    }
}
