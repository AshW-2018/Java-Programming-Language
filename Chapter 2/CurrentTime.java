/* Current time
   
   Listing 2.7, ShowCurrentTime.java, gives a program that displays
   the current time in GMT. Revise the program so that it prompts 
   the user to enter the time zone offset to GMT and displays the 
   time in the specified time zone
 */
 
import java.util.Scanner;

public class CurrentTime {
   public static void main(String[] args) {
   
      //Create Scanner Object
      Scanner input = new Scanner(System.in);
      
      //Create time object 
      long totalMilliseconds = System.currentTimeMillis();
      
      //Obtain total seconds
      long totalSec = totalMilliseconds / 1000;
      
      //Obtain current seconds 
      long currentSec = totalSec % 60;
      
      //Obtain total minutes
      long totalMin = totalSec / 60;
      
      //Obtain current minutes
      long currentMin = totalMin % 60;
      
      //Obtain total hours  
      long totalHours = totalMin / 60;
      
      //Obtain current hours
      long currentHours = totalHours % 24;
      
      //Prompt user to enter time zone
      System.out.print("Enter the time zone offset to GMT: ");
      int timeZone = input.nextInt();
      
      //Compute the current hour
      currentHours = currentHours + timeZone;
      
      //Compute the time
      if( currentHours >= 24) 
         currentHours = currentHours -24;
      else if ( currentHours == 0) 
         currentHours = 24 + timeZone;
         
      //Display Results
      System.out.println("The current time is " + currentHours + ":" +
         currentMin + ":" + currentSec);
      
   }
 }