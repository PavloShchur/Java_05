package programmingBasics;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Average {
	public static void main(String[] args) throws IOException {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String input = "0.0";
		float sum = 0, average = 0, number = 0;
		int amountOfNumbers = 0;
		
		while (input.equals(".") != true) {
			number = Float.parseFloat(input);
			sum += number;
			System.out.println("Enter number or [.] for stopping");
			input = reader.readLine();
			amountOfNumbers++;
		}
		average = sum / --amountOfNumbers;
		System.out.println("Average from " + amountOfNumbers + " is " + average);
	}
	

}
