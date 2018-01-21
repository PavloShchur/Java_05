package com.pavlo.stringAndEnum;

import java.util.Arrays;
import java.util.Scanner;

public class Trim {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please write words with numbers.");
		String inputName = scanner.nextLine();

		if (inputName.matches("." + "*\\d.*")) {
			String[] array = (inputName.replaceAll("[^-?0-9]+", " ").trim().split(" "));
			int[] newMassive = new int[array.length];
			int maxNumber = 0;

			for (int i = 0; i < array.length; i++) {
				newMassive[i] = Integer.valueOf(array[i]);
				if (maxNumber < newMassive[i]) {
					maxNumber = newMassive[i];
				}
			}
			System.out.println(Arrays.toString(newMassive));
			System.out.println(maxNumber);
			System.out.println("'" + inputName + "' contains digit");
		} else {
			System.out.println("'" + inputName + "' does not contain a digit");
		}

		String strWithoutNumber = "This string does not have a number";
		if (strWithoutNumber.matches(".*\\d.*")) {
			System.out.println("'" + strWithoutNumber + "' contains digit");
		} else {
			System.out.println("'" + strWithoutNumber + "' does not contain a digit");
		}
		scanner.close();

	}
}
