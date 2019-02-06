//9.11
/* Algebra: 2 * 2 linear equations
   
   Design a class named LinearEquation for a  2 * 2 system of linear 
   equations: 
      ax + by = e 
      cx + dy = f 
      
      x = (ed - bf) / (ad - bc)
      y = (af - ec) / (ad - bc)
   
   The class contains:
   - Private data fields a, b, c, d, e, and f. 
   - A constructor with the arguments for a, b, c, d, e, and f. 
   - Six getter methods for a, b, c, d, e, and f. 
   - A method named isSolvable() that returns true if ad - bc is not 0. 
   - Methods getX() and getY() that return the solution for the equation. 
   
   Draw the UML diagram for the class and then implement the class. 
   Write a test program that prompts the user to enter a, b, c, d, e, 
   and f and displays the result. If ad - bc  is 0, report that 
   “The equation has no solution.”

 */

import java.util.Scanner;
import java.util.*;
import java.text.*;

/*************** UML Diagram *****************
   LinearEquation
_____________________________________________
 - a: double
 - b: double
 - c: double
 - d: double
 - e: double
 - f: double
______________________________________________
 + LinearEquation(A: double, B: double, C:
   double, D: double, E: double, F: double)
 + getA(): double 
 + getB(): double 
 + getC(): double 
 + getD(): double 
 + getE(): double 
 + getF(): double 
 + isSolvable(): boolean 
 + getX(): double 
 + getY(): double 
**********************************************/

public class LinearEquation {
   
   //Data Fields
   private double a;
   private double b;
   private double c;
   private double d;
   private double e;
   private double f;
   
   //Constructor
   LinearEquation(double a, double b, double c, double d, 
      double e, double f) {
      a = a;
      b = b;
      c = c;
      d = d;
      e = e;
      f = f;
   }
   
   //Getter Methods
   public double getA() {
      return a;
   }
   
   public double getB() {
      return b;
   }
   
   public double getC() {
      return c;
   }

   public double getD() {
      return d;
   }

   public double getE() {
      return e;
   }

   public double getF() {
      return f;
   }

   //Boolean Method
   public boolean isSolvable() {
      if(((a * d) - (b * c)) == 0)
         return false;
      else
         return true;
   }
   
   //Getter Methods for X and Y
   public double getX() {
      double num = ((e * d) - (b * f));
      double denom = ((a * d) - (b * c));
      return (num / denom);
   }
   
   public double getY() {
      double num = ((a * f) - (e * c));
      double denom = ((a * d) - (b * c));
      return (num / denom);
   }
}

class TestLinearEquation {
   public static void main(String[] args) { 
      
      //Create Objects
      Scanner input = new Scanner(System.in);
      DecimalFormat decFormat = new DecimalFormat("##.##");
      
      //Initialize variables
      String num = " ";
      double a, b, c, d, e, f = 0;
      
      //Prompt user for variable values
      System.out.print("Enter the value of a: ");
      num = input.next();
      a = Double.parseDouble(num);
      
      System.out.print("Enter the value of b: ");
      num = input.next();
      b = Double.parseDouble(num);
      
      System.out.print("Enter the value of c: ");
      num = input.next();
      c = Double.parseDouble(num);

      System.out.print("Enter the value of d: ");
      num = input.next();
      d = Double.parseDouble(num);

      System.out.print("Enter the value of e: ");
      num = input.next();
      e = Double.parseDouble(num);

      System.out.print("Enter the value of f: ");
      num = input.next();
      f = Double.parseDouble(num);
      
      //Create Object
      LinearEquation equ = new LinearEquation(a, b, c, d, e, f);
      
      //Display Results
      if(equ.isSolvable()) {
         System.out.println("X = " + decFormat.format(equ.getX()));
         System.out.println("Y = " + decFormat.format(equ.getY()));
      } else {
         System.out.println("The equation has no solution");
      }
   }
}