/*4.	WAP to generate wifi key as user will enter form value Name,City,Age and Gender?
=>If gender is Male then key will be First 3 Character of Name+Difference of age digit+Last 3 Character of city
=> If gender is Female then key will be last 3 character of Name+sum of age digit+first 3 character of city
 */

import java.util.*;

class Wifi {
    String name, city;
    char gender;
    int age;
    String password;

    void input() {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the name : ");
    name = sc.nextLine();
        
    System.out.print("Enter Your city name : ");
    city = sc.nextLine();
            
    System.out.print("Enter your age : ");
    age = sc.nextInt();

    System.out.print("Enter your gender: ");
    gender = sc.next().charAt(0);
    }
        
    void passwordGeneration() {    
        if(gender == 'm' || gender == 'M'){
            password = name.substring(0, 3);
           int digit = 0;
            int diff = 0;
            while (age > 0) {

                digit = age % 10;
                diff = digit - diff;
                age = age / 10;
            }
            if(diff < 0){ // means num is negative
            password = password + (-diff) +city.substring(0,3);
            }
            else if(diff > 0){ // means number is positive
                password = password + diff +city.substring(0,3);
            }
            System.out.println("password:  "+password); 
        }

        if (gender == 'F' || gender == 'f') {
            password = name.substring(0, 3);
            int digit = 0;
            int sum = 0;
            while (age > 0) {
            digit = age % 10;
            sum = sum + digit;
            age = age / 10;
            }
            password = password + sum +city.substring(0,3);
            System.out.println("password:  "+password);
        }
    }
}

public class Question4 {
    public static void main(String[] args) {
        Wifi w = new Wifi();
        w.input();
        w.passwordGeneration();

        Wifi w1 = new Wifi();
        w1.input();
        w1.passwordGeneration();

        // Wifi w2 = new Wifi();
        // w2.input();
        // w2.passwordGeneration();
    }
}
