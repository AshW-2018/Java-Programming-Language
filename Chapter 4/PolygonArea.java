/* Geometry: area of a regular polygon 
   
   A regular polygon is an n-sided polygon in which all sides are 
   of the same length and all angles have the same degree (i.e., the
   polygon is both equilateral and equiangular). The formula for 
   computing the area of a regular polygon is
   
         Area = (n * (s*s)) / 4 * tan(PI / n)
   
   Here, s is the length of a side. Write a program that prompts the 
   user to enter the number of sides and their length of a regular 
   polygon and displays its area.
*/

import java.util.Scanner;

public class PolygonArea {
   public static void main(String[] args) {
   
      //Create Scanner Object
      Scanner input = new Scanner(System.in);
      
      //Prompt user to enter the number of sides
      System.out.print("Enter the number of sides: ");
      int n = input.nextInt();
      
      //Prompt user to enter the side value
      System.out.print("Enter the side: ");
      double s = input.nextDouble();
      
      //Calculate the area
      double area = (n * Math.pow(s, 2)) / (4 * (Math.tan(Math.PI / n)));
      
      //Display results
      System.out.println("The area of the polygon is " + area);   
  }
} 