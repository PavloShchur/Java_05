package programmingBasics;

public class Massive {

	public static void main(String[] args) {
		// int[] massive = { 1, 2, 3, 4, 5, 6 };
		// // System.out.println(massive); [I@15db9742
		// for (int i = 0; i < massive.length; i++) {
		// System.out.print(massive[i] + " ");
		// }

		// char[] c = { 'a', 'b', 'c' };
		// for (int i = 0; i < c.length; i++) {
		// System.out.print(i + " ");
		// for (int j = 0; j < c.length; j++) {
		// System.out.print(c[i] + " ");
		// break;
		// }
		// System.out.println();
		// }

		// BubleSort
		// int[] bubleSort = { 25, 789, 7, 465, 30 };
		// int temp;
		// for (int i : bubleSort) {
		// System.out.print(i + " ");
		// }
		// for (int i = 0; i < bubleSort.length; i++) {
		// for (int j = bubleSort.length - 1; j > i; j--) {
		// if (bubleSort[j] < bubleSort[i]) {
		// temp = bubleSort[j];
		// bubleSort[j] = bubleSort[i];
		// bubleSort[i] = temp;
		// }
		// }
		// }
		// System.out.println();
		// for (int i : bubleSort) {
		// System.out.print(i + " ");
		// }

		// int[] newMassive = new int[3];
		// newMassive[0] = 1;
		// newMassive[1] = 2;
		// newMassive[2] = 3;
		// for (int i : newMassive) {
		// System.out.print(i + " ");
		// }

		// int[] betterMassive = new int[25];
		// Random random = new Random();
		// for (int i = 0; i < betterMassive.length; i++) {
		// betterMassive[i] = random.nextInt(47);
		// System.out.println(betterMassive[i] + " ");
		// }
		// System.out.println();
		// Arrays.sort(betterMassive);
		// for (int i : betterMassive) {
		// System.out.print(i + " ");
		// }

		// int[][] doubleMassive = new int[7][7];
		// Random random = new Random(47);
		// for (int i = 0; i < doubleMassive.length; i++) {
		// for (int j = 0; j < doubleMassive.length; j++) {
		// doubleMassive[i][j] = random.nextInt(100);
		// System.out.print(doubleMassive[i][j] + " ");
		// }
		// System.out.println();
		// }

		// int[][] doubleMassive = { { 1, 2, 3, 4, 5, }, { 6, 7, 8, 9, 10 } };
		// for (int i = 0; i < doubleMassive.length; i++) {
		// for (int j = 0; j < doubleMassive.length; j++) {
		// System.out.print(doubleMassive[i][j] + " ");
		// }
		// System.out.println();
		// }

		int[][] doubleMassive = { { 1, 2, 3, 4, 5, }, { 6, 7, 8, 9, 10 } };
		for (int i = 0; i < doubleMassive.length; i++) {
			for (int j = 0; j < doubleMassive[i].length; j++) {
				System.out.print(doubleMassive[i][j] + " ");
			}
			System.out.println();
		}

	}

}
