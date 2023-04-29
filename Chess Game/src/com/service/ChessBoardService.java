package com.service;

import com.model.ChessBoard2;


/**
 * The ChessBoardService class is responsible for initializing and displaying the chess board.
 */
public class ChessBoardService {

    /**
     * Initializes the chess board.
     *
     * @param chessBoard2 The chess board to be initialized.
     */
    public void initChessBoard(ChessBoard2 chessBoard2) {

        for (int i = 1; i <= 8; i ++)
        {
            System.out.println("==================================================================");
            for (int j = 1; j <= 8; j ++)
            {
                System.out.print("||");
                if (chessBoard2.board[i][j] != null && chessBoard2.board[i][j].getColor().equals("BLACK")) {
                    // Display the chess piece in black color
                    System.out.printf("%7s", ColorInfo.getFormatLogString(chessBoard2.board[i][j].toString(), 34, 0) );
                }
                else if (chessBoard2.board[i][j] != null && chessBoard2.board[i][j].getColor().equals("WHITE")) {
                    // Display the chess piece in white color
                    System.out.printf("%7s", ColorInfo.getFormatLogString(chessBoard2.board[i][j].toString(), 32, 0) );
                }
                else
                {   // Display empty space
                    System.out.print("      ");
                }
            }
            System.out.println("||");
        }
        System.out.println("==================================================================");
    }

}
