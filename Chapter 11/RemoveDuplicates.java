/* Remove duplicates
  
   Write a method that removes the duplicate elements from an array list
   of integers using the following header:
   
   public static void removeDuplicate(ArrayList<Integer> list)
   
   Write a test program that prompts the user to enter 10 integers to a 
   list and displays the distinct integers separated by exactly one space.
 */
 
import java.util.Scanner;
import java.util.ArrayList;

public class RemoveDuplicates {
  public static void main(String[] args) {
      
     //Create Scanner Object 
     Scanner input = new Scanner(System.in);
     
     //Create ArrayList
     ArrayList<Integer> arrList = new ArrayList<>();
   
     //Prompt useer to enter 10 integers
     System.out.print("Enter 10 integers: ");
     for(int i = 0; i < 10; i++) {
         arrList.add(input.nextInt());
     }
     
     //Call Method 
     removeDuplicates(arrList);
     
     //Display Results
     System.out.print("Distinct Integers: ");
     for(int i = 0; i < arrList.size(); i++) {
         System.out.print(arrList.get(i) + " ");
     }
     System.out.println(" ");
     
  }
  
  //Method that removes duplicates
  public static void removeDuplicates(ArrayList<Integer> list) {
       
       for(int i = 0; i < list.size() - 1; i++) { 
         for( int j = (i + 1); j < list.size(); j++) {
            if(list.get(i) == list.get(j))
               list.remove(j);
         }
       }
    }
}