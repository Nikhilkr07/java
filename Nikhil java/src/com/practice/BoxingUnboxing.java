package com.practice;

public class BoxingUnboxing {
    public static void main(String[] args) {
        // Boxing and Unboxing
        int a = 10;
        Integer i = new Integer(a); // Boxing

        System.out.println(i);

        int p = i.intValue();
        System.out.println(p);

        // Auto Boxing and Auto Unboxing

        int x = 30;
        Integer k = x; // Auto Boxing
        int y = k;  // Auto Unboxing
        System.out.println(k);
        System.out.println(y);

    }
}
