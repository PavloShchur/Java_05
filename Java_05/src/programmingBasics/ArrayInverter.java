package programmingBasics;

import java.util.Arrays;

public class ArrayInverter {

	public static void invert(int[] data) {
		for (int k = 0; k < data.length / 2; k++) {
			int temp = data[k];
			data[k] = data[data.length - 1 - k];
			data[data.length - 1 - k] = temp;
			System.out.println(Arrays.toString(data));
		}
	}

	public static void main(String[] args) {

		int[] data = { 1, 2, 3, 4 };

		invert(data);
	}

}
