/* Game: lottery 

   Revise Listing 3.8, Lottery.java, to generate a lottery of a three-digit
   number. The program prompts the user to enter a three-digit number and
   determines whether the user wins according to the following rules:
   
   1. If the user input matches the lottery number in the exact order, 
   the award is $10,000.
   
   2. If all digits in the user input match all digits in the lottery number,
   the award is $3,000.

   3. If one digit in the user input matches a digit in the lottery number,
   the award is $1,000.
*/

import java.util.Scanner;
import java.util.Random;

public class Lottery{
   public static void main(String[] args) {
   
      //Create Scanner Object
      Scanner input = new Scanner(System.in);
      
      //Generate random three-digit number
      int winningNum = (int)(Math.random() * 1000);
      
      //Prompt user to enter a three-digit number
      System.out.print("Enter a three-digit number: ");
      int userGuess = input.nextInt();
      
      //Extract numbers from winning numbers
      int lottoNum1 = (winningNum / 100) % 10;
      int lottoNum2 = (winningNum / 10) % 10;
      int lottoNum3 = winningNum % 10;
      
      //Extract numbers from user guess
      int userNum1 = (userGuess / 100) % 10;
      int userNum2 = (userGuess / 10) % 10;
      int userNum3 = userGuess % 10;
      
      //Display user guess and lottery numbers
      System.out.println("Winning Numbers: " + winningNum);
      System.out.println("Your Guess: " + userGuess);
      
      //Determine and display results
      if(winningNum == userGuess) {
         System.out.println("Exact Match! You win $10,000!");
      } else if (lottoNum2 == userNum1 && lottoNum1 == userNum2 && lottoNum3 == userNum3 ||
                 lottoNum2 == userNum1 && lottoNum3 == userNum1 && lottoNum1 == userNum3 ||
                 lottoNum3 == userNum1 && lottoNum1 == userNum2 && lottoNum2 == userNum3 ||
                 lottoNum3 == userNum1 && lottoNum2 == userNum2 && lottoNum1 == userNum3 ||
                 lottoNum1 == userNum1 && lottoNum3 == userNum2 && lottoNum2 == userNum3) {
         System.out.println("All digits match! You win $3000!");
      } else if (lottoNum1 == userNum1 || lottoNum2 == userNum1 ||
                 lottoNum3 == userNum1 || lottoNum1 == userNum2 ||
                 lottoNum2 == userNum2 || lottoNum3 == userNum2 ||
                 lottoNum1 == userNum3 || lottoNum2 == userNum3 ||
                 lottoNum3 == userNum3) {
         System.out.println("You matched one digit! You win $1000!");
      } else {
         System.out.println("Sorry, No match");
      }     
   }
}
