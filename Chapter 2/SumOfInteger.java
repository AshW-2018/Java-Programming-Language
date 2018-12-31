/* Sum the digits in an integer
   
   Write a program that reads an integer between 0 and
   1000 and adds all the digits in the integer. 
   
   For example, if an integer is 932, the sum of all its 
   digits is 14.
 */
 
import java.util.Scanner;

public class SumOfInteger {
   public static void main(String[] args) {
   
      //Create Scanner Object
      Scanner input = new Scanner(System.in);
      
      //Prompt user to enter a number 
      System.out.print("Enter a number between 0 and 1000: ");
      int number = input.nextInt();
      
      //Calculate the sum of all the digits
      double digitOne = number % 10;
      double removeDigitOne = (int) number / 10;
      
      double digitTwo = removeDigitOne % 10;
      double removeDigitTwo = (int) removeDigitOne / 10;
      
      double digitThree = removeDigitTwo% 10;
      
      int sum = (int) (digitOne + digitTwo + digitThree);
      
      //Display Result
      System.out.println("The sum of the digits is " + sum);  
   }
 }