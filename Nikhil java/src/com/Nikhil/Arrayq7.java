// Write a java program to find minimum element in array?
package com.Nikhil;

public class Arrayq7 {
    public static void main(String[] args) {
        int a[] = {12,56,89,78,45,96,84,789,0,-1,36,-98};

        for(int i = 0; i < a.length ; i++){
            if(a[0] > a[i]){
                a[0] = a[i];
            }
        }
        System.out.println("The minimum element in array is " + a[0]);
    }
}

