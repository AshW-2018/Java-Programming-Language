/* Algebra: add two matrices
   
   Write a method to add two matrices. The header of
   the method is as follows:

   public static double[][] addMatrix(double[][] a, 
      double[][] b) 
   
   In order to be added, the two matrices must have the same
   dimensions and the same or compatible types of elements. 
   Let c be the resulting matrix. Each element 
   cij is aij + bij. For example, for two 3 * 3 matrices "a"
   and "b", "c" is
   
   a11 a12 a13    b11 b12 b13    (a11 + b11)(a12 + b12)(a13 + b13)
   a21 a22 a23  + b21 b22 b23 +  (a21 + b21)(a22 + b22)(a23 + b23)
   a31 a32 a33    b31 b32 b33    (a31 + b31)(a32 + b32)(a33 + b33)
   
   Write a test program that prompts the user to enter two 
   3 * 3 matrices and displays their sum. 
*/

import java.util.Scanner;

public class AddMatrices {
   public static void main(String[] args) {
      
      //Create Scanner Object
      Scanner input = new Scanner(System.in);
      
      //Prompt user to enter martix 1
      System.out.print("Enter matrix1: ");
      
      //Create matrix
      double[][] matrix1 = new double[3][3];
      for(int r = 0; r < matrix1.length; r++) {
         for(int c = 0; c < matrix1[r].length; c++) {
            matrix1[r][c] = input.nextDouble();
         }
      }
      
      //Prompt user to enter matrix 2
      System.out.print("Enter matrix2: ");
      
      //Create matrix
      double[][] matrix2 = new double[3][3];
      for(int r = 0; r < matrix2.length; r++) {
         for(int c = 0; c < matrix2[r].length; c++) {
            matrix2[r][c] = input.nextDouble();
         }
      }
      
      //Display results
      double[][] result = addMatrix(matrix1, matrix2);
      
      System.out.println("The matrices are are added as follows: ");
      
      for (int r = 0; r < result.length; r++) {
      
         //Print matrix 1
         for (int c = 0; c < result[0].length; c++) {
 
            System.out.print(matrix1[r][c] + " ");
               if (r == 1 && c == 2) 
                  System.out.print(" +  );
               else 
                  System.out.print("  ");
          }
         
         //Print matrix 2
         for (int c = 0; c < result[0].length; c++) {
            System.out.print(matrix2[r][c] + " ");
               if (r == 1 && c == 2) 
                  System.out.print(" = ");
               else 
                  System.out.print("  ");
         }
         
         //Print results
         for (int c = 0; c < result[0].length; c++) {
             System.out.print(result[r][c] + " ");
         }
         System.out.println();
      }
   }
   
   //Method for adding matrices
   public static double[][] addMatrix(double[][] a, double[][] b) {
      
     //Check if input is invalid
     if(a.length != b.length || a[0].length != b[0].length)
      return null;
     
     //Add matrices
     double[][] result = new double[b.length][a.length];
     
     for(int r = 0; r < result.length; r++) {
       for(int c = 0; c < result[0].length; c++) {
          result[r][c] = a[r][c] + b[r][c];
       }
     }
     return result;
   }
}