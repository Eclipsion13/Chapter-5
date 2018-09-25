package debugging;

import java.util.Scanner;
public class FixDebugFive3
{
   public static void main (String args[])
   {
      int item;
      String output;
      final int LOW = 9;
      final int HIGH = 500;
      final int CUTOFF = 111;
      Scanner input = new Scanner(System.in);
      
      System.out.println("Please enter item number");
      item = input.nextInt();
      if(item < LOW) {
    	  output = "Item number too low";
      }
      else if(item > HIGH) {
    		  output = "Item number too high";
      }
      else if(item > CUTOFF)
             output = "Valid - Item in Automotive Department";
      else
             output = "Valid - Item in Housewares Department";
       System.out.println(output);
   }
}