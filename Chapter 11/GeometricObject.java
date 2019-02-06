/* The Triangle class
   
   Design a class named Triangle that extends GeometricObject. 
   The class contains:
   - Three double data fields named side1, side2, and side3 with default
     values 1.0 to denote three sides of the triangle. 
   - A no-arg constructor that creates a default triangle. 
   - A constructor that creates a triangle with the specified side1,
     side2, and side3. 
   - The accessor methods for all three data fields. 
   - A method named getArea() that returns the area of this triangle. 
   - A method named getPerimeter() that returns the perimeter of this 
     triangle. 
   - A method named toString() that returns a string description for the
     triangle. For the formula to compute the area of a triangle, see 
     Programming Exercise 2.19. The toString() method is implemented as 
     follows:
     
     return "Triangle: side1 = " + side1 + " side2 = " + side2 + " 
     side3 = " + side3; 
     
     Draw the UML diagrams for the classes Triangle
     and GeometricObject and implement the classes. Write a test program
     that prompts the user to enter three sides of the triangle, a color,
     and a Boolean value to indicate whether the triangle is filled. The
     program should create a Triangle object with these sides and set the
     color and filled properties using the input. The program should 
     display the area, perimeter, color, and true or false to indicate 
     whether it is filled or not. 
 */
 
import java.util.Scanner;
import java.util.Date;
import java.lang.Math;

/*************** UML Diagram *****************
   GeometricObject
_____________________________________________
 - color: String
 - filled: boolean;
 - dateCreated: java.util.Date;
______________________________________________
 + GeometricObject()
 + GeometricObject(color: String, filled: boolean)
 + getColor(): String
 + getDateCreated(): java.util.Date
 + isFilled(): boolean
 + setFilled(filled: boolean): void
 + toString(): String
**********************************************/


/*************** UML Diagram *****************
   Triangle
_____________________________________________
 - side1: double
 - side2: double
 - side3: double
______________________________________________
 + Triangle()
 + Triangle(side1: double, side2: double,
   side3: double)
 + getSide1(): double
 + getSide2(): double
 + getSide3(): double
 + getArea(): double
 + getPerimeter: double
 + toString(): String
**********************************************/
public class GeometricObject {
   
   //Data Field
   private String color = "white";
	private boolean filled;
	private java.util.Date dateCreated;

   //Constructors
	public GeometricObject() {
		dateCreated = new java.util.Date();
	}

	public GeometricObject(String color, boolean filled) {
      
      this.color = color;
		this.filled = filled;
		dateCreated = new java.util.Date();
	}

   //Getter Methods
	public String getColor() {
		return color;
	}
   
   public java.util.Date getDateCreated() {
	   return dateCreated;
	}
      
   //Setter Method
	public void setColor(String color) {
		this.color = color;
	}


   //Method that returns if object is filled
	public boolean isFilled() {
		return filled;
	}
   
   //Method that sets filled
	public void setFilled(boolean filled) {
		this.filled = filled;
	}

	//Method that returns string description
	public String toString() {
		return "Created on: " + dateCreated + "\nColor: " + color + 
			" \nFilled: " + filled;
	}
   
}
class Triangle extends GeometricObject {
   
   //Data Fields 
   private double side1;
   private double side2;
   private double side3;
   
   //Constructors
   public Triangle() {
      side1 = 1.0;
      side2 = 1.0;
      side3 = 1.0;
   }
   
   public Triangle(double side1, double side2, double side3) {
      this.side1 = side1;
      this.side2 = side2;
      this.side3 = side3;
   }
   
   //Getter Methods
   public double getSide1() {
      return side1;
   }
   
   public double getSide2() {
      return side2;
   }
   
   public double getSide3() {
      return side3;
   }
   
   //Method that returns area
   public double getArea() {
      
      double s = (side1 + side2 + side3)/2;
      double area = Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
      return area;
   }
   
   //Method that returns perimeter
   public double getPerimeter() {
      return side1 + side2 + side3;
   }
   
   //Method that returns string description
   @Override
   public String toString() {
      return "Triangle: \nside1 = " + getSide1() + "\nside2 = " + getSide2() + 
     " \nside3 = " + getSide3();
   }
}

class TestTriangle {
   public static void main(String[] args) {
      
      //Creat Scanner Object
      Scanner input = new Scanner(System.in);
      
      //Prompt user to enter side values 
      System.out.print("Enter side value 1: ");
      double side1 = input.nextDouble(); 
      double side2 = input.nextDouble(); 
      double side3 = input.nextDouble();      
      
      //Prompt user to enter a color
      System.out.print("Enter a color: ");
      String color = input.next();
      
      //Prompt user to enter whether object is filled
      System.out.print("The triangle filled (T/F): ");
      boolean filled = input.nextBoolean();
      
      //Create Triangle Object
      Triangle tri = new Triangle(side1, side2, side3);
      
      //Display results
      tri.setColor(color);
      tri.setFilled(filled);
      
      System.out.println(tri.toString());
      System.out.println(" ");
		System.out.println("Area: " + tri.getArea());
		System.out.println("Perimeter: " + tri.getPerimeter());
		System.out.println("Color: " + tri.getColor());
		System.out.println("Triangle is" + (tri.isFilled() ? "" : " not ") 
			+ " filled");
   }
}