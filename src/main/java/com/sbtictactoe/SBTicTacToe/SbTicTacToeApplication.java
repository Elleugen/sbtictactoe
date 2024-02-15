package com.sbtictactoe.SBTicTacToe;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class SbTicTacToeApplication {

	public static void main(String[] args) {
		SpringApplication.run(SbTicTacToeApplication.class, args);

		System.out.println("\nHello world");
	}
}
