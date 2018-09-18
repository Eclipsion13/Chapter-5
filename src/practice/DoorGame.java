package practice;

import java.util.Scanner;

public class DoorGame {

	public static void main(String[] args) {
		// Choose door
		// 3 doors
		// 1 pile of gold
		// 2 donkey says "I'm a donkey"
		// 3 Barely competent cashier, 3rd in line
		String result;
		int doorChoice;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("BACKGROUND VOICE: Welcome to the amazing door choice game!");
		System.out.println("BACKGROUND VOICE: Your host, Steve Harvey!");
		System.out.println("STEVE: Pick a door, any door! \n1- for door One\n2- for door Two\n3- for door Three");
		doorChoice = input.nextInt();
		
		if(doorChoice == 1)
			result = "BACKGROUND VOICE: You win, a large pile o' gold! And the hatred of the leprechaun we stole it from!";
		
		else if(doorChoice == 2)
			result = "BACKGROUND VOICE: Your prize, a talking donkey!\nDONKEY: Where am I? What's goin' on?";
		
		else if(doorChoice == 3)
			result = "NARRATOR: A barely competent cashier is at the regester,\nyou 3rd in line,\nyou are so close, yet so far";
		
		else
			result = "STEVE: That was not a choice! Get off the stage!";
		
		displayResult(result);
	}
	public static void displayResult(String result) {
		System.out.println(result);
	}

}
