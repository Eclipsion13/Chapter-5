package excersices;

import java.util.Scanner;

public class CellPhoneService {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int talkMin;
		int textMsg;
		int gigsUsed;
		String plan;
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please insert the max amount of minutes > ");
		talkMin = input.nextInt();
		System.out.println("Please insert the max amount of text messages > ");
		textMsg = input.nextInt();
		System.out.println("Please insert the max amount of needed data > ");
		gigsUsed = input.nextInt();
		
		if (talkMin < 500 && textMsg == 0 && gigsUsed == 0) {
			plan = "You should choose, Plan A, at $49 per month";
		}
		else if (talkMin < 500 && textMsg > 0 && gigsUsed == 0) {
			plan = "You should choose, Plan B, at $55 per month";
		}
		else if (talkMin >= 500 && textMsg <= 100 && gigsUsed == 0) {
			plan = "You should choose, Plan C, at $61 per month";
		}
		else if (talkMin >= 500 && textMsg >= 100 && gigsUsed == 0) {
			plan = "You should choose, Plan D, at $70 per month";
		}
		else if (gigsUsed <= 2) {
			plan = "You should choose, Plan E, at $79 per month";
		}
		else {
			plan = "You should choose, Plan F, at $87 per month";
		}
		dispPlan(plan);

	}
	public static void dispPlan(String plan) {
		System.out.println(plan);
	}

}
