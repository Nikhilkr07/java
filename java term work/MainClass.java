/*WAP to put one Exception class in a package and to use this Exception class object in an another package class method any how? */

// exceptions/CustomException.java
package main;

import exceptions.*;

public class MainClass {
    public static void main(String[] args) {
        try {
            // Simulating a situation where the exception might occur
            processInput("invalid input");
        } catch (CustomException e) {
            System.out.println("Caught CustomException: " + e.getMessage());
        }
    }

    private static void processInput(String input) throws CustomException {
        if (input.equals("invalid input")) {
            throw new CustomException("Invalid input detected!");
        } else {
            System.out.println("Processing input: " + input);
            // Your actual processing logic goes here
        }
    }
}
