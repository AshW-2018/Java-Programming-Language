/* Locate the largest element
   
   Write the following method that returns the location
   of the largest element in a two-dimensional array.
      
      public static int[] locateLargest(double[][] a)
 
   The return value is a one-dimensional array that contains 
   two elements. These two elements indicate the row and column
   indices of the largest element in the two-dimensional array. 
   Write a test program that prompts the user to enter a two-
   dimensional array and displays the location of the largest 
   element in the array. 
*/

import java.util.Scanner;

public class LargestElement {
   public static void main(String[] args) {
      
      //Create Scanner Object
      Scanner input = new Scanner(System.in);
      
      //Prompt user to enter the number of rows and columns
      System.out.print("Enter the number of rows and columns of the array: ");
      int rows = input.nextInt();
      int cols = input.nextInt();
      
      //Prompt user to enter array and create array
      System.out.println("Enter the array: ");   
      
      double[][] arr = new double[rows][cols];
      for(int r = 0; r < rows; r++) {
         for(int c = 0; c < cols; c++) {
            arr[r][c] = input.nextDouble();
          }
       }
      
      //Display results
      int[] result = locateLargest(arr);
      System.out.println("The location of the largest element is (" +
         result + ")" );
      
   }
   
   //Method for locating largest element
   public static int[] locateLargest(double[][] a) {
      double max = 0;
      
      int[] returnValue = new int[2];
 
      for (int r = 0; r < a.length; r++) {
         for (int c = 0; c < a[r].length; c++) {
             if (a[r][c] > max) {
               max = a[r][c];
               returnValue[0] = r;
               returnValue[1] = c;
             }
         }
      }
      return returnValue;
  }
}