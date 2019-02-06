//10.23
/* Implement theStringclass
   The String class is provided in the Java library. 
   Provide your own implementation for the following methods 
   (name the new class MyString2):
   
   public MyString2(String s); 
   public int compare(String s); 
   public MyString2 substring(int begin); 
   public MyString2 toUpperCase(); 
   public char[] toChars(); 
   public static MyString2 valueOf(boolean b); 
 */

import java.util.Scanner;
import java.lang.String;

public class MyString2 {
   
   //Data Fields
  private char[] lett;
   
   //Methods
   public MyString2(char[] lett) {
      this.lett = new char[lett.length];
      System.arraycopy(lett, 0, this.lett, 0, lett.length);      
   }
   
   public int compare(String s) {
      
      int length = s.length();
      char comp [] = s.toCharArray();
      int i = 0;
      int j = 0;

      while (i < lett.length && j < comp.length){

           if(lett[i] != comp[j])
               return lett[i] - comp[j];
                ++i;
                ++j;
       }

       if(i < lett.length) {
           return 1;
       } else if(j < comp.length) {
           return -1;
       }else {
         return 0;
       }
   }
   
   public MyString2 substring(int begin) {
      
      char[] temp = new char[this.lett.length-begin];
      int k = 0;

      for(int i = begin; i < this.lett.length; i++){
         temp[i - begin] = lett[i];
      }
      return new MyString2(temp);
   }
   
   public MyString2 toUpperCase() {
      
      char[] temp = new char[this.lett.length];
      int k = 0;

      for(int i = 0; i < this.lett.length; i++){
         temp[k++] = Character.toUpperCase(this.lett[i]);
      }
      return new MyString2(temp);
   }
   
   public char[] toChars() {
       return lett;   
   }
   
   public static MyString2 valueOf(boolean b) {
      if (b)
         return new MyString2(new char[] {'t', 'r', 'u', 'e'});
      else
         return new MyString2(new char[] {'f', 'a', 'l', 's' , 'e'});
   }

}

class TestMyStringClass2 {
   public static void main(String[] args) {
      
      //Create Objects
      MyString2 str = new MyString2(new char[] {'f', 'o', 'o', 'd'});
      MyString2 str2 = new MyString2(new char[] {'p', 'i', 'z', 'z', 'a'});

      //Display Results
      System.out.println("Strings equal: " + str2.equals(str));
      
   }
}