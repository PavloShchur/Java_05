package programmingBasics;

import java.util.Scanner;

public class Ternar {
	
	static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Enter your number");
		int number = s.nextInt();
		double price = (number > 1000 && number < 55000) ? 2.0 : 5.0;
		System.out.println("Your price is " + price);
		System.out.println("Your price is " + ((number > 1000 && number < 55000) ? 2.0 : 5.0));

		
	}

}
