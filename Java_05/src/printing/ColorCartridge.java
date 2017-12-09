package printing;

public enum ColorCartridge implements CartridgeInterface {

	RED("Red"), GREEN("Green"), BLUE("Blue"), YELLOW("Yellow");

	private final String colorText;

	private ColorCartridge(String colorText) {
		this.colorText = colorText;
	}

	@Override
	public String toString() {
		return "Color!";
	}

	@Override
	public String getFillPercentage() {
		return "97%";
	}

	@Override
	public String printColor() {
		return colorText;
	}

}
