//Check String same ot not

package com.Strings;
/*
public class String2 {
    public static void main(String[] args) {
        String s = "abcd";
        String r = "abcd";

        System.out.println(s == r);
    }
}
*/

/*
This program return true because the String literal stored in string pool so string pool checks the value of string s
and string r is same if it is same the string pool pass reference to string r (means s wala address r ko dega kyonki
same value hai). so it will be return true value.
*/

public class String2 {
    public static void main(String[] args) {
        String s1 = new String("nikhil");
        String s2 = new String("nikhil");

        s1 = s2;
        System.out.println(s1==s2);
    }
}


