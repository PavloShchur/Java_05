package programmingBasics;

public class PascalTriangle {

	public static void main(String[] args) {

		int[][] pascalTriangle = new int[10][];

		pascalTriangle[0] = new int[] { 1 };
		pascalTriangle[1] = new int[] { 1, 1 };

		for (int i = 2; i < pascalTriangle.length; i++) {
			pascalTriangle[i] = new int[i + 1];
			pascalTriangle[i][0] = 1;
			pascalTriangle[i][pascalTriangle[i].length - 1] = 1;

			for (int j = 1; j < pascalTriangle[i].length - 1; j++) {
				pascalTriangle[i][j] = pascalTriangle[i - 1][j - 1] + pascalTriangle[i - 1][j];
			}
		}

		for (int[] i : pascalTriangle) {
			for (int j : i) {
				System.out.print(j + " ");
			}
			System.out.println();
		}

	}

}
