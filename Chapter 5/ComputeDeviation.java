/* Statistics: compute mean and standard deviation 
   
   In business applications, you are often asked to compute the mean 
   and standard deviation of data. The mean is simply the average of
   the numbers. The standard deviation is a statistic that tells
   you how tightly all the various data are clustered around the mean in 
   a set of data. For example, what is the average age of the students in
   a class? How close are the ages? If all the students are the same age, 
   the deviation is 0.
   
   Write a program that prompts the user to enter ten numbers, and 
   displays the mean and standard deviations of these numbers using 
   the following formula: 
     
         mean = (x1 + x2 + ... + xn) / n 
         deviation = Math.sqrt((Math.pow(mean, 2) - (Math.pow(mean, 2) / n)) / (n - 1)
*/

import java.util.Scanner;

public class ComputeDeviation {
   public static void main(String[] args) {
      
      //Create Scanner Object
      Scanner input = new Scanner(System.in);
      
      //Declare and initialize variables
      double mean = 0;
      double deviation = 0 ;
      
      //Prompt user to enter 10 numbers
      System.out.print("Enter ten numbers: ");
           
      //Calculate the mean and standard deviation
      for(int i = 1; i <= 10; i++) {
          double nums = input.nextDouble();
          mean += nums;
          deviation += Math.pow(nums, 2);
      }
      
      mean /= 10;
      deviation = Math.sqrt((deviation - (Math.pow(mean, 2) / 10)) / (10 - 1));  
      
      
      //Display results
      System.out.println("The mean is " + mean);
      System.out.printf("The standard deviation is %0.5f", deviation);
   }
 }