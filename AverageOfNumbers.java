/* Count positive and negative numbers and compute the 
   average of numbers
  
   Write a program that reads an unspecified number of integers,
   determines how many positive and negative values have been read, 
   and computes the total and average of the input values 
   (not counting zeros). Your program ends with the input 0. Display
   the average as a floating-point number.
*/

import java.util.Scanner;

public class AverageOfNumbers {
   public static void main(String[] args) {
      
      //Create Scanner Object
      Scanner input = new Scanner(System.in);
      
      //Declare and initialize variable
      int pos = 0;
      int neg = 0;
      int count = 0;
      double total = 0;
      
      //Prompt user to enter an integer
      System.out.print("Enter an integer, the input ends if it is 0: ");
      int nums = input.nextInt();
      
      //Exit the program if only 0 is entered 
      if(nums == 0) {
         System.out.println("No numbers are entered except 0");
         System.exit(1);
      }
      
      //Loop
      while(nums != 0) {
         
         //Count number of negatives and positives
         if(nums > 0) 
            pos++;
         else 
            neg++;
         
         //Count the total
         total += nums;
         count++;
         
         //Check user input
         nums = input.nextInt();
      }
      
      //Calculate the average
      double avg = total / count;
      
      //Display results
      System.out.println("The number of positives " + pos); 
      System.out.println("The number of negatives " + neg);
      System.out.println("The total is " + total);
      System.out.println("The average is " + avg);        
   }
 }