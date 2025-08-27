package org.sneha.ExceptionHandling_Collections;
import java.util.*;

// Create an ArrayList of integers, add 10 numbers, and print them using a for-each loop.
public class Ass2 {

        public static void main(String[] args) {
            // Create an ArrayList of integers
            ArrayList<Integer> numbers = new ArrayList<>();

            // Add 10 numbers to the list
            for (int i = 1; i <= 10; i++) {
                numbers.add(i * 10); // adding 10, 20, 30 ... 100
            }

            // Print elements using for-each loop
            System.out.println("ArrayList elements:");
            for (int num : numbers) {
                System.out.println(num);
            }
//Create a LinkedList of strings, add 5 names, and retrieve the 3rd element.
            LinkedList<String> names = new LinkedList<>();

            // Add 5 names
            names.add("Alice");
            names.add("Bob");
            names.add("Charlie");
            names.add("David");
            names.add("Eva");

            // Retrieve the 3rd element (index starts from 0)
            String thirdName = names.get(2);

            // Print the LinkedList and the 3rd element
            System.out.println("LinkedList elements: " + names);
            System.out.println("The 3rd element is: " + thirdName);

//Demonstrate the difference between size() and isEmpty() using an ArrayList.
            ArrayList<String> list = new ArrayList<>();

            // Initially
            System.out.println("Initial size: " + list.size());   // 0
            System.out.println("Is list empty? " + list.isEmpty()); // true

            // Add elements
            list.add("Apple");
            list.add("Banana");
            list.add("Cherry");

            // After adding elements
            System.out.println("\nAfter adding elements:");
            System.out.println("Size: " + list.size());   // 3
            System.out.println("Is list empty? " + list.isEmpty()); // false

            // Clear the list
            list.clear();

            // After clearing
            System.out.println("\nAfter clearing the list:");
            System.out.println("Size: " + list.size());   // 0
            System.out.println("Is list empty? " + list.isEmpty()); // true

//Write a program to check if an element exists in an ArrayList using contains().
            ArrayList<String> fruits = new ArrayList<>();

            // Add elements
            fruits.add("Apple");
            fruits.add("Banana");
            fruits.add("Cherry");
            fruits.add("Mango");
            fruits.add("Orange");

            // Check if "Mango" exists
            if (fruits.contains("Mango")) {
                System.out.println("Mango exists in the list.");
            } else {
                System.out.println("Mango does not exist in the list.");
            }

            // Check if "Grapes" exists
            if (fruits.contains("Grapes")) {
                System.out.println("Grapes exists in the list.");
            } else {
                System.out.println("Grapes does not exist in the list.");
            }

//Add elements to a LinkedList, then remove the first and last element.

            LinkedList<String> name = new LinkedList<>();

            // Add elements
            name.add("Alice");
            name.add("Bob");
            name.add("Charlie");
            name.add("David");
            name.add("Eva");

            // Print original list
            System.out.println("Original LinkedList: " + name);

            // Remove first and last element
            name.removeFirst();
            name.removeLast();

            // Print updated list
            System.out.println("After removing first and last: " + name);
        }

}
