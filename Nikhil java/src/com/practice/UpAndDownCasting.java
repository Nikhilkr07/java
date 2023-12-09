// Up and Down casting in java
package com.practice;

import com.javalab.P;

class Parent{
    String name;
    void show(){
        System.out.println("Show of parent");
    }
}

class Child extends Parent{
    int id;
    void show(){
        System.out.println("Show of child");
    }
}
public class UpAndDownCasting {
    public static void main(String[] args) {
        Parent p = new Child();
        p.name = "Nikhil";
        p.show();

        Child c = (Child)p;
        c.id = 10;
        System.out.println(p.name);
        System.out.println(c.name);
        System.out.println(c.id);
        c.show();
    }
}
