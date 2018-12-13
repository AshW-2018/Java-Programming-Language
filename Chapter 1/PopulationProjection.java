/* Project the Population

   The U.S. Census Bureau projects population based on the
         following assumptions:
          - One birth every 7 seconds
          - One death every 13 seconds
          - One new immigrant every 45 seconds
         
   Write a program to display the population for each of the next five years. Assume the
   current population is 312,032,486 and one year has 365 days. 
*/


import java.util.*;

public class PopulationProjection {
   public static void main(String[] args) {
      
       //Calculate Yearly Births/Deaths/Immigrants
       int births = (((60 * 60 * 24 * 365) / 7));
       int deaths = (((60 * 60 * 24 * 365) / 13));
       int immigrants = (((60 * 60 * 24 * 365) / 45));
       
       //Calculate Yearly Population 
       int yearlyPop = ((births + immigrants) - deaths);
       
       //Display Results for Each Year
       int currentPop = 312032486;
       
       System.out.println("Population in One Year = " + (currentPop + yearlyPop));
       System.out.println("Population in Two Years = " + (currentPop + (yearlyPop * 2)));
       System.out.println("Population in Three Years = " + (currentPop + (yearlyPop * 3)));
       System.out.println("Population in Four Years = " + (currentPop + (yearlyPop * 4)));
       System.out.println("Population in Five Years = " + (currentPop + (yearlyPop * 5)));                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           
    }
 }