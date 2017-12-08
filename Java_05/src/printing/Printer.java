package printing;

public class Printer<T> implements MachineInterface {
	private String modelNumber;
	private PaperTray paperTray = new PaperTray();
	private Machine machine;
	private T cartridge;

	public Printer(boolean isOn, String modelNumber, T cartridge) {
		machine = new Machine(isOn);
		this.modelNumber = modelNumber;
		this.cartridge = cartridge;
	}

	public void turnOn() {
		System.out.println("Warming up printer");
		machine.turnOn();
	}

	public <U extends CartridgeInterface> void printUsingCartridge(U cartridge, String message) {
		System.out.println(cartridge.toString());
		System.out.println(message);
		System.out.println(cartridge.toString());
	}

	public void print(int copies) {
		// System.out.println(cartridge.getFillPercentage());

		String onStatus = "";
		if (machine.isOn())
			onStatus = " is On!";
		else
			onStatus = " is Off!";

		String textToPrint = modelNumber + onStatus;

		while (copies > 0 && !paperTray.isEmpty()) {
			System.out.println(textToPrint);
			copies--;
			paperTray.usePage();
		}

		if (paperTray.isEmpty())
			System.out.println("Load more paper!");
	}

	public void printColors() {
		String[] colors = new String[] { "Red", "Blue", "Green", "Yellow", "Orange" };

		for (String currentColor : colors) {
			if ("Green".equals(currentColor))
				continue;

			System.out.println(currentColor);
		}

	}

	private void print(String text) {
		System.out.println(text);
	}

	public String getModelNumber() {
		return modelNumber;
	}

	public T getCartridge() {
		return cartridge;
	}

	public void loadPaper(int count) {
		paperTray.addPaper(count);
	}

	@Override
	public void turnOff() {
		machine.turnOff();
	}

	@Override
	public boolean isOn() {
		return machine.isOn();
	}
}
