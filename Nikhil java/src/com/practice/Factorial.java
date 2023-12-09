// Factorial using recursion

package com.practice;
import java.util.*;
public class Factorial {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number ");
        n = sc.nextInt();
        Factorial f = new Factorial();
        int fact = f.fac(n);
        System.out.println("The factorial of "+n+" is "+fact);
    }
    int fac(int n){
        if(n == 0 || n == 1)
            return 1;
        else
            return n * fac(n-1);
    }
}
