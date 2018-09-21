package excersices;

import javax.swing.JOptionPane;

public class CondoSales {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int choice;
		String choiceS;
		String result;
		
		choiceS = JOptionPane.showInputDialog(null, "Pick a condo\n1 for Park view\n2 for Golf view\n3 for Lake view");
		choice = Integer.parseInt(choiceS);
		
		if(choice == 1) {
			result = "Park view, nice choice! That will cost $150,000.";
		}
		else if(choice == 2) {
			result = "Love to golf? The golf view will cost $170,000.";
		}
		else if(choice == 3) {
			result = "Ah, the lake view, beautiful. That will cost $210,000.";
		}
		else
			result = "Sorry, that choice is not available at this time, please try again later";
		dispChoice(result);

	}
	public static void dispChoice(String result) {
		JOptionPane.showMessageDialog(null, result);
	}

}
