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
		int sizeRow = 0, sizeCol = 0;

		while (true) {
			System.out.println("\nHello, this is SBTictactoe");
			System.out.println("Customize your board to play!");
			System.out.println("Size row: ");
			sizeRow = scan.nextInt();
			System.out.println("Size column: ");
			sizeCol = scan.nextInt();
			if(sizeRow < 10 && sizeCol < 10 && sizeRow > 2 && sizeCol > 2) {
				Board board = new Board() ;
				Board.field();
				System.out.print(board.board(sizeRow,sizeCol));
			} else {
				System.out.println("Row or Column should be between 3-9. Try again!");
			}
		}

	}
}
