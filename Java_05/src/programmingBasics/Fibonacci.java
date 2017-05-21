package programmingBasics;

import java.util.Scanner;

public class Fibonacci {
	public static long fibonacci(int n) {
		if (n <= 1)
			return n;
		else
			return fibonacci(n - 1) + fibonacci(n - 2);
	}

	public static void main(String[] args) {
		System.out.println("Enter some number");
		try (Scanner scanner = new Scanner(System.in)) {
			int n = scanner.nextInt();
			for (int i = 1; i <= n; i++)
				System.out.println(i + ": " + fibonacci(i));
		}
	}

}
