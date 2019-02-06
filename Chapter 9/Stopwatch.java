//9.6
/* Stopwatch:
  
   Design a class named StopWatch. The class contains:
   - Private data fields startTime and endTime with getter methods. 
   - A no-arg constructor that initializes startTime with the current 
     time. 
   - A method named start() that resets the startTime to the current time. 
   - A method named stop() that sets the endTime to the current time. 
   - A method named getElapsedTime() that returns the elapsed time for the 
     stopwatch in milliseconds.  
     
   Draw the UML diagram for the class and then implement the class. 
   Write a test program that measures the execution time of sorting 
   100,000 numbers using selection sort. 
 */

import java.util.*;
import java.util.Date;

/*************** UML Diagram *****************
   Stopwatch
_____________________________________________
 - startTime: long
 - endTime: long
______________________________________________
 + Stopwatch()
 + start(): void
 + stop(): void
 + getElapsedTime(): long
**********************************************/

public class Stopwatch {
   
   //Data Fields
   private long startTime;
   private long endTime;
   
   //Constructor
   public Stopwatch() {
      this.startTime = System.currentTimeMillis();
   }
   
   //Getter Methods
   public long getStartTime() {
      return this.startTime;
   }
   
   public long getEndTime() {
      return this.endTime;
   }
   
   public long getElapsedTime() {
      return this.endTime - this.startTime;
   }
   
   //Methods
   public void start() {
      this.startTime = System.currentTimeMillis();
   }
   
   public void stop() {
      this.endTime = System.currentTimeMillis();
   } 
}

class TestStopwatch {
   public static void main(String[] args) {
      
      //Create Object
      Stopwatch watch = new Stopwatch();
      
      //Make array of 100000 elements
      int[] arr = new int[100000];
      for(int i = 0; i < arr.length; i++) {
         arr[i] = (int)(Math.random() * 100);
      }
      
      //Measure the time of selection sort
      watch.start();
      selectionSort(arr);
      watch.stop();
      
      //Display Results
      System.out.println("Start Time (in milliseconds): " + watch.getStartTime());
      System.out.println("End Time (in milliseconds): " + watch.getEndTime());
      System.out.println("Elapsed Time (in milliseconds): " + watch.getElapsedTime());
   }
   
   public static void selectionSort(int[] arr) {
      
      for(int i = 0; i < arr.length - 1; i++) {
         int lowestVal = i;
         
         for(int j = i + 1; j < arr.length; j++) {
            if(arr[j] < arr[lowestVal]) {
               lowestVal = j;
            }
         }
         
         int temp = arr[i];
         arr[i] = arr[lowestVal];
         arr[lowestVal] = temp;
       }
    }
}