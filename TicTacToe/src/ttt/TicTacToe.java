package ttt;

import java.util.Scanner;

public class TicTacToe {

	public static final String empty = "   ", x = " X ", o = " O ";
	public static String ActivePlayer;

	public static final int line = 3, column = 3;

	public static String Field[][] = new String[line][column];

	public static int StatusOfGame;
	public static final int winX = 0, winO = 1, draw = 2, continueGame = 3;

	public static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {

		start();

		do {
			enterPlayer();
			AnalysisField();
			createField();
			if (StatusOfGame == winX) {
				System.out.println("Winner is X");
			} else if (StatusOfGame == winO) {
				System.out.println("Winner is O");
			} else if (StatusOfGame == draw) {
				System.out.println("It is draw");
			}
			ActivePlayer = (ActivePlayer == x ? o : x);
		} while (StatusOfGame == continueGame);

	}

	public static void start() {

		for (int l = 0; l < line; l++) {
			for (int c = 0; c < column; c++) {
				Field[l][c] = empty;
			}
		}
		ActivePlayer = x;
		createField();

	}

	public static void createField() {
		for (int l = 0; l < line; l++) {
			for (int c = 0; c < column; c++) {
				System.out.print(Field[l][c]);
				if (c != column - 1)
					System.out.print("|");
			}
			System.out.println();
			if (l != line - 1)

				System.out.println("------------");

		}
		System.out.println();

	}

	public static String findWinner() {
		int sameMarks;

		for (int l = 0; l < line; l++) {
			sameMarks = 0;
			for (int c = 0; c < column; c++) {
				if (Field[l][0] != empty && Field[l][0] == Field[l][c]) {
					sameMarks++;
				}
			}
			if (sameMarks == 3) {
				return Field[l][0];
			}
		}

		for (int c = 0; c < column; c++) {
			sameMarks = 0;
			for (int l = 0; l < line; l++) {
				if (Field[0][c] != empty && Field[0][c] == Field[l][c]) {
					sameMarks++;
				}
			}
			if (sameMarks == 3) {
				return Field[0][c];
			}
		}

		if (Field[0][2] != empty && Field[1][1] == Field[0][2] && Field[1][1] == Field[2][0]) {
			return Field[0][2];
		}

		if (Field[0][0] != empty && Field[0][0] == Field[1][1] && Field[1][1] == Field[2][2]) {
			return Field[0][0];
		}

		return empty;
	}

	public static void AnalysisField() {

		String winner = findWinner();

		if (winner.equals(x)) {
			StatusOfGame = winX;
		} else if (winner.equals(o)) {
			StatusOfGame = winO;
		} else if (allFieldFull()) {
			StatusOfGame = draw;
		} else {
			StatusOfGame = continueGame;
		}

	}

	public static boolean allFieldFull() {
		for (int l = 0; l < line; l++) {
			for (int c = 0; c < column; c++) {
				if (Field[l][c] == empty) {
					return false;
				}
			}

		}

		return true;
	}

	public static void enterPlayer() {
		boolean EnterTrue = false;

		do {
			System.out.println("Player " + ActivePlayer + ", enter line 1-3 and column 1-3 through a space");

			int l = scan.nextInt() - 1;
			int c = scan.nextInt() - 1;
			if (l >= 0 && l < line && c >= 0 && c < column && Field[l][c] == empty) {
				Field[l][c] = ActivePlayer;
				EnterTrue = true;
			} else {
				System.out.println("Your placing (" + (l + 1) + ", " + (c + 1) + ") is false. Try again...");
			}
		} while (!EnterTrue); // повторювати до тих пір, поки введення не буде істинним

	}
}
