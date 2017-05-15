package programmingBasics;

import java.util.Scanner;

public class Lottery {

	public static void main(String[] args) {
		String[] numbersFromUser = UserNumbers();
		int amountOfWinNumbers = 0;
		int numberOfDrawing = 0;

		while (amountOfWinNumbers != 6) {

			numberOfDrawing++;

			int[] drawing = drawing();
			amountOfWinNumbers = amountOfWinNumbers(numbersFromUser, drawing);

			if (amountOfWinNumbers > 4) {

				String allNumbersOfDrawing = convertMessiveIntoText(drawing);
				System.out.println("In " + numberOfDrawing + "" + allNumbersOfDrawing + " amount of win numbers are "
						+ amountOfWinNumbers);
			}
		}

	}

	public static String[] UserNumbers() {
		System.out.println("Using commas enter 6 numbers (from 1 till 54): ");
		try (Scanner scanner = new Scanner(System.in)) {
			String numbers = scanner.next();
			String[] inputNumbers = numbers.split(",");
			return inputNumbers;
		}
	}

	public static int[] drawing() {
		int[] drawing = new int[6];
		byte numberOfDrawing = 0;
		while (numberOfDrawing != 6) {
			boolean isNumber = false;
			int thisNumber = (int) (Math.random() * 55);
			for (int existingNumber : drawing) {
				if (existingNumber == thisNumber) {
					isNumber = true;
					break;
				}
			}
			if (isNumber != true) {
				drawing[numberOfDrawing++] = thisNumber;
			}
		}
		return drawing;
	}

	public static int amountOfWinNumbers(String[] inputNumbers, int[] drawing) {
		int numberOfWinNumbers = 0;
		for (int i = 0; i < inputNumbers.length; i++) {
			int number = Byte.parseByte(inputNumbers[i]);
			for (int winNumber : drawing) {
				if (number == winNumber) {
					numberOfWinNumbers++;
				}
			}
		}
		return numberOfWinNumbers;
	}

	public static String convertMessiveIntoText(int[] numbers) {
		String allNumbersOfDrawing = "";
		for (int Number : numbers) {
			allNumbersOfDrawing += Number + " ";
		}
		return allNumbersOfDrawing;

	}

}
