package excersices;

import javax.swing.JOptionPane;

public class CondoSales {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int choice;
		int price;
		String choiceS;
		String result;
		
		choiceS = JOptionPane.showInputDialog(null, "Pick a condo\n1 for Park view\n2 for Golf view\n3 for Lake view");
		choice = Integer.parseInt(choiceS);
		
		if(choice == 1) {
			result = "Park view, nice choice!";
			price = 150;
		}
		else if(choice == 2) {
			result = "You must love to golf.";
			price = 170;
		}
		else if(choice == 3) {
			result = "Ah, the lake view, beautiful.";
			price = 210;
		}
		else {
			result = "Sorry";
			price = 0;
		}
		if(result != "Sorry") {
			dispChoice(result,price);
		}
		else
			JOptionPane.showMessageDialog(null, "Sorry, that choice is not available at this time, please try again later");

	}
	public static void dispChoice(String result, int price) {
		
		int choice;
		String choiceS;
		int garage = 5;
		int total;
		choiceS = JOptionPane.showInputDialog(null, result + " Would you like a Garage?\n1 for Yes\n2 for No");
		choice = Integer.parseInt(choiceS);
		
		if (choice == 1) {
			total = price + garage;
		}
		else
			total = price;
		
		displayTotal(total);
	}
	public static void displayTotal(int total) {
		JOptionPane.showMessageDialog(null, "The total cost for your condo will be $" + total + ",000");
	}

}
