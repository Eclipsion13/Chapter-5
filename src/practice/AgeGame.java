package practice;

import java.util.Scanner;

public class AgeGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int usersAge;
		Scanner input = new Scanner(System.in);
		String result;
		
		System.out.println("Please enter your age to be insulted");
		usersAge = input.nextInt();
		//0-12
		if(usersAge <=12)
			result = "You are such a baby";
		//13-18
		else if(usersAge >=13 && usersAge <= 18)
			result = "You are such a bully";
		//19-25
		else if(usersAge >=19 && usersAge <= 25)
			result = "How fast do you think you'll go bankrupt?";
		//26-30
		else if(usersAge >=26 && usersAge <= 30)
			result = "911? Yes I have found an escapee";		
		//31-40
		else if(usersAge >=31 && usersAge <= 40)
			result = "The circus called";		
		//41-50
		else if(usersAge >=41 && usersAge <= 50)
			result = "Do you need help across your driveway?";		
		//51-60
		else if(usersAge >=51 && usersAge <= 60)
			result = "Go back to the retirement home already";		
		//61 and up
		else
			result = "Are you even real?";
		disMsg(result);
	}
	public static void disMsg(String result) {
		System.out.println(result);
	}

}
