package javaFilesAndIO;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileRead {

	public static void main(String[] args) throws IOException {
		File file = new File("Hello.txt");
		file.createNewFile();

		FileWriter fileWriter = new FileWriter(file);
		fileWriter.write("This\n is\n an\n example\n");
		fileWriter.flush();
		fileWriter.close();

		FileReader fileRead = new FileReader(file);
		char[] a = new char[50];
		fileRead.read(a);
		for (char c : a)
			System.out.print(c);

		fileRead.close();

	}

}
