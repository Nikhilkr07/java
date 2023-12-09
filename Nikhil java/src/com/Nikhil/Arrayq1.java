// Create an array of 5 floats and calculate their sum?

package com.Nikhil;
import java.util.Scanner;
public class Arrayq1 {
    public static void main(String[] args) {
        float a[] = new float[5];

        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter " + a.length +" values :");
        for(int i=0;i<a.length;i++){
            a[i] = sc.nextFloat();
        }
        float sum = 0;
        for(int i=0;i<a.length;i++){
            sum = sum + a[i];
        }
        System.out.println("The Sum of these 5 elements is " + sum);
    }
}
