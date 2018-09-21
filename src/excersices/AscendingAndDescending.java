package excersices;

import java.util.Scanner;

public class AscendingAndDescending {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1;
		int num2;
		int num3;
		int low;
		int med;
		int high;
		
		Scanner input = new Scanner(System.in);
		System.out.println("Input a number please > ");
		num1 = input.nextInt();
		System.out.println("Input another number >");
		num2 = input.nextInt();
		System.out.println("Just one more please >");
		num3 = input.nextInt();
		
		if(num1 <= num2 && num1 <= num3) {
			//123
			//132
			low = num1;
			if(num2 <= num3) {
				med = num2;
				high = num3;
			}
			else {
				med = num3;
				high = num2;
			}
		}
		else if(num2 <= num1 && num2 <= num3) {
			//213
			//231
			low = num2;
			if(num1 <= num3) {
				med = num1;
				high = num3;
			}
			else {
				med = num3;
				high = num1;
			}
		}
		else {
			//312
			//321
			low = num3;
			if(num1 <= num2) {
				med = num1;
				high = num2;
			}
			else {
				med = num2;
				high = num1;
			}
		}
		
		System.out.println(low + " " + med + " " + high);
		System.out.println(high + " " + med + " " + low);


	}

}
