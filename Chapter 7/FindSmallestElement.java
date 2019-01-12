/* Find the smallest element
   Write a method that finds the smallest element in an
   array of double values using the following header:
   
      public static double min(double[] array)

   Write a test program that prompts the user to enter ten numbers,
   invokes this method to return the minimum value, and displays 
   the minimum value
 */

import java.util.Scanner;

public class FindSmallestElement {
   public static void main(String[] args) {
      
      //Create Scanner object
      Scanner input = new Scanner(System.in);
      
      //Prompt user to enter integers
      System.out.print("Enter ten numbers: ");
      
      //Create array 
      double[] nums = new double[10];
      
      for(int i = 0; i < nums.length; i++) {
         nums[i] = input.nextDouble();
      }
      
      //Display results
      System.out.println("The minimum number: " + min(nums));  
   }
   
   //Method for finding the smallest element 
   public static double min(double[] array) { 
      
      double minNum = array[0];
      for(int i = 0; i < array.length; i++) {
         if(minNum > array[i]) {
            minNum = array[i];
         }
      }
      return minNum;
   }
}