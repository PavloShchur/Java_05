package greetings;

import printing.BWCartridge;
import printing.CartridgeInterface;
import printing.ColorCartridge;
import printing.Printer;

public class HelloWorld {

	public static void main(String[] args) throws IllegalAccessException {

		// Printer<ColorCartridge> printer = new Printer<ColorCartridge>(true,
		// "MY PRINTER", new ColorCartridge());
		Printer<BWCartridge> printer = new Printer<BWCartridge>(true, "MY PRINTER", new BWCartridge());
		Printer<ColorCartridge> printer2 = new Printer<ColorCartridge>(true, "MY PRINTER", new ColorCartridge());

		// printer.printUsingCartridge(new ColorCartridge(), "Hi!");

		printer.loadPaper(5);
		printer.print(5);
		printer.outputPages();

		printOne(printer);

	}

	public static void printOne(Printer<? extends CartridgeInterface> printer) {
		String fillPercentage = printer.getCartridge().getFillPercentage();
		System.out.println(fillPercentage);
	}

}
