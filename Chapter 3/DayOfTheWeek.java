/* Science: day of the week
   
   Zeller’s congruence is an algorithm developed by Christian Zeller 
   to calculate the day of the week. The formula is
      
      h = (q + (26(m + 1) / 10) + k + (k / 4) + (j / 4) + 5 * j) % 7 

   where:
   - h is the day of the week (0: Saturday, 1: Sunday, 2: Monday, 3: Tuesday,
     4: Wednesday, 5: Thursday, 6: Friday).
   - q is the day of the month.
   - m is the month (3: March, 4: April, …, 12: December). January and February
     are counted as months 13 and 14 of the previous year.
   - j is the century (i.e., year/100 ).
   - k is the year of the century (i.e., year % 100).
   
   Note that the division in the formula performs an integer division. 
   Write a program that prompts the user to enter a year, month, and day of
   the month, and displays the name of the day of the week. 
*/

import java.util.Scanner;

public class DayOfTheWeek {
   public static void main(String[] args) {
   
      //Create Scanner Object
      Scanner input = new Scanner(System.in);
      
      //Prompt user to enter year
      System.out.print("Enter year: (e.g., 2012): ");
      int year = input.nextInt();
      
      //Prompt user to enter month
      System.out.print("Enter month: 1-12: ");
      int month = input.nextInt();
      
      //Prompt user to enter day of the month
      System.out.print("Enter the day of the month: 1-31: ");
      int day = input.nextInt();
      
      /*Since January and February are counted as 13 and 14 
        in the formula they need to be converted from 1 and 2
        to 13 and 14
       */
      if(month == 1)
         month = 13;
      else if (month == 2)
         month = 14;
      else
         month = month;
         
      //Calculate the day of the week using Zeller's Congruence
      int q = day;
      int m = month;
      int j = year / 100;
      int k = year % 100;
      int h = (q + ((26 * (m + 1)) / 10) + k + (k / 4) + (j / 4) + (5 * j)) % 7; 
      
      //Switch statement
      String dayOfWeek = "";
      
      switch(h) {
         case 0:
            dayOfWeek = "Saturday";
            break;
         case 1:
            dayOfWeek = "Sunday";
            break;
         case 2:
            dayOfWeek = "Monday";
            break;
         case 3:
            dayOfWeek = "Tuesday";
            break;
         case 4:
            dayOfWeek = "Wednesday";
            break;
         case 5:
            dayOfWeek = "Thursday";
            break;
         case 6:
            dayOfWeek = "Friday";
            break;
         default:
            dayOfWeek = "Invalid day";
            break;
       }
       
       //Display results
       System.out.println("Day of the week is " + dayOfWeek);  
  }
}