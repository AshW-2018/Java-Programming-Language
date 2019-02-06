/* Largest row and column
  
   Write a program that randomly fills in 0s and 1s into
   a 4-by-4 matrix, prints the matrix, and finds the first
   row and column with the most 1s.
   
   Here is a sample run of the program:
   0011
   0011
   1101
   1010
   The largest row index: 2
   The largest column index: 2
*/

import java.util.Scanner;

public class LargestRowAndColumn {
   public static void main(String[] args) {
      
     //Creat matrix
     int[][] m = new int[4][4];
     
     //Fill matrix with zeros and ones
     int largestRowIndex = 0;
     int largestNum = -1;
  
     for (int r = 0; r < m.length; r ++) {
       int rowCount = 0;
         for (int c = 0; c < m[r].length; c++) {
                m[r][c] = (int)(Math.random() * 2);
                rowCount += m[r][c];
         }
            
          if (rowCount > largestNum) {
            largestRowIndex = r;
            largestNum = rowCount;
          }
      }

     //Determine the largest column index
     int largestColumnIndex = 0;
     largestNum = -1;
     
     for (int c = 0; c < m[0].length; c++) {
        int columnCount = 0;
           for (int r = 0; r < m.length; r++) {
                columnCount += m[r][c];
            }
            if (columnCount > largestNum) {
                largestNum = columnCount;
                largestColumnIndex = c;
            }
      }

     //Display results
     for (int r = 0; r < m.length; r++) {
            for (int c = 0; c < m[r].length; c++) {
                System.out.print(m[r][c]);
            }
            System.out.println(" ");
     }
     System.out.println("The largest row index: " + largestRowIndex);
     System.out.println("The largest column index: " + largestColumnIndex);
   }
 }
