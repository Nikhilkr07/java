// Check given two string same or not

import java.util.*;

public class Strques1 {
    public static void main(String[] args) {
        String s1;
        String s2;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first String  ");
        s1 = sc.nextLine();

        System.out.print("Enter Second String  ");
        s2 = sc.nextLine();

        int m = 0;
        if(s1.length() == s2.length()){
            for(int i = 0; i < s1.length(); i++){
                if(s1.charAt(i) == s2.charAt(i)){
                    m = 1;
                }
                else{
                    m = 0;
                    break;
                }
            }
        }
        if(m == 1){
            System.out.println("Strings are same");
        }
        else{
            System.out.println("Not same");
        }
    }
}
