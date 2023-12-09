// write a java program to find whether an array is sorted or not

package com.Nikhil;

public class Arrayq8 {
    public static void main(String[] args) {
        int a[] = {1,2,3,4,5,6,7,8,9,10};
//        int a[] = {1,2,3,4,5,6,7,9,8,10};

        for(int i  = 0; i < a.length-1; i++){
            if(a[i] > a[i+1]){
                System.out.println("Array is not sorted ");
                break;
            }
            else if(a[i+1] > a[i] && i == a.length-2){ // chek kar rahein hai pura chala ki nahi
                System.out.println("Array is sorted");
                break;
            }
        }
    }
}
