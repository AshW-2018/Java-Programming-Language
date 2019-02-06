//9.4
/* Use the Random class:
  
   Write a program that creates a Random object with seed 1000 and 
   displays the first 50 random integers between 0 and 100 using the 
   nextInt(100) method.
 */

import java.util.Random;

public class RandomClass {
   public static void main(String[] args) {
      
      //Create Object
      Random rand = new Random(1000);
      
      //Display Results
      System.out.print("The first 50 random integers between 0 and 100: "); 
      for(int i = 0; i < 50; i++) {
         System.out.println(rand.nextInt(100));
      }
   }
}