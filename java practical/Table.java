// Write a program to print table of 1 to n(pahada)

import java.util.*;

public class Table {
    public static void main(String[] args) {
        int a;
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter range of table 1 to ");
        n = sc.nextInt();
        System.out.println("The range of table is required 1 to "+n);

        for(int i = 1; i <= n; i++){
            System.out.print("Table of "+i+"  ");
            for(int j =1; j <= 10; j++){
                a = i*j;
                System.out.print(a + " ");
            }
            System.out.println();
        }
    }
}
