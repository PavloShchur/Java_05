package greetings;

import printing.CartridgeInterface;
import printing.ColorCartridge;
import printing.Printer;

public class HelloWorld {

	public static void main(String[] args) throws IllegalAccessException {

		Printer<ColorCartridge> printer = new Printer<ColorCartridge>(true, "MY PRINTER", ColorCartridge.GREEN);

		printer.loadPaper(5);
		printer.print(3);
		printer.outputPage(2);

	}

	public static void printOne(Printer<? extends CartridgeInterface> printer) {
		String fillPercentage = printer.getCartridge().getFillPercentage();
		System.out.println(fillPercentage);
	}

}
