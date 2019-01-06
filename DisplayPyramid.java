/* Display pyramid 
   
   Write a program that prompts the user to enter an integer from
   1 to 15 and displays a pyramid, as shown in the following sample run:
   
   Enter the number of lines: 7
                           1
                         2 1 2
                       3 2 1 2 3
                     4 3 2 1 2 3 4
                   5 4 3 2 1 2 3 4 5
                 6 5 4 3 2 1 2 3 4 5 6
               7 6 5 4 3 2 1 2 3 4 5 6 7
*/
import java.util.Scanner;

public class DisplayPyramid {
   public static void main(String[] args) {
      
      //Create Scanner Object
      Scanner input = new Scanner(System.in);
      
      //Prompt user to enter number of lines
      System.out.print("Enter number of lines: ");
      int numOfLines = input.nextInt();
      
      //Display results
      for (int rows = 1; rows <= numOfLines; rows++) {
			
         //Create spaces between each number 
			for (int s = (numOfLines - rows); s >= 1; s--) {
				System.out.print("  ");
			}
         
			//Create descending numbers in each row
			for (int d = rows; d >= 2; d--) {
				System.out.print(d + " ");
			}
			
         //Create ascending number in each row
			for (int a = 1; a <= rows; a++) {
				System.out.print(a + " ");
			}
			
			System.out.println("");
      }
    }
 }