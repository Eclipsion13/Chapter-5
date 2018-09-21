package gameZone;

import javax.swing.JOptionPane;

public class RandomGuess2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int compRandom;
		int userGuess;
		String guessString;
		String result;
		int quit;
		String stringQuit;
		compRandom = (int)(Math.random() * 10 + 1);
		
		do {
			guessString = JOptionPane.showInputDialog(null, "Pick a number, any number, as long as it is no more than 10");
			userGuess = Integer.parseInt(guessString);
		
			if(compRandom == userGuess) {
			result = "You win!";
			}
			else if(userGuess < compRandom) {
			result = "The number was higher";
			}
			else if(userGuess > compRandom) {
			result = "The number was lower";
			}
			else
				result = "You lose, the number was " + compRandom;
			dispMsg(result);			
		}while(userGuess != compRandom);

	}
	public static void dispMsg(String result) {
		JOptionPane.showMessageDialog(null, result);
	}

}
