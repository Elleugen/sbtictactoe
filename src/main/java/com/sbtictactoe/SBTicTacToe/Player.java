package com.sbtictactoe.SBTicTacToe;

public class Player {
    // Player 1 = 'X', Player 2 = 'O'
    private static char currPlayer = 'X';
    private static Board board = new Board();
    private static Player player = new Player();


    public static char getCurrSymbol() {
        return currPlayer;
    }

    public static void setCurrSymbol(char currSymbol) {
        Player.currPlayer = currSymbol;
    }

    //Change symbol when the player is changed.
    public static void changePlayer() {
        if (currPlayer == 'X') {
            currPlayer = 'O';
        } else {
            currPlayer = 'X';
        }
    }

    //Mark current position with symbol.
    public static boolean currMark(int row, int col) {
        if ((row >= 0) && (row < 9)) {
            if ((col >= 0) && (col < 9)) {
                if (Board.getBoard()[row][col] == '~') {
                    Board.getBoard()[row][col] = getCurrSymbol();
                    return true;
                }
            }
        }
        return false;
    }
}
