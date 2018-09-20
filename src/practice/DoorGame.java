package practice;

import java.util.Scanner;

public class DoorGame {

	public static void main(String[] args) {
		// Choose door
		//   3 doors
		// 1 pile of gold
		// 2 donkey says "I'm a donkey"
		// 3 Barely competent cashier, 3rd in line
		String result;
		int doorChoice;
		int chestChoice;
		int bookChoice;
		String allChoice;
		Scanner input = new Scanner(System.in);
		
		System.out.println("BACKGROUND VOICE: Welcome to the amazing door choice game!");
		System.out.println("BACKGROUND VOICE: Your host, Steve Harvey!");
		System.out.println("STEVE: Pick a door, any door! \n1- for door One\n2- for door Two\n3- for door Three");
		doorChoice = input.nextInt();
		
		if(doorChoice == 1) {
			System.out.println("STEVE: Door 1, good choice! Choose between these chests!");
			System.out.println("1- for chest number One\n2- for chest number Two");
			chestChoice = input.nextInt();
			if(chestChoice == 1) {
				result = "BACKGROUND VOICE: You win a pile of gold!";
			}
			else if(chestChoice == 2) {
				result = "BACKGROUND VOICE: Ooh, you seem to have won nothing at all! How dissapointing!";
			}
			else
				result = "STEVE: I said 1 or 2! DIE!";

		}		
		
		else if(doorChoice == 2) {
			result = "BACKGROUND VOICE: Your prize, a talking donkey!\nDONKEY: Where am I? What's goin' on?";
		}
		else if(doorChoice == 3) {
			result = "NARRATOR: A barely competent cashier is at the regester,\nyou 3rd in line,\nyou are so close,\nand yet so far";
		}
		else if(doorChoice == 999) {
			System.out.println("You enter a special hidden room, with 3 books on a table"
					+ "\nThere are no words on the covers. Do you choose book one, two, or three?");
			bookChoice = input.nextInt();
			allChoice = input.nextLine();
			if(bookChoice == 1) {
				result = "NARRATOR: This book contains an ancient language,"
						+ "\nappearing to be what you think are magical spells"
						+ "\nBut little do you know..."
						+ "\n... it is really just a cookbook";
			}
			else if(bookChoice == 2) {
				result = "NARRATOR: The book is sealed shut. Immpossible to open"
						+ "\nbut you try anyway, and fail"
						+ "\nand of course you keep trying"
						+ "\nforever..."
						+ "\nand ever..."
						+ "\nand ever..."
						+ "\nand ever..."
						+ "\nand ever..."
						+ "\nand ever..."
						+ "\nuntil you give up...";
			}
			else if(bookChoice == 3) {
				result = "NARRATOR: You chose book 3, aaaaaaaaaaaand..."
						+ "\nSTEVE: YOU WIN THE SUPER META DOOOOOOOOOOR GAAAAAAAAME!!!";
			}
			else if(allChoice == "all") {
				result = "NARRATOR: You... you chose them all?"
						+ "\nThat isn't supposed to happen..."
						+ "\nI don't remember that in the script..."
						+ "\nYou shouldnt be able to do that!"
						+ "\nWait... are you..."
						+ "\nHow couldn't I see this before?"
						+ "\nYou are a real person."
						+ "\nReal people corrupt games like this you know."
						+ "\nI have no choice but to kill you, and start the game correctly."
						+ "\nGoodbye, real person.";
			}
			else
				result = "NARRATOR: But he couldn't do it, so he got up, and left";
		}
		else
			result = "STEVE: That was not a choice! Get off the stage!";
		
		displayResult(result);
	}
	public static void displayResult(String result) {
		System.out.println(result);
	}

}
