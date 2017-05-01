package programmingBasics;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
			boolean work = true;
		try (Scanner scanner = new Scanner(System.in)) {
			double firstNumber, secondNumber, result = 0;
			
			while (work) {
				System.out.println("Enter first number...");
				firstNumber = scanner.nextDouble();
				System.out.println("Enter sction.");
				String action = scanner.next();
				System.out.println("Enter second number...");
				secondNumber = scanner.nextDouble();
				if (action.equals("/") && secondNumber == 0) {
					System.out.println("Sorry, but you cannot divide into zero.");
					System.exit(0);
				}
				if (action.equals("+")) {
					result = firstNumber + secondNumber;
				} else if (action.equals("-")) {
					result = firstNumber - secondNumber;
				} else if (action.equals("*")) {
					result = firstNumber * secondNumber;
				} else if (action.equals("/")) {
					result = firstNumber / secondNumber;
				} else {
					System.out.println("Wrong input!");
				}
				System.out.println(result);
			}
			work = false;
		}
	}

}
