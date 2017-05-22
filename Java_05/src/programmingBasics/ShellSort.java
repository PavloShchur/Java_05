package programmingBasics;

import java.util.Scanner;

public class ShellSort {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.println("Please write the dimension of the massive");
			int dimension = scanner.nextInt();

			int[][] matrix = new int[dimension][dimension];
			int row = 0;
			int column = 0;
			int dx = 1;
			int dy = 0;
			int directionChanges = 0;
			int visits = dimension;
			for (int i = 0; i < dimension * dimension; i++) {
				matrix[row][column] = i + 1;
				if (--visits == 0) {
					visits = dimension * (directionChanges % 2) + dimension * ((directionChanges + 1) % 2)
							- (directionChanges / 2 - 1) - 2;
					int temp = dx;
					dx = -dy;
					dy = temp;
					directionChanges++;
				}
				column += dx;
				row += dy;
			}
			for (int i = 0; i < dimension; i++) {
				for (int j = 0; j < dimension; j++)
					System.out.print(matrix[i][j] + "\t");
				System.out.println();
			}
		}
	}
}
