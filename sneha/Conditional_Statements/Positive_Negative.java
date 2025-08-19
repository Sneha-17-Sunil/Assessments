package org.sneha.Conditional_Statements;

import java.util.Scanner;
/*Write a  Java Program To Get A Number From The User And Print Whether It
Is positive or negative.*/

public class Positive_Negative {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter a number to check positive or negative");
        double num = sc.nextDouble();

        if(num>0)
            System.out.println("Number is positive");
        else if(num<0)
            System.out.println("Number is negative");
        else System.out.println("Number is neither positive nor negative");

        sc.close();
    }

}
