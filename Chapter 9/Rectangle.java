/* TheRectangleclass:
   
   Following the example of the Circle class in Section 9.2, 
   design a class named Rectangle to represent a rectangle. 
   The class contains:
   
   - Two double data fields named width and height that specify the 
     width and height of the rectangle. The default values are 1 for 
     both width and height. 
   - A no-arg constructor that creates a default rectangle. 
   - A constructor that creates a rectangle with the specified width 
     and height.
   - A method named getArea() that returns the area of this rectangle.
   - A method named getPerimeter() that returns the perimeter.
   
   Draw the UML diagram for the class and then implement the class.
   Write a test program that creates two Rectangle objects—one with 
   width 4 and height 40 and the other with width 3.5 and height 35.9.
   Display the width, height, area, and perimeter of each rectangle in 
   this order. 
 */

import java.util.Scanner;

/*************** UML Diagram *****************
   Rectangle
_____________________________________________
 - width: double
 - height: double
______________________________________________
 + Rectangle()
 + Rectangle(width: double, height: double)
 + getArea(): double
 + getPerimeter(): double 
**********************************************/

public class Rectangle {
   
   //Data Fields
   double width = 1;
   double height = 1;
   
   //Constructors
   public Rectangle() {
   }
   
   public Rectangle(double width, double height) {
      this.width = width;
      this.height = height;
   }
   
   //Getter Methods
   public double getArea() {
      return width * height;
   }
   
   public double getPerimeter() {
      return (2 * width) + (2 * height);
   }
}

class TestRectangle {
   public static void main(String[] args) {
      
      //Create Objects
      Rectangle rect1 = new Rectangle(4, 40);
      Rectangle rect2 = new Rectangle(3.5, 35.9);
      
      //Display Results for Rectangle 1
      System.out.println("The width of rectangle 1 is " + rect1.width +
         " and the height is " + rect1.height + "."); 
      System.out.println("The area of rectangle 1 is " +
         rect1.getArea() + " and its perimeter is " + rect1.getPerimeter() + "." );
         System.out.println(" ");
      
      //Dispaly Results for Rectangle 2
      System.out.println("The width of rectangle 2 is " + rect2.width +
         " and the height is " + rect2.height + ".");
      System.out.println("The area of rectangle 2 is " +
         rect2.getArea() + " and its perimeter is " + rect2.getPerimeter() + "." );   }
}