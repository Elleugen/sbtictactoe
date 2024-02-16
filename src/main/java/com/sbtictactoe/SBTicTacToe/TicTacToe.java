package com.sbtictactoe.SBTicTacToe;

public class TicTacToe {
    private static Board board = new Board();
    private static Player player = new Player();

    //Check the winner in column.
    private static boolean isColumnsWin(int row, int col) {
        int countColumn = 0;
        for(int i = 0; i < row; i++) {
            for(int j = 0; j < col; j++) {
                if(Board.getBoard()[j][i] == Player.getCurrSymbol()) {
                    countColumn++;
                    if(countColumn == 3) {
                        return true;
                    }
                }
            }
            countColumn = 0;
        }
        return false;
    }

    //Check the winner in row.
    private static boolean isRowsWin(int row, int col) {
        int countRow = 0;
        for(int i = 0; i < row; i++) {
            for(int j = 0; j < col; j++) {
                if(Board.getBoard()[i][j] == Player.getCurrSymbol()) {
                    countRow++;
                    if(countRow == 3) {
                        return true;
                    }
                }
            }
            countRow = 0;
        }
        return false;
    }
    /**
    //Check the winner in right diagonal ([i][j]) >>> (\)
    private static boolean isDiagonalRightWin(int row, int col) {
        int i = 0, countRight = 0;
        while(i < 9) {
            if(Board.getBoard()[i][i] == Player.getCurrSymbol()) {
                countRight++;
                if(countRight == 3) { return true;	}
            }else {
                countRight = 0;
            }
            i++;
        }
        return false ;
    }

    //Check the winner in left diagonal ([0][j]) >>> (/)
    private static boolean isDiagonalLeftWin(int row, int col) {
        int i = 8, j = 0, countLeft = 0;

        while(i >= 0) {
            if(Board.getBoard()[i][j] == Player.getCurrSymbol()){
                countLeft++;
                if(countLeft == 3) { return true; }
            }else {
                countLeft = 0;
            }
            i--; j++;
        }
        return false ;
    }**/

    //Check winning type.
    public static boolean isWin(int row, int col) {
        return (isRowsWin(row,col) || isColumnsWin(row,col)
//                || isDiagonalRightWin(row,col) || isDiagonalLeftWin(row,col)
        );
    }
}
