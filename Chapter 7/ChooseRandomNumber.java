/* Random number chooser
   
   Write a method that returns a random number between
   1 and 54, excluding the numbers passed in the argument. 
   The method header is
   specified as follows:
   
      public static int getRandom(int... numbers)
 */

import java.util.Scanner;

public class ChooseRandomNumber {
   public static void main(String[] args) {
   
      //Create Scanner object 
      Scanner input = new Scanner(System.in);
      
      //Prompt user to enter integers
      System.out.print("Enter five integers: ");
      
      //Create array 
      int[] nums = new int[5];
      
      for(int i = 0; i < nums.length; i++) {
         nums[i] = input.nextInt();
      }
      
      //Display results
      System.out.println("A random integer between 1-54 excluding the entered digits is " +
         getRandom(nums));
   
   }
   
   //Method for creating a random number
   public static int randomNum(int low, int high) {
      return (int)(low + Math.random() * (high - low + 1));
   }    
   
   //Method for choosing a random number
   public static int getRandom(int...numbers) { 
      
      int getRandom = 0;
      boolean stop = true;
      
      //Use while loop to generate number within parameters
      while(stop) {
         getRandom = randomNum(1, 54);
         
         //Test if random number is within parameters
         stop = false;
         for(int i : numbers) {
            if(getRandom == i) {
               stop = true;
               break;
            }
         }
      }
      return getRandom;
    }
 }