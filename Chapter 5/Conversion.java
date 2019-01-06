/* Conversion from kilograms to pounds 
   
   Write a program that displays the following table 
   (note that 1 kilogram is 2.2 pounds):
   
         Kilograms Pounds
         1 2.2
         3 6.6
         ...
         197 433.4
         199 437.8
*/

import java.util.*;

public class Conversion {
   public static void main(String[] args) {
      
      //Create constant 
      final double POUNDS_PER_KILOGRAM = 2.2;
      
      //Display header
      System.out.printf("%-15s %6s","Kilograms","Pounds");
      System.out.println(" ");
      
      //Display table
      for(int i = 1; i <= 199; i += 2) {
         System.out.printf("%-15d %7f \n", i, (i * POUNDS_PER_KILOGRAM));
      }
   }
 }