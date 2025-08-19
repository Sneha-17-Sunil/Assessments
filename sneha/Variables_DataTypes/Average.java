package org.sneha.Variables_DataTypes;

import java.util.Scanner;

public class Average {
    public static void main(String[] args) {

        //Taking inputs from user
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter the value of A");
        int A = sc.nextInt();
        System.out.println("Please Enter the value of B");
        int B = sc.nextInt();
        System.out.println("Please Enter the value of C");
        int C = sc.nextInt();

        //To find the sum of numbers
        int sum = A+B+C;
        int n=3;

        //To find the average of numbers
        double Avg = sum/n;

        System.out.println("The average of numbers A B C is "+Avg);

        sc.close();

    }
}
