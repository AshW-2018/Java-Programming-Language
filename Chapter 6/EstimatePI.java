/* Estimate PI 

   PI can be computed using the following series:
      
      m(i) = 4(1 - (1/3) + (1/5) - (1/7) + (1/9) - (1/11) + ... +
               (Math.pow(-1, (i + 1)) / (2i - 1)))
   
   Write a method that returns m(i) for a given i and write a test
   program that displays the following table:
            
            i    m(i)
            ----------
            1   4.0000
            101 3.1515
            201 3.1466
            301 3.1449
            401 3.1441
            501 3.1436
            601 3.1433
            701 3.1430
            801 3.1428
            901 3.1427
*/

import java.util.*;

public class EstimatePI {
   public static void main(String[] args) {
      
     //Declare and initialize variables
     double begin = 1;			
	  double end = 901;		
	  
     //Display header
     System.out.println("\ni           m(i) ");
	  System.out.println("-------------------");
	  
     //Display table
     for (double i = begin; i <= end; i += 100) {
			System.out.printf("%-12.0f", i);
			System.out.printf("%-6.4f\n", estimatePI(i));
		}
   }
   
   //Method to estimate PI
   public static double estimatePI(double n) {
		double PI = 0;		
      
		for (double i = 1; i <= n; i ++) {
			PI += Math.pow(-1, (i + 1)) / (2 * i - 1);
		}
      
		PI *= 4;
		
      return PI;
	}
 }