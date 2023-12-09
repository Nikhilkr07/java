
/* Write a program to  print sum of even digits and multiply the add digits in given string*/
package com.javalab;

public class PrintDigit {
    public static void main(String[] args) {
        String s = "12pq987mn";
        int l = s.length();

        int sum = 0;
        int mul = 1;

        for(int i = 0; i < l; i++){
            char c = s.charAt(i);

            if(Character.isDigit(c)){
                int x = Character.getNumericValue(c);
                if(x % 2 == 0){
                    sum = sum + x;
                }
                else{
                    mul *= x;
                }
            }
        }
        System.out.println("sum is "+ sum);
        System.out.println("multiply is "+ mul);
    }
}
