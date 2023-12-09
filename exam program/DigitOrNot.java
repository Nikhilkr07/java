//Write a program to check whether entered string is having any digit it or not.

import java.util.*;

public class DigitOrNot {
    public static void main(String[] args) {
        String s;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string ");
        s = sc.nextLine();

        int count = 0;

        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);

            if(Character.isDigit(c)){
                System.out.println("String is Having digit ");
                count ++;
                break;
            }
        }

        if(count == 0){
            System.out.println("String is having no digit");
        }
    }
}
