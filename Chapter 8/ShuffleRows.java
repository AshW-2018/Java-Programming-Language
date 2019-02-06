/* Write a method that shuffles the rows in a two-dimensional 
   int array using the following header:
   
   public static void shuffle(int[][] m)
   
   Write a test program that shuffles the following matrix:
   int[][] m = {{1, 2}, {3, 4}, {5, 6}, {7, 8}, {9, 10}};


*/

import java.util.Scanner;

public class ShuffleRows {
   public static void main(String[] args) {
   
      //Create Scanner Object
      Scanner input = new Scanner(System.in);
      
      //Create matrix
      int[][] m = {{1, 2}, {3, 4}, {5, 6}, {7, 8}, {9, 10}};
      
      //Display results
      System.out.println("Original Matrix: ");
      System.out.print("{");
         for (int r = 0; r < m.length; r++) {
            System.out.print("{");
            for (int c = 0; c < m[0].length; c++) {
               System.out.print(m[r][c]);
               
               if (c != m[0].length - 1) 
                   System.out.print(",");
               else if (r == m.length - 1) 
                  System.out.print("}");
               else 
                  System.out.print("},");
            }
         }
         System.out.print("};");
         System.out.println();
         
       shuffle(m);
       System.out.println("Shuffled Matrix: ");
         System.out.print("{");
         for (int r = 0; r < m.length; r++) {
            System.out.print("{");
            for (int c = 0; c < m[0].length; c++) {
               System.out.print(m[r][c]);
               
               if (c != m[0].length - 1) 
                   System.out.print(",");
               else if (r == m.length - 1) 
                  System.out.print("}");
               else 
                  System.out.print("},");
            }
         }
         System.out.print("};");
   }
   
   //Method for shuffling the matrix
   public static void shuffle(int[][] m) {
      
      int r = m.length;
      int c = m[0].length;
      int total = r * c;
 
      //Select random index and put it in current position
      for (int i = 0; i < total; i++) {
      int currentPos = randomNum(i, total - 1);
     
      //Random number
      int row = currentPos / r;
      int col = currentPos % c;
     
      //Determine row and column of random number
      int currentRow = i / r;
      int currentCol = i % c;
    
      //Swap current number with selected number
      int temp = m[row][col];
      m[row][col] = m[currentRow][currentCol];
      m[currentRow][currentCol] = temp;
     }
   }
   
  //Method for creating random numbers
   public static int randomNum(int low, int high) {
      return (int)(low + Math.random() * (high - low + 1));
   }    
}