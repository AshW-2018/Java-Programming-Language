/* Find the index of the smallest element
  
   Write a method that returns the index of
   the smallest element in an array of integers. If the number of 
   such elements is greater than 1, return the smallest index. Use 
   the following header:
   
      public static int indexOfSmallestElement(double[] array)
   
   Write a test program that prompts the user to enter ten numbers, invokes this
   method to return the index of the smallest element, and displays the index
 */

import java.util.Scanner;

public class FindSmallestElementIndex {
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
      System.out.println("The index of the smallest number: " +
        indexOfSmallestElement(nums));
   }
    
    //Method for finding the smallest number's index
    public static int indexOfSmallestElement(double[] array) { 
      
      double minNum = array[0];
      int currentIndex = 0;
      
      for(int i = 0; i < array.length; i++) {
         if(minNum > array[i]) {
            minNum = array[i];
            currentIndex = i;
         }
      }
      return currentIndex;
    }
}