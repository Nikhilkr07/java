// Number Armstrong or not

package com.practice;
import  java.util.*;
import  java.lang.Math;

public class Armstrong {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number");
        n = sc.nextInt();
        int armcheck = n;
        int d = n;
        int dc = 0;
        while(d != 0){
            d= d / 10;
            dc++;
        }
        int rem;
        double sum = 0;
        while(n != 0){
            rem = n%10;
            sum = sum+(Math.pow(rem,dc));
            n = n/10;
        }
        System.out.println(armcheck==sum);
        System.out.println(armcheck);
        System.out.println(sum);
        if(armcheck == sum){
            System.out.println("Number is armstrong");
        }
        else{
            System.out.println("Number is not armstrong");
        }
    }
}
