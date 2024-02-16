package com.sbtictactoe.SBTicTacToe;

public class Board {
    private static char[][] board = new char[9][9];

    public static char[][] getBoard() {
        return board;
    }

    public static void setBoard(char[][] board) {
        Board.board = board;
    }
    //Customize board size
    public String printBoard(int sizeRow, int sizeCol) {
        String temp = "" ;
        for (int i = 0; i < sizeCol+1; i++) {
            temp += String.format("%d   ", i) ;
        }
        temp += "\n";
        for (int i = 0; i < sizeRow; i++) {
            temp += String.format("%d | ", i+1);
            for (int j = 0; j < sizeCol; j++) {
                temp += String.format("%c | ", board[i][j]);
            }
            temp += "\n";
        }
        return temp;
    }

    //Generate field board for players.
    public static void field() {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                board[i][j] = '~';
            }
        }
    }

    //Check if the board is full or not.
    public boolean isFull(int sizeRow, int sizeCol) {
        boolean full = true;
        for (int i = 0; i < sizeRow; i++) {
            for (int j = 0; j < sizeCol; j++) {
                if (board[i][j] == '~') {
                    full = false;
                }
            }
        }
        return full;
    }

}
