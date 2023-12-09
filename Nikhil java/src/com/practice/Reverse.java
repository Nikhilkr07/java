// Reverse of a Number

package com.practice;

public class Reverse {
    public static void main(String[] args) {
        int n = 12345;
        int rev = 0, rem;

        while(n != 0){
            rem = n % 10;
            rev = rev * 10 + rem;
            n = n / 10;
        }
        System.out.println("The Reverse of this number is "+ rev);
    }
}
