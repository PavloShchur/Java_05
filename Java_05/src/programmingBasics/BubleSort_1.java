package programmingBasics;

public class BubleSort_1 {

	public static void main(String[] args) {
		int[] array = { 1, 58, 47, 5, 12, 5 };
		bubleSort(array);
	}

	public static void bubleSort(int[] m) {
		int numberOfChanges = 0;
		boolean change = true;
		while (change) {
			change = false;
			for (int i = 0; i < m.length - 1 - numberOfChanges; i++) {
				if (m[i] > m[i + 1]) {
					int tmp = m[i];
					m[i] = m[i + 1];
					m[i + 1] = tmp;
					change = true;
				}
			}
			numberOfChanges++;
		}
		for (int i : m) {
			System.out.print(i + " ");
		}
	}

}
