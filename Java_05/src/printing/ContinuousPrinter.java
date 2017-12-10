package printing;

public class ContinuousPrinter implements Runnable {

	private Printer<CartridgeInterface> printer = new Printer<CartridgeInterface>(true, "IPrinter",
			ColorCartridge.BLUE);

	@Override
	public void run() {
		for (int i = 0; i < 100; i++)
			printer.printUsingCartridge(ColorCartridge.BLUE, "In Thread " + i);
	}

}
