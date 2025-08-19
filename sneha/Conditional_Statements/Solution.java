package org.sneha.Conditional_Statements;

/*Finish the following code so that it prints "You have a fever" if your
temperature is above 100 and otherwise prints "You don't have a fever". */

public class Solution {
    public static void main(String[] args) {

        /*
            double temp = 103.5;

            if(temp>100)
                System.out.println("You have a fever");
            else
                System.out.println("You don't have a fever");

         */

        int a= 63, b=36;

        boolean x= (a<b)?true:false;//ternary operator
        System.out.println(x);

        int y = (a>b)?a:b;//ternary operator
        System.out.println(y);

    }
}
