package greetings;

import printing.Printer;

public class HelloWorld {

	public static void main(String[] args) {

		Printer myPrimter = new Printer(true, "My Printer");
		myPrimter.loadPaper(3);
		myPrimter.print(4);

	}

}
