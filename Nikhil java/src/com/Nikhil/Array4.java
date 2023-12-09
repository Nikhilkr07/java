//Create a java program to add two matrix of size 2 x 3 ?

package com.Nikhil;

public class Array4 {
    public static void main(String[] args) {
        int a[][] = {{1,2,3},{4,5,6},{7,8,9}};
        int b[][] = {{1,2,3},{4,5,6},{7,8,9}};

        int sum = 0;
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[i].length;j++){
                sum += a[i][j] + b[i][j];
            }
        }
        System.out.println("The sum of this array is " + sum);
    }
}
