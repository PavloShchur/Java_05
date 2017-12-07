package programmingBasics;

public class MisplaceNumbers {

	public static void main(String[] args) {

		int a = 3;
		int b = 5;

		// this variant is appropriate for any data types
		// int temp = a;
		// a = b;
		// b = temp;

		System.out.println("a = " + a);
		System.out.println("b = " + b);

		// this variant is appropriate for numbers
		// a = a + b;
		// b = a - b;
		// a = a - b;

		System.out.println("a = " + a);
		System.out.println("b = " + b);

		//

		a = a ^ b;
		b = a ^ b;
		a = a ^ b;

		System.out.println("a = " + a);
		System.out.println("b = " + b);

	}

}
