/* Business: check ISBN-10
   
   An ISBN-10 (International Standard Book Number)
   consists of 10 digits: d1d2d3d4d5d6d7d8d9d10. The last digit, d10, 
   is a checksum, which is calculated from the other nine digits using the
   following formula:
     
      (d1 * 1 + d2 * 2 + d3 * 3 + d4 * 4 + d5 * 5 +
         d6 * 6 + d7 * 7 + d8 * 8 + d9 * 9) % 11

   If the checksum is 10, the last digit is denoted as X according to the
   ISBN-10 convention. Write a program that prompts the user to enter the 
   first 9 digits and displays the 10-digit ISBN (including leading zeros). 
   Your program should read the input as an integer.
*/

import java.util.Scanner;

public class CheckISBN {
   public static void main(String[] args) {
   
      //Create Scanner Object
      Scanner input = new Scanner(System.in);
      
      //Prompt use to enter first 9 digits
      System.out.print("Enter the first 9 digits of an ISBN as integer: ");
      int firstNine = input.nextInt();
      
      //Determine each indiviual digit
      int d1, d2, d3, d4, d5, d6, d7, d8, d9;
      
      d1 = (firstNine / 100000000) % 10;
      d2 = (firstNine / 10000000) % 10;
      d3 = (firstNine / 1000000) % 10;
      d4 = (firstNine / 100000) % 10;
      d5 = (firstNine / 10000) % 10;
      d6 = (firstNine / 1000) % 10;
      d7 = (firstNine / 100) % 10;
      d8 = (firstNine / 10) % 10;
      d9 = firstNine % 10;
      
      //Calculate checksum
      int checksum = (d1 * 1 + d2 * 2 + d3 * 3 + d4 * 4 + d5 * 5 +
         d6 * 6 + d7 * 7 + d8 * 8 + d9 * 9) % 11;
      
      //Display results
      if(checksum == 10) { 
         System.out.println("The ISBN-10 number is " + firstNine + "X");
      } else {
         System.out.println("The ISBN-10 number is " + firstNine + checksum);
      }         
   }
}