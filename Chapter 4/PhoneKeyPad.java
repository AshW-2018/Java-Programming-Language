/* Phone key pads 
   
   The international standard letter/number mapping found on the
   telephone is shown below:
       
       1       2abc    3def
       4ghi    5jkl    6mno
       7pqrs   8tuv    9wxyz
       *+       0_      ^#
   
   Write a program that prompts the user to enter a letter and 
   displays its corresponding number. 

*/

import java.util.Scanner;

public class PhoneKeyPad {
   public static void main(String[] args) {
   
      //Create Scanner Object
      Scanner input = new Scanner(System.in);
      
      //Prompt user to enter a letter
      System.out.print("Enter a letter: ");
      String letter = input.next();
      
      //Convert letter to lower case
      char ch = letter.toLowerCase().charAt(0);
      
      
      //Determine corresponding number
      int num = 0;
      
      switch(ch) {
         case 'a':
         case 'b':
         case 'c':
            num = 2;
            break;
         case 'd':
         case 'e':
         case 'f':
            num = 3;
            break;
         case 'g':
         case 'h':
         case 'i':
            num = 4;
            break;
         case 'j':
         case 'k':
         case 'l':
            num = 5;
            break;
         case 'm':
         case 'n':
         case 'o':
            num = 6;
            break;
         case 'p':
         case 'q':
         case 'r':
         case 's':
            num = 7;
            break;
         case 't':
         case 'u':
         case 'v':
            num = 8;
            break;
         case 'w':
         case 'x':
         case 'y':
         case 'z':
            num = 9;
            break;
         default:
            num = 0;
            break;
        }
            
        //Display results
        if(num > 0) {
            System.out.println("The corresponding number is " + num);
        } else {
            System.out.println(ch + " is an invalid input");
        }
     }
  }
         
     