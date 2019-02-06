//10.4
/* The MyPoint class 
   
   Design a class named MyPoint to represent a point with x- and 
   y-coordinates. The class contains:
   - The data fields x and y that represent the coordinates with getter 
     methods. 
   - A no-arg constructor that creates a point (0, 0). 
   - A constructor that constructs a point with specified coordinates. 
   - A method named distance that returns the distance from this point 
     to a specified point of the MyPoint type. 
   - A method named distance that returns the distance from this point 
     to another point with specified x- and y-coordinates. 
     
     Draw the UML diagram for the class and then implement the class. 
     Write a test program that creates the two points (0, 0) and 
     (10, 30.5) and displays the distance between them. 

 */

import java.util.Scanner;

/*************** UML Diagram *****************
   MyPoint
_____________________________________________
 - x: double
 - y: double
______________________________________________
 + MyPoint()
 + MyPoint(x: double, y: double) 
 + getX(): double
 + getY(): double
 + distance(point: Mypoint): double
 + distance(x: double, y: double): double 
**********************************************/


public class MyPoint {
   
   //Data Fields
   private double x;
   private double y;
   
   //Constructors
   public MyPoint() {
      this(0,0);
   }
   
   public MyPoint(double x, double y) {
      this.x = x;
      this.y = y;
   }
   
   //Getter Methods
   public double getX() {
      return x;
   }
   
   public double getY() {
      return y;
   }
   
   //Distance
   public double distance(MyPoint point) {
      return Math.sqrt(Math.pow(point.getX() - this.getX(), 2) +
         Math.pow(point.getY() - this.getY(), 2));
   
   }
   
   public double distance(double x, double y) {
      return Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
   }
   
}

class TestMyPoint {
   public static void main(String[] args) {
      
      //Create Object
      MyPoint point1 = new MyPoint();
      MyPoint point2 = new MyPoint(10, 30.5);
      
      //Call Distance Method
      double distance = point1.distance(point2);
      
            
      //Display Results
      System.out.println("The first point is (" + point1.getX() + ", " +
         point1.getY() + ")");
      System.out.println("The second point is (" + point2.getX() + "," +
         point2.getY() + ")");
      System.out.println("The distance between these points is " + distance);
   }
}