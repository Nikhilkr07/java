/*Write a program to calculate percentage of a given student in cbse board exam. His marks from 5 subject must be taken as input from the keyboard (marks are out of 100) */

import java.util.Scanner;

public class CalPercentage {
    public static void main(String[] args) {
        int sub1,sub2,sub3,sub4,sub5,mm;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Maximum marks");
        mm = sc.nextInt();
        System.out.println("Enter Sub 1 marks");
        sub1 = sc.nextInt();
        System.out.println("Enter Sub 2 marks");
        sub2 = sc.nextInt();
        System.out.println("Enter Sub 3 marks");
        sub3 = sc.nextInt();
        System.out.println("Enter Sub 4 marks");
        sub4 = sc.nextInt();
        System.out.println("Enter Sub 5 marks");
        sub5 = sc.nextInt();

        float tm = (sub1+sub2+sub3+sub4+sub5);
        float per = tm/(mm*5)*100;
        System.out.println("The total marks is "+ tm + "\n& percentage is "+ per);

    }
}
