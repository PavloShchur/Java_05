package programmingBasics;

import java.util.Scanner;

public class TicTacToe {

	public static final String EMPTY = "   ", CROSS = " X ", ZERO = " O ";
	public static String active_player = "";

	public static final byte ROWS = 3, COLUMNS = 3;

	public static String[][] gameTable = new String[ROWS][COLUMNS];
	public static int statusOfGame;
	public static final int GAME_GO = 0, GAME_DRAW = 1, GAME_X = 3, GAME_O = 4;

	public static Scanner in = new Scanner(System.in);

	public static void main(String[] args) {
		startGame();
		do {
			receiveChoice();
			whoIsWinner();
			showTable();
			if (statusOfGame == GAME_X) {
				System.out.println("X is winner");
			} else if (statusOfGame == GAME_O) {
				System.out.println("O is winner");
			} else if (statusOfGame == GAME_DRAW) {
				System.out.println("DRAW");
			}
			active_player = (active_player == CROSS ? ZERO : CROSS);
		} while (statusOfGame == GAME_GO);

	}// main

	public static void startGame() {
		for (byte row = 0; row < ROWS; row++) {
			for (byte column = 0; column < COLUMNS; column++) {
				gameTable[row][column] = EMPTY;
			}
		}
		active_player = CROSS;
		showTable();
	}

	public static void receiveChoice() {
		boolean inputIsValid = false;
		do {
			System.out.println("Player " + active_player + " make your decision(1 - 3 with whitespace)");
			byte row = (byte) (in.nextByte() - 1);
			byte column = (byte) (in.nextByte() - 1);
			if (row >= 0 && row < ROWS && column >= 0 && column < COLUMNS && gameTable[row][column] == EMPTY) {
				gameTable[row][column] = active_player;
				inputIsValid = true;
			} else {
				System.out.println("Wrong input (" + (row + 1) + ", " + (column + 1) + " is out of table.");
			}
		} while (!inputIsValid);
	}

	public static void whoIsWinner() {
		String winner = findTheWinner();
		if (winner.equals(CROSS)) {
			statusOfGame = GAME_X;
		} else if (winner.equals(ZERO)) {
			statusOfGame = GAME_O;
		} else if (CellsFilled()) {
			statusOfGame = GAME_DRAW;
		} else {
			statusOfGame = GAME_GO;
		}
	}

	public static boolean CellsFilled() {
		for (byte row = 0; row < ROWS; row++) {
			for (byte column = 0; column < COLUMNS; column++) {
				if (gameTable[row][column] == EMPTY) {
					return false;
				}
			}
		}
		return true;
	}

	public static String findTheWinner() {

		byte amountOfWinCells;
		for (byte row = 0; row < ROWS; row++) {
			amountOfWinCells = 0;
			for (byte columns = 0; columns < COLUMNS; columns++) {
				if (gameTable[row][0] != EMPTY && gameTable[row][0] == gameTable[row][columns]) {
					amountOfWinCells++;
				}
			}
			if (amountOfWinCells == 3) {
				return gameTable[row][0];
			}
		}

		for (byte column = 0; column < COLUMNS; column++) {
			amountOfWinCells = 0;
			for (byte row = 0; row < ROWS; row++) {
				if (gameTable[0][column] != EMPTY && gameTable[0][column] == gameTable[row][column]) {
					amountOfWinCells++;
				}
			}
			if (amountOfWinCells == 3) {
				return gameTable[0][column];
			}
		}

		if (gameTable[0][0] != EMPTY && gameTable[0][0] == gameTable[1][1] && gameTable[0][0] == gameTable[2][2]) {
			return gameTable[0][0];
		}

		if (gameTable[0][2] != EMPTY && gameTable[1][1] == gameTable[0][2] && gameTable[2][0] == gameTable[0][2]) {
			return gameTable[0][2];
		}
		return EMPTY;
	}

	public static void showTable() {
		for (byte row = 0; row < ROWS; row++) {
			for (byte column = 0; column < COLUMNS; column++) {
				System.out.print(gameTable[row][column]);
				if (column != COLUMNS - 1) {
					System.out.print("|");
				}
			}
			System.out.println();
			if (row != ROWS - 1) {
				System.out.println("-----------");
			}
		}
		System.out.println();
	}

}// class
