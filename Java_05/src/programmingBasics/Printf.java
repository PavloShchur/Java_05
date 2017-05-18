package programmingBasics;

public class Printf {

	public static void main(String[] args) {
		String s1 = "month", s2 = "year", s3 = "day";
		// System.out.printf("%s", s1);
		// System.out.printf("%S", s1);

		// System.out.printf("%20s", s1);
		// System.out.printf("%s,%s,%s", s1, s2, s3);

		int d1 = 123, d2 = 456, d3 = d1 * d2;
		// System.out.printf("%d", d1);
		// System.out.printf("%d*%d=%d", d1, d2, d3);
		// System.out.printf("%7d\n", d1);
		// System.out.printf("%7d\n", d2);
		// System.out.printf("%7d\n", d3);

		double f1 = 15698.5665F;
		// System.out.printf("%.2f", f1);
		// System.out.printf("%,.2f", f1);
		System.out.printf("%d, %f, %s", d1, f1, s1);

	}

}
