/* Generate vehicle plate numbers

   Assume a vehicle plate number consists of three
   uppercase letters followed by four digits. 
   
   Write a program to generate a plate number 

*/

import java.util.Scanner;
import java.util.Random;

public class VehiclePlate {
   public static void main(String[] args) {
   
      //Create Scanner Object
      Scanner input = new Scanner(System.in);
      
      //Create Random Object
      Random rand = new Random();
      
      //Generate four random digits 
      int num1 = (int)(Math.random() * 10);
      int num2 = (int)(Math.random() * 10);
      int num3 = (int)(Math.random() * 10);
      int num4 = (int)(Math.random() * 10);
      
      //Generate 3 random letters
      char ch1 = (char)(rand.nextInt(26) + 'a');
      char ch2 = (char)(rand.nextInt(26) + 'a');
      char ch3 = (char)(rand.nextInt(26) + 'a');
      
      //Convert letters to uppercase
      ch1 = Character.toUpperCase(ch1);
      ch2 = Character.toUpperCase(ch2);
      ch3 = Character.toUpperCase(ch3);
      
      //Display results
      System.out.println("Vehicle plate number: " + ch1 + ch2 + ch3 +
                           num1 + num2 + num3 + num4);
  }
}