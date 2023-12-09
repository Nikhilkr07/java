//character array into String.

package com.Strings;

public class String1 {
    public static void main(String[] args) {
        char []c = {'a','b','c'};
        String s = new String(c);
        System.out.println(s);
        for(char r: c){
            System.out.print(r);
        }
    }
}
