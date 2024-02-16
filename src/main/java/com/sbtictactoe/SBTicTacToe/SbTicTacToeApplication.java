package com.sbtictactoe.SBTicTacToe;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

import java.util.Scanner;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class SbTicTacToeApplication {

	public static void main(String[] args) {
		SpringApplication.run(SbTicTacToeApplication.class, args);

		Scanner scan = new Scanner(System.in);
		int sizeRow = 9, sizeCol = 9;

		Board board = new Board();
		TicTacToe game = new TicTacToe();
		Player player = new Player();
		Board.field();

		boolean start = false;
		while (!start) {
			System.out.println("\nHello, this is SBTictactoe");
			System.out.println("Customize your board to play!");
			System.out.println("Size row: ");
			sizeRow = scan.nextInt();
			System.out.println("Size column: ");
			sizeCol = scan.nextInt();
			if(sizeRow < 10 && sizeCol < 10 && sizeRow > 2 && sizeCol > 2) {
				Board.field();
				System.out.print(board.printBoard(sizeRow,sizeCol));
				start = true;
			} else {
				System.out.println("Row or Column should be between 3-9. Try again!");
			}
		}


		while (!board.isFull(sizeRow,sizeCol)) {

			if (Player.getCurrSymbol() == 'X') {
				System.out.println("Player 1's turn.");
			} else {
				System.out.println("Player 2's turn.");
			}
			System.out.print("Select row: ");
			int row = scan.nextInt();
			System.out.print("Select column: ");
			int col = scan.nextInt();

			while (Board.getBoard()[sizeRow-1][sizeCol-1] != '~') {
				System.out.println("\n\nYou can't place on that cell. Try again!");
				System.out.print("Select row: ");
				row = scan.nextInt();
				System.out.print("Select column: ");
				col = scan.nextInt();
			}

			Player.currMark(row - 1, col - 1);
			System.out.println();
			System.out.printf("You placed on (" + row + ", " + col + ")\n");
			System.out.print(board.printBoard(sizeRow,sizeCol)) ;
			if (TicTacToe.isWin(sizeRow,sizeCol)) {
				if (Player.getCurrSymbol() == 'X') {
					System.out.println("Congratulation! Player 1 win.");
				} else {
					System.out.println("Congratulation! Player 2 win.");
				}
				break;
			}
			Player.changePlayer();
		}
	}
}
