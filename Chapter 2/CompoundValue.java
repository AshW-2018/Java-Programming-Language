/* Financial application: compound value
   
   Suppose you save $100 each month into a savings account with 
   the annual interest rate 5%. Thus, the monthly interest rate is
   0.05/12 = 0.00417. After the first month, the value in the 
   account becomes
   
   100 * (1 + 0.00417) = 100.417
   
   After the second month, the value in the account becomes
   (100 + 100.417) * (1 + 0.00417) = 201.252

   After the third month, the value in the account becomes
   (100 + 201.252) * (1 + 0.00417) = 302.507
   
   and so on.
   
   Write a program that prompts the user to enter a monthly saving 
   amount and displays the account value after the sixth month. 
*/
 
import java.util.Scanner;

public class CompoundValue {
   public static void main(String[] args) {
      
      //Create Scanner Object
      Scanner input = new Scanner(System.in);
      
      //Create final constant
      final double RATE = 0.00417;
      
      //Prompt user to enter monthly savings
      System.out.print("Enter the monthly saving amount: ");
      double savings = input.nextDouble();
      
      //Calculate monthly savings after 6 months
      double accountValueOne = savings * (1 + RATE);
      double accountValueTwo = (savings + accountValueOne) * (1 + RATE);
      double accountValueThree = (savings + accountValueTwo) * (1 + RATE);
      double accountValueFour = (savings + accountValueThree) * (1 + RATE);
      double accountValueFive = (savings + accountValueFour) * (1 + RATE);
      double accountValueSix = (savings + accountValueFive) * (1 + RATE);
      
      //Round the value to two decimal places
      accountValueSix = (int)(accountValueSix * 100) / 100.0;
      //Display Results
      System.out.println("After the sixth month, the account value is $" +
         accountValueSix);
   }
 }
 