/* Assign grades
   
   Write a program that reads student scores, gets the best score,
   and then assigns grades based on the following scheme:
      Grade is A if score is >= best - 10
      Grade is B if score is >= best - 20;
      Grade is C if score is >= best - 30;
      Grade is D if score is >= best - 40;
      Grade is F otherwise.
   The program prompts the user to enter the total number of 
   students, then prompts the user to enter all of the scores,
   and concludes by displaying the grades.
 */

import java.util.Scanner;

public class AssignGrades {
   public static void main(String[] args) {
       
      //Create Scanner Object
      Scanner input = new Scanner(System.in);
      
      //Prompt user to enter number of students
      System.out.print("Enter the number of students: ");
      int n = input.nextInt();
      
      //Prompt user to enter scores
      System.out.print("Enter " + n + " scores: ");
      
      //Create array 
      int[] scores = new int[n];
      int bestScore = 0;
      
      for(int i = 0; i < scores.length; i++) {
          scores[i] = input.nextInt();
          
          //Determine best score
          if(scores[i] > bestScore) {
            bestScore = scores[i];
          }
      }
      
      //Assign grades
      char grade;
      for(int i = 0; i < scores.length; i++) {
           if(scores[i] >= (bestScore - 10)) {
               grade = 'A';
           } else if(scores[i] >= (bestScore - 20)) {
               grade = 'B';
           } else if(scores[i] >= (bestScore - 30)) {
               grade = 'C';
           } else if(scores[i] >= (bestScore - 40)) { 
               grade = 'D';
           } else {
               grade = 'F';
           }
         
      
         //Display results
         System.out.println("Student " + i + " score is " + scores[i] + 
         " and grade is " + grade);
      }
   }
}