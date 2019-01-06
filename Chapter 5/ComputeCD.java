/* Financial application: compute CD value

   Suppose you put $10,000 into a CD with an annual percentage yield 
   of 5.75%. 
   
      After one month, the CD is worth
      10000 + 10000 * 5.75 / 1200 = 10047.92
      
      After two months, the CD is worth
      10047.91 + 10047.91 * 5.75 / 1200 = 10096.06

      After three months, the CD is worth
      10096.06 + 10096.06 * 5.75 / 1200 = 10144.44
   
   and so on.
   
   Write a program that prompts the user to enter an amount 
   (e.g., 10000), the annual percentage yield (e.g., 5.75), and 
   the number of months (e.g., 18)

*/

import java.util.Scanner;

public class ComputeCD {
   public static void main(String[] args) {
      
      //Create Scanner Object
      Scanner input = new Scanner(System.in);
      
      //Prompt user to enter initial deposit
      System.out.print("Enter the initial deposit amount: ");
      double deposit = input.nextDouble();
      
      //Prompt user to enter annual percentage yield
      System.out.print("Enter annual percentage yield: ");
      double yield = input.nextDouble();
      
      //Prompt user to enter maturity period
      System.out.print("Enter maturity period (number of months): ");
      int months = input.nextInt();
      
      //Display header
      System.out.printf("%-7s %8s", "Month", "CD Value");
      System.out.println(" ");
      
      //Calculate CD value and display table
      for(int i = 1; i <= months; i++) {
         deposit += deposit * (yield / 1200);
         System.out.printf("%-7d %.2f\n", i, deposit);
      }
   }
 }