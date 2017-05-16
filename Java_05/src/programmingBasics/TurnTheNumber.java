package programmingBasics;

import java.util.Scanner;

public class TurnTheNumber {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.println("Enter some number");
			int inputNumber = scanner.nextInt();

			// first way
			String convertNumber = String.valueOf(inputNumber);
			for (int i = convertNumber.length() - 1; i >= 0; i--) {
				System.out.print(convertNumber.charAt(i));
			}
			System.out.println();
			System.out.println("-----------------------");

			// second way
			StringBuilder stringBuilder = new StringBuilder(convertNumber);
			System.out.println(stringBuilder.reverse().toString());

		}
	}
}
