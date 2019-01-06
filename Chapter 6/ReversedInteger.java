/* Display an integer reversed
   
   Write a method with the following header to display
   an integer in reverse order:
      
      public static void reverse(int number)
   
   For example, reverse(3456) displays 6543. Write a test
   program that prompts the user to enter an integer and 
   displays its reversal.

*/

import java.util.*;

public class ReversedInteger {
   public static void main(String[] args) {
      
      //Create Scanner Object
      Scanner input = new Scanner(System.in);
      
      //Prompt user to enter an integer
      System.out.print("Enter an integer: ");
      int number = input.nextInt();
      
      //Display result
      System.out.print(number + " reversed is ");
      reverse(number);
   }
   
   //Method to reverse the integer
   public static void reverse(int number){
      
      while(number > 0) {
         System.out.print(number % 10);
         number /= 10;
      }
   }
 }