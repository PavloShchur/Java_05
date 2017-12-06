package printing;

public class Printer extends Machine {

	private String modelNumber;
	private PaperTray paperTray = new PaperTray();

	public Printer(boolean isOn, String modelNumber) {
		super(isOn);
		this.modelNumber = modelNumber;
	}

	public void print(int copies) {

		String status = "";
		String textToPrint = "";

		if (isOn)
			status = " is on!";
		else
			status = " is off";

		textToPrint = modelNumber + status;

		// for (int i = 0; i < copies; i++) {
		while (copies > 0 && !paperTray.isEmpty()) {
			System.out.println(textToPrint);
			copies--;
			paperTray.usePage();
		}

		if (paperTray.isEmpty()) {
			System.out.println("Load more paper!");
		}

	}

	public void printColors() {
		String[] colors = new String[] { "Red", "Blue", "Green", "Yellow", "Orange" };

		for (String currentColor : colors) {
			if ("Green".equals(currentColor))
				// break;
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

	public void loadPaper(int count) {
		paperTray.addPaper(count);
	}
}
