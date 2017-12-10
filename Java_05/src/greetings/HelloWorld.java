package greetings;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import printing.ColorCartridge;
import printing.ContinuousPrinter;
import printing.Printer;
import printing.PrintingDevice;

public class HelloWorld {

	public static void main(String[] args) throws IllegalAccessException, NoSuchMethodException, SecurityException,
			IllegalArgumentException, InvocationTargetException {
		Printer<ColorCartridge> printer = new Printer<ColorCartridge>(true, "MY PRINTER", ColorCartridge.RED);

		printer.loadPaper(10);
		// printer.print(3);
		PrintingDevice annotation = printer.getClass().getAnnotation(PrintingDevice.class);
		Method printMethod = printer.getClass().getMethod(annotation.defaultPrintMethod(), int.class);
		printMethod.invoke(printer, annotation.defaultNumberOfCopies());
		printer.outputPage(1);

		// Path path =
		// Paths.get("D:\\БІБЛІОТЕКА\\IT\\Java\\Java_05\\Commit_Java_05\\Java_05\\Hello.txt");

		// Creating a File
		// try {
		// Files.createFile(path);
		// } catch (IOException e) {
		// // TODO Auto-generated catch block
		// e.printStackTrace();
		// }

		// Deleting a File
		// try {
		// Files.deleteIfExists(path);
		// } catch (IOException e) {
		// // TODO Auto-generated catch block
		// e.printStackTrace();
		// }

		// Moving a File
		// try {
		// Files.move(path,
		// Paths.get("D:\\БІБЛІОТЕКА\\IT\\Java\\Java_05\\Commit_Java_05\\Java_05\\movedfile.txt"));
		// } catch (IOException e) {
		// // TODO Auto-generated catch block
		// e.printStackTrace();
		// }

		ContinuousPrinter continuousPrinter = new ContinuousPrinter();
		// Thread thread = new Thread(continuousPrinter);
		// thread.start();

		ExecutorService executorService = Executors.newFixedThreadPool(100);
		// ExecutorService executorService =
		// Executors.newSingleThreadExecutor();
		executorService.submit(continuousPrinter);
		executorService.submit(continuousPrinter);
		executorService.submit(continuousPrinter);
		executorService.submit(continuousPrinter);
		executorService.submit(continuousPrinter);
		executorService.submit(continuousPrinter);
		executorService.shutdown();

		for (int i = 0; i < 100; i++)
			System.out.println("Main thread " + i);

	}

}
