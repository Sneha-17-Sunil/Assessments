package org.sneha.Conditional_Statements;

import java.util.Scanner;

/*Write a program to find the factorial of any number entered by the user.
 */
public class Factorial {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Please Enter the number to find factorial");
        int n = sc.nextInt();
        int fact=1; //can't be initialized to zero bcz anything multiplies by zero will be zero

        for(int i=n; i>=1; i--){
            fact = i*fact;
        }
        System.out.println(fact);
    }

}
