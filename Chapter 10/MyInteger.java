//10.3
/* The MyInteger class
   
   Design a class named MyInteger. The class contains:
   - An int data field named value that stores the int value represented 
     by this object. 
   - A constructor that creates a MyInteger object for the specified int 
     value. 
   - A getter method that returns the int value. 
   - The methods isEven(), isOdd(), and isPrime() that return true if 
     the value in this object is even, odd, or prime, respectively. 
   - The static methods isEven(int), isOdd(int), and isPrime(int) that 
     return true if the specified value is even, odd, or prime, 
     respectively. 
   - The static methods isEven(MyInteger), isOdd(MyInteger), 
     and isPrime(MyInteger) that return true if the specified value is 
     even, odd, or prime, respectively. 
   - The methods equals(int) and equals(MyInteger) that return true if 
     the value in this object is equal to the specified value. 
   - A static method parseInt(char[]) that converts an array of numeric 
     characters to an int value. 
   - A static method parseInt(String) that converts a string into an int 
     value. 
     
     Draw the UML diagram for the class and then implement the class. 
     Write a client program that tests all methods in the class. 
 */

import java.util.Scanner;
import java.util.*;
import java.io.*;

/*************** UML Diagram *****************
   MyInteger
_____________________________________________
 - value: int
______________________________________________
 + MyInteger(value: int)
 + isEven(): boolean
 + isOdd(): boolean 
 + isPrime(): boolean
 + isEven(int): boolean
 + isOdd(int): boolean
 + isPrime(int): boolean
 + isEven(MyInteger): boolean
 + isOdd(MyInteger): boolean
 + isPrime(MyInteger): boolean
 + equals(int): boolean
 + equals(MyInteger): boolean
 + parseInt(char[]): int
 + parseInt(String): int
**********************************************/


public class MyInteger {
   
   //Data Fields
   private int value;
   
   //Constructor
   public MyInteger(int value) {
      this.value = value;
   }
   
   //Getter Method 
   public int getValue() {
      return value;
   }
   
   
   //Boolean Methods
   public boolean isEven() {
      return (value % 2 == 0);
   }
   
   public boolean isOdd() {
      return (value % 2 != 0);
   }
   
   public boolean isPrime() {
      
      for(int i = 2; i < value; i++) {
         if(value % i == 0) 
            return false;
      }
      return true;
   }
   
   //Static Methods
   public static boolean isEven(int n) {
      return (n % 2 == 0);   
   }
   
   public static boolean isOdd(int n) {
      return (n % 2 != 0);  
   }
   
   public static boolean isPrime(int n) {
      
      for(int i = 2; i < n; i++) {
         if(n % i == 0)
            return false;
      }
      return true;
   }
   
   public static boolean isEven(MyInteger myInt) {
      return (myInt.value % 2 == 0);   
   }
   
   public static boolean isOdd(MyInteger myInt) {
      return (myInt.value % 2 != 0);
   }
   
   public static boolean isPrime(MyInteger myInt) {
         
         for(int i = 2; i < myInt.value; i++) { 
            if(myInt.value % i == 0)
               return false;
         }
         return true;
   }
   
   //Equals Methods
   public boolean equals(int n) {
      return value == n;
   }
   
   public boolean equals(MyInteger myInt) {
      return value == myInt.getValue();   
   }
   
   //ParseInt Methods
   public static int parseInt(char[] charValue) {
      
      return parseInt(new String(charValue));
   }
   
   public static int parseInt(String str) {
      return Integer.parseInt(str));      
   }

}

class TestMyInteger {
   public static void main(String[] args) {
      
      //Create Scanner Object
      Scanner input = new Scanner(System.in);
      
      //Prompt user to enter an integer value 
      System.out.print("Enter two integer values: ");
      int value = input.nextInt();
      int value2 = input.nextInt(); 
      
      //Create MyInteger Object
      MyInteger intObject = new MyInteger(value);
      MyInteger intObject2 = new MyInteger(value2);
      
      //Display Results
      System.out.println("The integer value 1 is " + intObject.getValue());
      System.out.println(value + " is even: " + intObject.isEven());
      System.out.println(value + " is odd: " + intObject.isOdd());
      System.out.println(value + " is prime: " + intObject.isPrime());
      System.out.println("");
      
      System.out.println("The integer value 2 is " + intObject2.getValue());
      System.out.println(value + " is even: " + intObject2.isEven());
      System.out.println(value + " is odd: " + intObject2.isOdd());
      System.out.println(value + " is prime: " + intObject2.isPrime());      
      System.out.println(" ");
      
      System.out.println("17 is prime: " + MyInteger.isPrime(17));
      System.out.println("4 is even: " + MyInteger.isEven(4));
      System.out.println("5 is odd: " + MyInteger.isOdd(5));
      System.out.println(" ");
      
      System.out.println("Is " + value + " equal to " + value2 + ": " + 
         intObject.equals(intObject2));
      System.out.println("Is " + value + " equal to 10: " + intObject.equals(10));
      System.out.println(" ");
      
      String str = "54";
      System.out.println(str + " is equal to " + MyInteger.parseInt(str));
      System.out.println(" ");
      
      char[] arr = {'5', '9', '6', '8'};
      for(int i = 0; i < arr.length; i++) {
         System.out.print(arr[i] + ", ");
      }
      System.out.println("The char array is equivalent to " + MyInteger.parseInt(arr));
   
   } 

}