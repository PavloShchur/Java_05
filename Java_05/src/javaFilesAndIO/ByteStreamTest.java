package javaFilesAndIO;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class ByteStreamTest {

	public static void main(String[] args) throws IOException {
		ByteArrayOutputStream bOutputStream = new ByteArrayOutputStream(12);

		while (bOutputStream.size() != 10) {
			bOutputStream.write(System.in.read());
		}

		byte b[] = bOutputStream.toByteArray();
		System.out.println("Print the content");
		for (int x = 0; x < b.length; x++) {
			System.out.println((char) b[x] + " ");
		}
		System.out.println(" ");

		int c;
		ByteArrayInputStream bInput = new ByteArrayInputStream(b);
		System.out.println("Converting characters to uppercase: ");
		for (int y = 0; y < 1; y++) {
			while ((c = bInput.read()) != -1) {
				System.out.println(Character.toUpperCase((char) c));
			}
			bInput.reset();
		}
	}

}
