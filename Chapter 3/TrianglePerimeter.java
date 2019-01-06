/* Compute the perimeter of a triangle 
   
   Write a program that reads three edges for a triangle and computes 
   the perimeter if the input is valid. Otherwise, display that the input 
   is invalid. The input is valid if the sum of every pair of two edges is
   greater than the remaining edge. 

*/

import java.util.Scanner;

public class TrianglePerimeter {
   public static void main(String[] args) {
   
      //Create Scanner Object
      Scanner input = new Scanner(System.in);
      
      //Prompt user to enter 3 edges for triangle
      System.out.println("Enter 3 edge values for a triangle");
      
      System.out.print("Points x and y for edge 1: ");
      double x1 = input.nextDouble();
      double y1 = input.nextDouble();
      
      System.out.print("Points x and y for edge 2: ");
      double x2 = input.nextDouble();
      double y2 = input.nextDouble();
      
      System.out.print("Points x and y for edge 3: ");
      double x3 = input.nextDouble();
      double y3 = input.nextDouble();
      
      //Check if input is valid 
      boolean valid = ((x1 + y1) > (x3 + y3) && (x2 + y2) > (x3 + y3) ||
                       (x1 + y1) > (x2 + y2) && (x3 + y3) > (x2 + y2) ||
                       (x3 + y3) > (x1 + y1) && (x2 + y2) > (x1 + y1));
      
      //Use Pythagorean Theorem to calculate the sides of the triangle
      double side1 = Math.pow((Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2)), 0.5);
      double side2 = Math.pow((Math.pow(x3 - x2, 2) + Math.pow(y3 - y2, 2)), 0.5);      
      double side3 = Math.pow((Math.pow(x1 - x3, 2) + Math.pow(y1 - y3, 2)), 0.5);      
      
      //Calculate the perimeter
      double perimeter = side1 + side2 + side3;
      
      //Display Results
      if(valid) {
         System.out.println("The perimeter of the triangle is " + perimeter);
      } else {
         System.out.println("Input is Invalid");
      }
   }
}