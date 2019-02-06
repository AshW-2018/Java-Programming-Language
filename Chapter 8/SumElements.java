/* Sum elements column by column
   
   Write a method that returns the sum of all the
   elements in a specified column in a matrix using the 
   following header:
   
   public static double sumColumn(double[][] m, 
         int columnIndex)
         
   Write a test program that reads a 3-by-4 matrix and 
   displays the sum of each column.
*/

import java.util.Scanner;

public class SumElements {
   public static void main(String[] args) {
      
      //Create Scanner Object 
      Scanner input = new Scanner(System.in);
      
      //Prompt user to enter a matrix
      System.out.println("Enter a 3-by-4 matrix row by row: ");
      
      //Create matrix
      double [][] matrix = new double[3][4];
      for(int r = 0; r < matrix.length; r++) {
         for(int c = 0; c < matrix[r].length; c++) {
             matrix[r][c]  = input.nextDouble();
         }
      }
      
      //Display results
      for(int c = 0; c < matrix[0].length; c++) {
         System.out.println("Sum of the elements at column " +
            c + " is " + sumColumn(matrix, c));
      }
   }
   
   //Method that calculates the sum of a specified column
   public static double sumColumn(double[][] m, int columnIndex) {
      
      double sum = 0;
      
      for(int r = 0; r < m.length; r++) {
         sum += m[r][columnIndex];
      }
      
      return sum;
   }
}