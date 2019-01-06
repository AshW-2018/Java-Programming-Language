/* Display characters
   
   Write a method that prints characters using the following
   header:
      
      public static void printChars(char ch1, char ch2, int
      numberPerLine)
   
   This method prints the characters between ch1 and ch2 with 
   the specified numbers per line. Write a test program that 
   prints ten characters per line from 1 to Z.
   Characters are separated by exactly one space.
*/

import java.util.*;

public class DisplayCharacters {
   public static void main(String[] args) {
      
      //Print ten characters per line from 1 to z
		char ch1 = '1';	
		char ch2 = 'Z';	
      
      //Display results
		System.out.println("Characters per 1 to Z");
		printChars(ch1, ch2, 10);
   }
   
   //Method for printing characters between ch1 and ch2
   public static void printChars(char ch1, char ch2, int numberPerLine) {
      
      int count = 1;
      
      //Print characters
      for (char c = ch1; c <= ch2; c++, count++) {
			if (count % numberPerLine == 0)
				System.out.println(c);
			else
				System.out.print(c + " ");
    }
  }
}