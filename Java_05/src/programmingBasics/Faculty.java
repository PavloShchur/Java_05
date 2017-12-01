package programmingBasics;

import java.util.Scanner;

public class Faculty {

	public static int faculty(int i) {
		if (i == 1)
			return 1;
		return i * faculty(i - 1);

	}

	public static void main(String[] args) {
		System.out.println("Enter some number");
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.println(scanner.nextInt() + ":" + faculty(scanner.nextInt()));
		}

	}

}
