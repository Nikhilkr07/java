/*Suppose we have a string s = "ab1297mp" Write a program to find average of all digits in this string and
 if we find a vowel letter than print its pervious letter and if letter is constant then print next letter of
 the constant letter.*/

package com.practice;

public class Q1 {
    public static void main(String[] args) {
        String s =  "ab1297mp";

        float sum = 0;
        float avg = 0;
        int dc = 0;
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);

            if(Character.isDigit(c)){
                int x = Character.getNumericValue(c);
                sum += x;
                dc++;
            }
            else{
                if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' ||
                        c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U' ){
                    if(c == 'a' || c == 'A'){
                        int x = c;
                        System.out.print((char)(x+25));
                    }
                    else{
                        int x = c;
                        System.out.print((char)(x-1));
                    }
                }
                else {
                    if(c == 'z' || c == 'Z'){
                        int x = c;
                        System.out.print((char)(x-25));
                    }
                    else{
                        int x = c;
                        System.out.print((char)(x+1));
                    }
                }
            }
        }
        avg = sum / dc;
        System.out.println("\nTHe avg of digits is "+avg);
    }
}
