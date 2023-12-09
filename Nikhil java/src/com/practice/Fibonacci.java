// Fibonacci series using recursion

package com.practice;
import  java.util.*;

public class Fibonacci {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of terms ");
        n = sc.nextInt();

        Fibonacci f = new Fibonacci();
        for(int i = 0; i < n; i++) {
            System.out.println(f.fibonacciSeries(i));
        }
    }

    int fibonacciSeries(int n){
        if(n == 0){
            return 0;
        }
        else if(n == 1) {
            return 1;
        }
        else{
            return fibonacciSeries(n - 1) + fibonacciSeries(n - 2);
        }
    }
}
