
/*1.	WAP in java to simulate condition to generate Wi-Fi password. Take input as Name, City, Age and Gender.
      Constraints:
a.	Length of name and city should be greater or equal to 3.
b.	Age can`t be 18.
Output Constraints:
a.	If Gender=F and Age<18
Password: 1st 3 char of name + sum of digit of age + last 3 char of city
b.	Else If gender=F and Age>18
Password: last 3 char of Name + Diff of digit of age(Positive) + 1st 3 char of City.
c.	Else
Password: 1st char of name + 1st char of city + 2nd char of name + 2nd char of city …
Append this to length of max string(name or city) and then concatenate with Age to get password.
 */
import java.util.*;
class Wifi {
    String name, city;
    char gender;
    int age;
    String password;

    void input(Wifi w) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the name : ");
        name = sc.nextLine();
        if (name.length() >= 3) {
            System.out.print("Enter Your city name : ");
            city = sc.nextLine();
            if (city.length() >= 3) {
                System.out.print("Enter your age : ");
                age = sc.nextInt();
                if (age == 18) {
                    System.out.println("18 Age is not allowed");
                    w.input(w);
                } else {
                    System.out.print("Enter your gender: ");
                    gender = sc.next().charAt(0);
                }
            } else {
                System.out.println("Please enter maximum three character city name");
                w.input(w);
            }
        } else {
            System.out.println("Please enter maximum three character name");
            w.input(w);
        }
    }

    void passwordGeneration() {
        /*
         * Output Constraints:
         * a.If Gender=F and Age<18
         */
        if (gender == 'F' || gender == 'f' && age < 18) {
            password = name.substring(0, 3);
            int digit = 0;
            int sum = 0;
            while (age > 0) {

                digit = age % 10;
                sum = sum + digit;
                age = age / 10;
            }
            password = password + sum +city.substring(0,3);
            System.out.println("\npassword:  "+password+"\n");

        }
        /*b.	Else If gender=F and Age>18
         Password: last 3 char of Name + Diff of digit of age(Positive) + 1st 3 char of City. */
         else if(gender == 'f' || gender == 'F' && age > 18){
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
            System.out.println("\npassword:  "+password+"\n");
         }

         else{
            /*c.	Else
           Password: 1st char of name + 1st char of city + 2nd char of name + 2nd char of city …
           Append this to length of max string(name or city) and then concatenate with Age to get password. */
           password = name.substring(0, 1) + city.substring(0, 1) + name.substring(1, 2) + city.substring(1, 2);
           int ns = 0 , ni; // ns = name sum ,ni = name int
           for(int i = 0; i < name.length();i++){
            char c = name.charAt(i);
            ni = (int)c;
            ns += ni;
           }
        //    System.out.println(ns);

           int cs = 0, ci;
           for(int i = 0; i < city.length();i++){
            char c = city.charAt(i);
            ci = (int)c;
            cs += ci;
           }
        // System.out.println(cs);

           if(ns > cs){
            password = password.concat(name)+age;
           }
           else if(cs > ns){
            password = password.concat(city)+age;
           }
        
           System.out.println("\npassword:  "+password+"\n");
         }
    }
}

public class Question1 {
    public static void main(String[] args) {
        Wifi w = new Wifi();
        w.input(w);
        w.passwordGeneration();

        Wifi w1 = new Wifi();
        w1.input(w1);
        w1.passwordGeneration();

        Wifi w2 = new Wifi();
        w2.input(w2);
        w2.passwordGeneration();
    }
}