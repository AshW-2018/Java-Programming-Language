/* Palindrome integer
   
   Write the methods with the following headers
   
      // Return the reversal of an integer, i.e., reverse(456) 
      returns 654
         public static int reverse(int number)
      
      // Return true if number is a palindrome
         public static boolean isPalindrome(int number)
   
   Use the reverse method to implement isPalindrome. A number is 
   a palindrome if its reversal is the same as itself. Write a 
   test program that prompts the user to enter an integer and 
   reports whether the integer is a palindrome.
*/

import java.util.Scanner;

public class PalindromeInteger {
   public static void main(String[] args) {
      
      //Create Scanner Object
      Scanner input = new Scanner(System.in);
      
      //Prompt user to enter an integer
      System.out.print("Enter an integer: ");
      int number = input.nextInt();
      
      //Display results
      if(isPalindrome(number)) {
         System.out.println(number + " is a palindrome");
       } else {
         System.out.println(number + " is not a palindrome");
       }  
   }
   
   //Method to return the reversal of an integer
   public static int reverse(int number) {
       int reverse = 0;
       int digit = 0;
       
       do {
         digit = number % 10;
         reverse = reverse * 10 + digit;
         number = number / 10;
       } while (number != 0);
      
       return reverse;
   }
   
   //Method to return true if number is a palindrome
   public static boolean isPalindrome(int number) {
        
        return(number == reverse(number));       
   }
 }