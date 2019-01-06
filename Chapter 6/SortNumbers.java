/* Sort three numbers

   Write a method with the following header to display three
   numbers in increasing order:
      
      public static void displaySortedNumbers(
         double num1, double num2, double num3)

   Write a test program that prompts the user to enter three 
   numbers and invokes the method to display them in increasing 
   order.

*/

import java.util.Scanner;

public class SortNumbers {
   public static void main(String[] args) {
   
      //Create Scanner Object
      Scanner input = new Scanner(System.in);
      
      //Prompt user to enter 3 numbers
      System.out.print("Enter 3 numbers: ");
      double number1 = input.nextDouble();
      double number2 = input.nextDouble();
      double number3 = input.nextDouble();
      
      //Display results
      System.out.println(number1 + ", " + number2 + ", and " + number3 + 
         " sorted is ");
      displaySortedNumbers(number1, number2, number3); 
   }
   
   //Method to sort numbers
   public static void displaySortedNumbers(double num1, double num2, double num3) {
      
      double temp;
      
      //Put numbers in order
      if(num2 < num1 && num2 < num3) {
         temp = num1;
         num1 = num2;
         num2 = temp;
      } else if(num3 < num1 && num3 < num2){
         temp = num1; 
         num1 = num3;
         num3 = temp;
      }else if(num3 < num2) {
         temp = num2;
         num2 = num3;
         num3 = temp;
      }
      
      //Print
      System.out.println(num1 + ", " + num2 + ", and " + num3);
   }
 }