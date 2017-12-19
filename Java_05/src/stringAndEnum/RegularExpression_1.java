package stringAndEnum;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpression_1 {

	public static void main(String[] args) {

		String s1 = "apple, apple and orange please";

		String s2 = s1.replace("ple", "ricot");

		System.out.println(s1);
		System.out.println(s2);

		String s3 = s1.replace("ple\\b", "ricot");

		System.out.println(s1);
		System.out.println(s3);

		String[] parts = s1.split("\\b");
		System.out.println(Arrays.toString(parts));

		for (String thePart : parts) {
			if (thePart.matches("\\w+")) {
				System.out.print(thePart + " ");
			}
		}

		Pattern pattern = Pattern.compile("\\w+");
		Matcher matcher = pattern.matcher(s1);
		System.out.println();
		while (matcher.find()) {
			System.out.print(matcher.group() + " ");
		}

	}

}
