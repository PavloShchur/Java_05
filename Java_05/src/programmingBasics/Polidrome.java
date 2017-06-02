package programmingBasics;

import java.util.Scanner;

public class Polidrome {
	// only for a single word!!!!!!!! compareto equals for sentance
	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			boolean work = true;
			while (work) {
				System.out.println("Enter some word or sentance");
				String input = scanner.next();
				char[] inputSentence = input.replaceAll(" ", "").toLowerCase().toCharArray();
				System.out.println(inputSentence);
				System.out.println(isPalindrom(inputSentence));
			}
		} catch (Exception e) {
			e.getMessage();
		}
	}

	public static boolean isPalindrom(char[] word) {
		int i1 = 0;
		int i2 = word.length - 1;
		while (i2 > i1) {
			if (word[i1] != word[i2]) {
				return false;
			}
			++i1;
			--i2;
		}
		return true;
	}

	private boolean checkPalindrome(String string) {
		String text = string.replaceAll(" ", "").toLowerCase();
		int len = text.length();
		for (int i = 0; i < len / 2; ++i) {
			if (text.charAt(i) != text.charAt(len - 1 - i)) {
				return false;
			}
		}
		return true;
	}

}
