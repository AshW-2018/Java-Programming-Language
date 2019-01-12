/* Sorted? 
   
   Write the following method that returns true if the list is 
   already sorted in increasing order.
      
      public static boolean isSorted(int[] list)
   
   Write a test program that prompts the user to enter a list and 
   displays whether the list is sorted or not. Here is a sample run.
   Note that the first number in the input indicates the number of 
   the elements in the list. This number is not part of the list.
 */

import java.util.Scanner;

public class SortList {
   public static void main(String[] args) {
      
      //Create Scanner object
      Scanner input = new Scanner(System.in);
      
      //Prompt user to enter a list of numbers
      System.out.print("Enter list: ");
      int n = input.nextInt();
      
      //Create array
      int[] list = new int[n];
      
      for(int i = 0; i < list.length; i++) {
         list[i] = input.nextInt();
      }
      
      //Display results
      if(isSorted(list)) {
         System.out.print("The list is sorted");
      } else {
         System.out.print("The list is not sorted");
      }  
   }
   
   //Method to check if list is sorted
   public static boolean isSorted(int[] list) {
      
      int n = (list.length - 1);
      boolean isSorted = true;
      
      for(int i = 0; i < n; i++) {
         if(list[i] > list[i + 1]) {
            isSorted = false;
            break;
         }
      }
      return isSorted;
   }
}