package org.sneha.Variables_DataTypes;

import java.util.Scanner;

public class Cost {
    public static void main(String[] args) {

    //Declaring the variables
     float pencil;
     float pen;
     float eraser;

    //Taking inputs from users
     Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the cost of pencil");
        pencil = sc.nextFloat();
        System.out.println("Please enter the cost of pen");
        pen = sc.nextFloat();
        System.out.println("Please enter the cost of eraser");
        eraser = sc.nextFloat();

    //Generating the bill amount
        double bill = pencil + pen + eraser + 0.18; //adding GST amount 18% GST

        System.out.println("Please pay your bill amount "+bill);

        sc.close();

    }
}
