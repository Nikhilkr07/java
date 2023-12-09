// Calculate the average marks from an arrray containing marks of all students in physics using for-each loop?

package com.Nikhil;

public class Arrayq3 {
    public static void main(String[] args) {

        float physic[] = {60f, 70f, 80f, 65.89f, 84.9f};

        float sum = 0;
        for (float elements : physic) {
            sum = sum + elements;
        }

        System.out.println("The avg marks of physic is " + sum/physic.length);

    }
}
