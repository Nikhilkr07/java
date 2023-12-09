// check given string palindrome or not

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        String s;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter String   :");

        s = sc.nextLine();

        StringBuffer sb = new StringBuffer(s);
        //System.out.println(sb);
        sb.reverse();
        //System.out.println(sb);
        String s1 = sb.toString();

        if(s.equals(s1)){
            System.out.println("String is Palindrome ");
        }
        else{
            System.out.println("String is not Palindrome ");
        }
    }
}
