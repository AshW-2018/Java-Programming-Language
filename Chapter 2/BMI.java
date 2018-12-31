/* Health application: computing BMI
  
   Body Mass Index (BMI) is a measure of health on weight. It can 
   be calculated by taking your weight in kilograms and dividing 
   by the square of your height in meters. 
   
   Write a program that prompts the user to enter a weight in pounds 
   and height in inches and displays the BMI. Note that one pound is 
   0.45359237 kilograms and one inch is 0.0254 meters. 
 */
 
import java.util.Scanner;

public class BMI {
   public static void main(String[] args) {
      
      //Create Scanner Object
      Scanner input = new Scanner(System.in);
      
      //Prompt user to enter weight
      System.out.print("Enter weight in pounds: ");
      double pounds = input.nextDouble();
      
      //Prompt user to enter height
      System.out.print("Enter height in inches: ");
      double inches = input.nextDouble();
      
      //Calculate BMI
      double weight = pounds * 0.453559237;
      double height = inches * 0.0254;
      double BMI = (weight) / (height * height);
      
      //Display Results
      System.out.println("BMI is " + BMI);
   }
 }