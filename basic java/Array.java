// How to declare and initialize array in java 
//import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
    // This is first way to declare and initialize an array
        // int marks[] ={10,20,30,40,50};
        // float number[] = {10.2f,21.11f,12.12f,13.13f};
        // String name[] = {"Nikhil","Bobby","Shubham","Kundan","Nitesh"};

    /*  System.out.println(marks.length);// To check what is the length of an array use (.length)
        System.out.println(number.length);
        System.out.println(name.length);
        */ 

     // first way to print the array 
        // System.out.println("Here i am printing marks");
        // System.out.println(marks[0]);
        // System.out.println(marks[1]);
        // System.out.println(marks[2]);
        // System.out.println(marks[3]);
        // System.out.println(marks[4]);
        // printing using for loop 2nd way to print

        // for(int i=0;i<marks.length;i++){
        //     System.out.println(marks[i]);
        // }

        // Try to delete element from array

      /*for(int i = 1;i<marks.length-1;i++){
            marks[i] = marks[i+1]; 
        }
        System.out.println("delete hua ya nahi");

        for(int i=0;i<marks.length-1;i++){
            System.out.println(marks[i]);
        } */
      /*System.out.println("Here i am printing number");
        System.out.println(number[0]);
        System.out.println(number[1]);
        System.out.println(number[2]);
        System.out.println(number[3]);
        // printing using for loop 2nd way to print

        for(int i=0;i<number.length;i++){
            System.out.println(number[i]);
        }
        System.out.println("Here i am printing name");
        System.out.println(name[0]);
        System.out.println(name[1]);
        System.out.println(name[2]);
        System.out.println(name[3]);
        System.out.println(name[4]);
        // printing using for loop 2nd way to print

        for(int i=0;i<name.length;i++){
            System.out.println(name[i]);
        }
        */

          


    /*// This is second way to declare and initialize an array

        // int marks[] = new int[5]; // iss line ko aishe bhi likh saktein hain
        int marks[];
        marks = new int[5];
        marks[0] = 5;
        marks[1] = 55;
        marks[2] = 565;
        marks[3] = 585;
        marks[4] = 550;

        // printing using for loop

        for(int i=0;i<marks.length;i++){
            System.out.println(marks[i]);
        }
        */

      /* // Third way to input from user and diplay
        int marks[] = new int[10];

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter " + marks.length + " Numers: ");
        for(int i=0;i<marks.length;i++){
            marks[i] = sc.nextInt();
        }

         for(int i=0;i<marks.length;i++){
            System.out.println(marks[i]);
        }
          */  


          // 2 - D Array

          int a[][] = {{1,2,3},{4,5,6}};

          for(int i=0;i<a.length;i++){
            for(int j = 0; j<a[i].length;j++){
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
          }


        // int a[] = {1,2,3};
        // // int b = a[0];
        // a[3]++;
        
        // for(int i=0;i<6;i++){
        //     System.out.println(a[i]);
        // }
    }
}
