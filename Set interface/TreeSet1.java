/* TreeSet first program  */
/*In treeSet in java elements added in same as tree data Structure (in sorting manner) and traversal the elements in inOrder traversal same as data structure. */

import java.util.*;

public class TreeSet1 {
    public static void main(String[] args) {
        TreeSet ts = new TreeSet<>();

        ts.add(1);
        ts.add(5);
        ts.add(20);
        ts.add(0);
        ts.add(6);

       /*ts.add("apple"); not possible to add different different data type
        ts.add("carrot");
        ts.add("papaya");
        ts.add("guava");
        ts.add("banana");*/

        int val = 5;
        System.out.println(ts);
        System.out.println(ts.higher(val));
        System.out.println(ts.lower(val));
    }    
}

/* Tree set me hum sirf ek tarah ke hi elements ko add kar saktein hai Ya to String , int,char,double, kyonki ye comparable interface ko implements karta hai or comparable ka compareTo method first add element ke type ko check karta hai or phir usi ko root element maan ke aage ke elements ko check karta hai agar element same data tpye ke hue to use add kar deta hai nahi to exception throws kar deta hai */
/*Exception in thread "main" java.lang.ClassCastException: java.lang.Integer cannot be cast to java.lang.String */