/* Average Speed in Miles
   
  Assume a runner runs 14 kilometers in 45 minutes and 30
  seconds. Write a program that displays the average speed 
  in miles per hour.
  
*/

import java.util.*;

public class AverageSpeed {
   public static void main(String[] args) {
      
      //Display Given Values
      System.out.println("Distance = 14 km");
      System.out.println("Time = 45 min and 30 seconds");
      System.out.println("1 mile = 1.6 kilometers");
      
      //Calculate Average Speed
      System.out.println("Average Speed in mph = " +
            ((14.0 / 1.6) / (((45.0 * 60.0) + 30.0) / 3600) + " mph"));
      
   }
} 