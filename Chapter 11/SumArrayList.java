/* Sum ArrayList
   
   Write the following method that returns the sum of all numbers 
   in an ArrayList:                                                               
   
      public static double sum(ArrayList<Double> list)                               
   
   Write a test program that prompts the user to enter 5 numbers, stores 
   them in an array list, and displays their sum. 
 */

import java.util.Scanner;
import java.util.ArrayList;

public class SumArrayList {
   public static void main(String[] args) {
      
      //Create Scanner Object
      Scanner input = new Scanner(System.in);
      
      //Create ArrayList
      ArrayList<Double> arrList = new ArrayList<>();
      
      //Prompt user to enter 5 numbers
      System.out.print("Enter 5 numbers: ");
      for(int i = 0; i < 5; i++) {
         arrList.add(input.nextDouble());
      }
            
      //Display Results
      System.out.println("Sum: " + sum(arrList));
   }
   
   //Method that returns the sum of the all numbers
   public static double sum(ArrayList<Double> list) {
      
      double sum = 0.0;
      for(int i = 0; i < list.size(); i++) {
         sum += list.get(i);
      }
      return sum;
   }
}