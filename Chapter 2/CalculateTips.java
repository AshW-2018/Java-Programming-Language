/* Financial application: calculate tips
  
   Write a program that reads the subtotal and the gratuity rate,
   then computes the gratuity and total. 
   
   For example, if the user enters 10 for subtotal and 15% for
   gratuity rate, the program displays $1.5 as gratuity and $11.5
   as total
 */
 
import java.util.Scanner;

public class CalculateTips {
   public static void main(String[] args) {
      
      //Create Scanner Object
      Scanner input = new Scanner(System.in);
      
      //Prompt user to enter subtotal and gratuity rate
      System.out.print("Enter the subtotal and a gratuity rate: ");
      double subtotal = input.nextDouble();
      double gratuityRate = input.nextDouble();
      
      //Calculate gratuity
      double gratuity = (gratuityRate / 100) * (subtotal);
      
      //Calculate total
      double total = (subtotal + gratuity);
            
      //Display Results
      System.out.println("The gratuity is $" + gratuity + 
         " and the total is $" + total);
   }
 }