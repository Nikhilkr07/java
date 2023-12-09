//Write a program to find out of a whether a given integer is present in an array or not?

package com.Nikhil;
import java.util.Scanner;
public class Arrayq2 {
        public static void main(String[] args) {

            // This is first way
            int a[] = {1,2,3,4,5,6,7,8,9,12,21,13,14,15,181,69,75,65}; // suppose this array

            Arrayq2 arr = new Arrayq2();
            int c = arr.Check(a);

            if(c != 0){
                System.out.println("Element is found");
            }
            else {
                System.out.println("Element is not found");
            }
//
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Please Enter Element to be check");
//        int check = sc.nextInt();
//        int i;
//        for(i=0;i<a.length;i++){
//            if(check == a[i]){
//                System.out.println("Element is Present");
//                break;
//            }
//            else if(i == a.length - 1 && a[i] != check){
//                System.out.println("Element is not present");
//            }
//        }

    }
    //Here is second way
    int Check(int a[]){
            int check;
            Scanner sc = new Scanner(System.in);
            System.out.println("Please Enter Element to be check");
            check = sc.nextInt();

            for (int i=0;i<a.length;i++){
                if(a[i] == check){
                    return check;
                }
            }
            return 0;
    }
}
