// /*7.	WAP to print number of days gape in your age as enter DD-MM-YYYY with current system date? */

// import java.util.*;

// class AgeGap{
//     int age;
//     int year,month,days;
//     Scanner sc = new Scanner(System.in);

//     void input(AgeGap ag){
//     System.out.println("Enter how may Year you old: ");
//     year = sc.nextInt();
//     System.out.println("Enter how many month after the year old: ");
//     month = sc.nextInt();
//     if(month > 12){
//         System.out.println("Please enter Valid month: ");
//         ag.input(ag);
//     }
//     else{
//     System.out.println("Enter how many old you after month and year: ");
//     days = sc.nextInt();
//     if(days > 31){
//         System.out.println("Please enter Valid days: ");
//         ag.input(ag);
//     }
//     }
//     }

//     void calAgeDiff(){
//         // here i am assuming each year have 365 days
//         /*calculate current date */
//         int d,m,y;
//         System.out.println("Enter current date: ");
//         System.out.println("day: ");
//         d = sc.nextInt();
//         System.out.println("Month: ");
//         m = sc.nextInt();
//         System.out.println("year: ");
//         y = sc.nextInt();

//         /*Calculate how many days  */
//         int calday;
//         calday = (y*365) + (m*30) + d;

//         /* First we calculate age in days */
//         int calageday;
//         calageday = (year*365) + (month*30) + days;

//         int caldiff; // calculate difference
//         caldiff = calday - calageday;

//         if(caldiff > 30){
//         }

//     }
// }

// public class Question7 {
//     public static void main(String[] args) {
//         AgeGap ag = new AgeGap();
//         ag.input(ag);
//     }
// }

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.*;

public class Question7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user to enter date of birth in DD-MM-YYYY format
        System.out.print("Enter your date of birth (DD-MM-YYYY): ");
        String dobString = scanner.nextLine();

        // Parse the entered date of birth string into a LocalDate object
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        LocalDate dob = LocalDate.parse(dobString, formatter);

        // Get the current system date
        LocalDate currentDate = LocalDate.now();

        // Calculate the difference in days
        long daysDifference = ChronoUnit.DAYS.between(dob, currentDate);

        // Print the result
        System.out.println("Number of days in your age: " + daysDifference + " days");

        // Close the scanner
        // scanner.close();
    }
}

// import java.util.Scanner;

// public class Question7 {
//     public static void main(String[] args) {
//         // Display terms and conditions
//         displayTermsAndConditions();

//         // Take user input for current date and time
//         System.out.print("Enter the current year: ");
//         int currentYear = getUserInput();
//         System.out.print("Enter the current month: ");
//         int currentMonth = getUserInput();
//         System.out.print("Enter the current day: ");
//         int currentDay = getUserInput();

//         // Take user input for date of birth
//         System.out.print("Enter your birth year: ");
//         int birthYear = getUserInput();
//         System.out.print("Enter your birth month: ");
//         int birthMonth = getUserInput();
//         System.out.print("Enter your birth day: ");
//         int birthDay = getUserInput();

//         // Calculate the age difference in days
//         int daysDifference = calculateDaysDifference(birthYear, birthMonth, birthDay, currentYear, currentMonth, currentDay);

//         // Display the result
//         System.out.println("Number of days gap in your age: " + daysDifference + " days");
//     }

//     private static void displayTermsAndConditions() {
//         System.out.println("Terms and Conditions:");
//         System.out.println("1. This program calculates the number of days gap in your age.");
//         System.out.println("2. The accuracy of the result depends on the accuracy of the user's input.");
//         System.out.println();
//     }

//     private static int getUserInput() {
//         Scanner scanner = new Scanner(System.in);
//         return scanner.nextInt();
//     }

//     // Method to calculate the difference in days between two dates
//     private static int calculateDaysDifference(int birthYear, int birthMonth, int birthDay,
//                                                int currentYear, int currentMonth, int currentDay) {
//         // Convert years, months, and days to days and calculate the difference
//         int birthDays = birthYear * 365 + birthMonth * 30 + birthDay;
//         int currentDays = currentYear * 365 + currentMonth * 30 + currentDay;

//         return Math.abs(currentDays - birthDays);
//     }
// }
