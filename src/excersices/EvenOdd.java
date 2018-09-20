package excersices;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		//
		int x;
		int y;
		String evenOrOdd;
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Input a number");
		x = keyboard.nextInt();
		
		y = x % 2;
		
		if(y == 0) {
			evenOrOdd = "Even";
		}
		else
			evenOrOdd = "Odd";
		System.out.println(x + " is " + evenOrOdd);

	}

}
