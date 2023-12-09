// Check through command line argument and then check string palindrome or not

package com.javalab;

public class P{
    public static void main(String[] s) {
        String p = "";
        for(String i: s){
            p = ""+s;
        }

        for(int i=0;i<p.length()-1;i++){
            for(int j=0; j<p.length();j++){
                if(A.isPalindrome(p.substring(i,j+1))){
                    System.out.println(p.substring(i,j+1));
                }
            }
        }
    }
}

class A{
    static boolean isPalindrome(String m){
        StringBuffer sb = new StringBuffer(m);
        String n = sb.reverse().toString();

        if(n.equals(m))
            return true;
        else
            return false;
    }
}