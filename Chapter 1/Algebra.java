/* Algebra: Solve 2 x 2 Linear Equations

   Cramer's Rule:
      
      ax + by = e   x = ed - bf	  y = af - ec
		cx + dy = f       ad - bc        ad - bc

   Write a program that solves the following equation and 
   displays the value for x and y:
         3.4x + 50.2y = 44.5
         2.1x + .55y = 5.9
         
      
*/


import java.util.*;

public class Algebra {
   public static void main(String[] args) {
    
    //Calculate x and y using Cramer's Rule
    System.out.println("x = " + (((44.5 * .55) - (50.2 * 5.9)) / ((3.4 * .55) - (50.2 * 2.1))));
    System.out.println("y = " + (((3.4 * 5.9) - (44.5 * 2.1)) / ((3.4 * .55) -(50.2 * 2.1))));
  } 
}