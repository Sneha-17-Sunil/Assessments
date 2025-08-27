package org.sneha.ExceptionHandling_Collections;
import java.util.Scanner;

//Write a program to handle division by zero using try-catch.
public class Ass1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter numerator: ");
        int numerator = sc.nextInt();

        System.out.print("Enter denominator: ");
        int denominator = sc.nextInt();

        try {
            int result = numerator / denominator;  // risky statement
            System.out.println("Result: " + result);
        } catch (Exception e) {
            System.out.println(e);
        }
        //Demonstrate the use of multiple catch blocks (ArithmeticException, NullPointerException, Exception).
        try {
            int a = 10, b = 0;
            int result = a / b;   // risky statement

            // Example 2: NullPointerException
            String str = null;
            System.out.println(str.length());

        } catch (ArithmeticException e) {
            System.out.println("Caught ArithmeticException: Division by zero is not allowed.");
        } catch (NullPointerException e) {
            System.out.println("Caught NullPointerException: Attempted to access a null object.");
        } catch (Exception e) {
            System.out.println("Caught Exception: Something went wrong.");
        }

        System.out.println("Program continues after exception handling...");

//Show how a nested try block works with two different exceptions
        try {
            // Outer try block
            System.out.println("Outer try block starts...");

            try {
                // Inner try block 1: ArithmeticException
                int a = 10, b = 0;
                int result = a / b;   // risky statement
                System.out.println("Result: " + result);
            } catch (ArithmeticException e) {
                System.out.println("Caught ArithmeticException in inner try: Division by zero.");
            }

            try {
                // Inner try block 2: NullPointerException
                String str = null;
                System.out.println("Length: " + str.length()); // risky statement
            } catch (NullPointerException e) {
                System.out.println("Caught NullPointerException in inner try: Null reference.");
            }

            System.out.println("Rest of outer try block executed.");

        } catch (Exception e) {
            System.out.println("Caught Exception in outer try: " + e);
        }

        System.out.println("Program continues after nested try-catch...");
//Write a program to demonstrate how the finally block always executes, whether an exception occurs or not.
        try {
            System.out.println("Case 1: Division by zero");
            int result = 10 / 0;  // will throw ArithmeticException
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Caught Exception: Division by zero not allowed.");
        } finally {
            System.out.println("Finally block executed (Case 1).");
        }
    }
}