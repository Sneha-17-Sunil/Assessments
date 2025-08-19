package org.sneha.Operators;

public class Test {
    public static void main(String[] args) {

      /* 1.
        int x=2, y=5;

         int exp1 = (x*y/x);
         int exp2 = (x*(y/x));

        System.out.print(exp1 + ",");
        System.out.println(exp2);

       */

     /* 2.
     int x= 200, y=50, z=100;

        if(x>y && y>z)
            System.out.println("Hello");

        if(z>y && z>x)
            System.out.println("Java");

        if((y+200)<x && (y+150)<z)
      */

     /* 3. */
    int x= 10, y=5;

    int exp1 = (y * (x/y + x/y));
    int exp2 = (y * x/y + y * x/y);

        System.out.println(exp1);
        System.out.println(exp2);
    }
}
