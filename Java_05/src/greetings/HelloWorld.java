package greetings;

import printing.Printer;

public class HelloWorld {

	public static void main(String[] args) {

		Printer myPrimter = new Printer();
		myPrimter.isOn = true;
		myPrimter.modelNumber = "ABCD";

		Printer yourPrinter = new Printer();
		yourPrinter.isOn = true;
		yourPrinter.modelNumber = "FGH";

		System.out.println(myPrimter.modelNumber + "\n" + yourPrinter.modelNumber);

	}

}
