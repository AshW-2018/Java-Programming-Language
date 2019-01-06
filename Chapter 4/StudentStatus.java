/* Student major and status 
   
   Write a program that prompts the user to enter two
   characters and displays the major and status represented in the
   characters. 
   
   The first character indicates the major and the second is number 
   character 1, 2, 3, 4, which indicates whether a student is a freshman,
   sophomore, junior, or senior. Suppose the following chracters are 
   used to denote the majors:
      
      M: Mathematics
      C: Computer Science
      I: Information Technology

*/

import java.util.Scanner;

public class StudentStatus {
   public static void main(String[] args) {
   
      //Create Scanner Object
      Scanner input = new Scanner(System.in);
      
      //Prompt user to enter two characters
      System.out.print("Enter two characters: ");
      String majorStatus = input.next();
      
      //Determine major and status
      if(majorStatus.contains("M")) {
            if(majorStatus.contains("1"))
               System.out.println("Mathematics Freshman");
            else if (majorStatus.contains("2"))
               System.out.println("Mathematics Sophomore");
            else if (majorStatus.contains("3"))
               System.out.println("Mathematics Junior");
            else if (majorStatus.contains("4"))
               System.out.println("Mathematics Senior");
            else
               System.out.println("Invalid input");     
     
      } else if (majorStatus.contains("C")) {
            if(majorStatus.contains("1"))
               System.out.println("Computer Science Freshman");
            else if (majorStatus.contains("2"))
               System.out.println("Computer Science Sophomore");
            else if (majorStatus.contains("3"))
               System.out.println("Computer Science Junior");
            else if (majorStatus.contains("4"))
               System.out.println("Computer Science Senior");
            else
               System.out.println("Invalid input");     
      
      } else if(majorStatus.contains("I")) {
            if(majorStatus.contains("1"))
               System.out.println("Information Technology Freshman");
            else if (majorStatus.contains("2"))
               System.out.println("Information Technology  Sophomore");
            else if (majorStatus.contains("3"))
               System.out.println("Information Technology  Junior");
            else if (majorStatus.contains("4"))
               System.out.println("Information Technology Senior");
            else
               System.out.println("Invalid input");
      } else {
         System.out.println("Invalid input");
    }
  }
}