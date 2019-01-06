/* Vowel or consonant?
  
   Write a program that prompts the user to enter a letter and
   check whether the letter is a vowel or consonant. 

*/

import java.util.Scanner;

public class CheckLetter {
   public static void main(String[] args) {
   
      //Create Scanner Object
      Scanner input = new Scanner(System.in);
      
      //Prompt user to enter a letter
      System.out.print("Enter a letter: ");
      String letter = input.next();
      
      //Check string length 
      if(letter.length() != 1) {
         System.out.println("Too many characters entered");
         System.exit(1);
      }
      
      //Convert string to lower case
      char ch = letter.toLowerCase().charAt(0);
      
      //Check letter
      if(Character.isLetter(ch) == true) {
         if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') 
            System.out.println(ch + " is a vowel");
         else
            System.out.println(ch + " is a consonant");
      } else {
         System.out.println(ch + " is an invalid input");
      }   
  }
}