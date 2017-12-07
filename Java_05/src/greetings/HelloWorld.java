package greetings;

import printing.BWCartridge;
import printing.ColorCartridge;
import printing.Printer;

public class HelloWorld {

	public static void main(String[] args) {

		// Printer<ColorCartridge> printer = new Printer<ColorCartridge>(true,
		// "MY PRINTER", new ColorCartridge());
		Printer<BWCartridge> printer = new Printer<BWCartridge>(true, "MY PRINTER", new BWCartridge());

		printer.printUsingCartridge(new ColorCartridge(), "Hi!");
	}

}
