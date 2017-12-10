package printing;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

@PrintingDevice(defaultPrintMethod = "print", defaultNumberOfCopies = 5)
public class Printer<T extends CartridgeInterface> implements MachineInterface {
	private String modelNumber;
	private PaperTray paperTray = new PaperTray();
	private Machine machine;
	private T cartridge;

	private Map<Integer, Page> numberOfPage2Page = new HashMap<>();

	public Printer(boolean isOn, String modelNumber, T cartridge) {
		machine = new Machine(isOn);
		this.modelNumber = modelNumber;
		this.cartridge = cartridge;
	}

	public void turnOn() {
		System.out.println("Warming up printer");
		machine.turnOn();
	}

	public synchronized <U extends CartridgeInterface> void printUsingCartridge(U cartridge, String message) {
		System.out.println("Entered: " + Thread.currentThread().getId());
		// System.out.println(cartridge.toString());
		System.out.println(message);
		// System.out.println(cartridge.toString());
		System.out.println("Exited: " + Thread.currentThread().getId());

	}

	@Deprecated
	public void print(int copies) throws IllegalAccessException {
		System.out.println("Depereceted");
		// checkCopies(copies);

		int pageNumber = 1;

		String onStatus = "";
		if (machine.isOn())
			onStatus = " is On!";
		else
			onStatus = " is Off!";

		String textToPrint = getTextFromFile();

		while (copies > 0 && !paperTray.isEmpty()) {

			numberOfPage2Page.put(pageNumber, new Page(textToPrint + " : " + pageNumber));
			copies--;
			pageNumber++;
			paperTray.usePage();
		}

		if (paperTray.isEmpty())
			System.out.println("Load more paper!");
	}

	private String getTextFromFile() {
		FileReader reader = null;
		BufferedReader bufferedReader = null;
		String allText = null;
		CapitalizationReader capReader = null;
		try {
			reader = new FileReader("D:\\БІБЛІОТЕКА\\IT\\Java\\Java_05\\Commit_Java_05\\Java_05\\input.txt");
			bufferedReader = new BufferedReader(reader);
			capReader = new CapitalizationReader(bufferedReader);

			String line;

			while ((line = capReader.readLine()) != null) {
				allText += line + "\n";
			}

			return allText;

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (capReader != null)
				try {
					capReader.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
		}
		return null;
	}

	public void outputPage(int pageNumber) {
		System.out.println("Depereceted");
		PrintWriter printWriter = null;
		try {
			printWriter = new PrintWriter("D:\\БІБЛІОТЕКА\\IT\\Java\\Java_05\\Commit_Java_05\\Java_05\\write.txt");
			printWriter.println(numberOfPage2Page.get(pageNumber).getPrintedText());
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (printWriter != null)
				printWriter.close();
		}
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
		System.out.println("Machine is turn off!!!");
		machine.turnOff();
	}

	@Override
	public boolean isOn() {
		return machine.isOn();
	}

	public void checkCopies(int copies) throws IllegalAccessException {
		if (copies <= 0)
			throw new IllegalAccessException("Cannot print less than 1 copy.");

	}
}
