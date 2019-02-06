/* The Location class
   
   Design a class named Location for locating a maximal value and 
   its location in a two-dimensional array. The class contains public 
   data fields row, column, and maxValue that store the maximal value 
   and its indices in a two-dimensional array with row and column as    
   int types and maxValue as a double type. 
   
   Write the following method that returns the location of the largest 
   element in a two-dimensional array:
   
   public static Location locateLargest(double[][] a) 

   The return value is an instance of Location. 
   Write a test program that prompts the user to enter a 
   two-dimensional array and displays the location of the largest 
   element in the array. 
 */

import java.util.Scanner;

public class Location {
   
   //Data Fields 
   public static int rows;
   public static int cols;
   public static double maxValue;
   
   //Constructor
   public Location(int rows, int cols, double maxValue) {
       this.rows = rows;
       this.cols = cols;
       this.maxValue = maxValue;
   }
   
   //Getter Methods 
   public int getRows() {
       return rows;
   }
   
   public int getCols() {
       return cols;
   }
   
   public double getMaxValue() {
       return maxValue;
   }
   
   //Setter Methods
   public void setRow(int rows) {
       this.rows = rows;
   }
      public void setCols(int cols) {
       this.cols = cols;
   }
      public void setMaxValue(double maxValue) {
       this.maxValue = maxValue;
   }
   
   //Method to find location of max value
   public static Location locateLargest(double a[][]) {
      
      maxValue = 0;
      
      for(int i = 0; i < a.length; i++)
      {
          for(int j = 0; j < a[0].length; j++)
          {
              if(maxValue < a[i][j]) {
                  maxValue = a[i][j];
                  rows = i;
                  cols = j;
              }
          }
      }
      
      //Create object
      Location location = new Location(rows, cols, maxValue);
         return location;
   }
}

class TestLocation {
   public static void main(String[] args) {
      
      //Create Object
      Scanner input = new Scanner(System.in);
      
      //Prompt user to enter number of rows and columns
      System.out.print("Enter the number of rows and columns in the array: ");
      int rows = input.nextInt();
      int cols = input.nextInt();
      
      //Prompt user to enter array
      System.out.println("Enter the array: ");
      double[][] arr = new double[rows][cols];
      for(int i = 1; i < rows; i++) { 
         for(int j = 1; j < cols; j++) {
            arr[i][j] = input.nextDouble();
         }
      }
      System.out.println(" ");
      
      //Invoke Method 
      Location loc = Location.locateLargest(arr);
      
      //Display Results
      System.out.println("The location of the largest element is " + 
         loc.getMaxValue() + " at " + "(" + loc.getRows() + ", " + 
         loc.getCols() + ")"); 
    }
}