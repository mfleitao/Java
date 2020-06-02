package com.algorithms;

public class ChessBoard {

	public static final int BOARD_SIZE = 8;
	
	private static final String BLACK = "[X]";
	
	private static final String WHITE = "[ ]";
	
	private static String[][] board = new String[BOARD_SIZE][BOARD_SIZE];
	
	
	public static void main(String[] args) {
		ChessBoard.setup();
		System.out.println("----- Chess Board ------ \n");
		ChessBoard.display();
	}
	
	public static void setup() {
		for (int i = 0; i < BOARD_SIZE; i++) {
			for (int j = 0; j < BOARD_SIZE; j++)
				board[i][j] = ((i + j) % 2 == 0) ? BLACK : WHITE;
		}
	}
	
	public static void display() {
		for (String[] row : board) {
			for (String square : row)
				System.out.print(square);
			System.out.print("\n");
		}
	}
	
}
