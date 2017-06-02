package stringAndEnum;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Strings {

	public static void main(String[] args) {
		// System.out.println(s);
		// System.out.println();
		// System.out.println(s.codePointAt(1));
		// System.out.println(s.codePointBefore(2));
		// System.out.println(s.codePointCount(s.indexOf('B'), s.indexOf('U')));

		// String ss = "Hello";
		// System.out.println(s.compareTo(ss));
		//
		// String s1 = "abamalaga";
		// String s2 = "AJH";
		// System.out.println(s.compareToIgnoreCase(s1));
		// System.out.println(s.concat(s1));
		// System.out.println(s.contains(s2));
		// System.out.println(s.contentEquals(s1));
		// System.out.println(s.endsWith("BH"));
		// System.out.println(s.indexOf("J"));
		// System.out.println(s.indexOf(s2));
		// System.out.println(s.indexOf("H", 1));
		// String s = "AJHBNIJUJBHIJOIJJUBH";
		// System.out.println(s.intern());
		// System.out.println(s.lastIndexOf("J"));
		// System.out.println(s.replace("A", "Z"));
		// System.out.println(s.replace("A", s1));

		// char[] ch = s.toCharArray();
		// for (int i = 0; i < ch.length; i++) {
		// System.out.println(ch[i] + " ");
		// }
		// System.out.println();
		// System.out.println(s.toUpperCase());
		//
		// String s3 = "This is good-day-to-die";
		// for (String sss : s3.split(" ")) {
		// System.out.println(sss);
		// }
		// for (String sss : s3.split(" ", 2)) {
		// System.out.println(sss);
		// }
		// String cat = "cat";
		// String cat1 = "catt";
		// String cat2 = "cat";
		// String cat3 = new String("cat");

		StringBuilder stringBuilder = new StringBuilder("Hello World");
		System.out.println(stringBuilder.append("SSSSSS"));
		System.out.println(stringBuilder.insert(3, "QQQ"));
		System.out.println(stringBuilder.delete(3, 7));

		StringBuffer stringBuffer = new StringBuffer();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	}
}
