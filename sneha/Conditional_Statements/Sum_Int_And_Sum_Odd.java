package org.sneha.Conditional_Statements;

import java.util.Scanner;

public class Sum_Int_And_Sum_Odd {
    public static void main(String[] args) {
        int[] x = new int[10];
        int sum_even=0, sum_odd=0;

        Scanner sc= new Scanner(System.in);

        System.out.print("Please enter set of values");
        for(int i=0; i<x.length; i++){
            x[i] = sc.nextInt();

            if(x[i]%2 == 0)
                sum_even += x[i];
            else
                sum_odd += x[i];
        }
        System.out.println("Sum of even numbers "+sum_even+" "+ "Sum of odd numbers "+sum_odd);

    }
}
