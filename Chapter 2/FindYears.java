/* Find the number of years
   
   Write a program that prompts the user to enter the
   minutes (e.g., 1 billion), and displays the number
   of years and days for the minutes.
   
   For simplicity, assume a year has 365 days
 */
 
import java.util.Scanner;

public class FindYears {
   public static void main(String[] args) {
      
      //Create Scanner Object
      Scanner input = new Scanner(System.in);
      
      //Prompt user to enter minutes
      System.out.print("Enter the number of minutes: ");
      int min = input.nextInt();
      
      //Calculate the number of years
      double hours = min / 60;
      double days = hours / 24;

      int years = (int) (days / 365);
      int remainingDays = (int) (days % 365);

      
      //Display Results
      System.out.println(min + " minutes is approximately " + years +
         " years and " + remainingDays + " days");
     
   }
 }