package com.model;

import com.model.impl.*;

/**
 * The ChessBoard2 class represents a real chess board I use for my Chess Game.
 * It includes some steps of initializations and I use this to create a 8 * 8 grid chessboard for my Chess Game
 */
public class ChessBoard2 {

    /**
     * The two-dimensional array representing the chess board.
     */
    public static ChessPiece[][] board = new ChessPiece[9][9];

    /**
     * Constructor for the ChessBoard2 class.
     * Initializes the chess board with chess pieces.
     */
    public ChessBoard2() {
        for (int i = 1; i <= 8; i ++)
        {
            for (int j = 1; j <= 8; j ++)
            {
                if (board[i][j] != null) {
                    return;
                }
            }
        }

        // Pawn
        board[2][1] = new Pawn(2, 1, Color.BLACK);
        board[2][2] = new Pawn(2, 2, Color.BLACK);
        board[2][3] = new Pawn(2, 3, Color.BLACK);
        board[2][4] = new Pawn(2, 4, Color.BLACK);
        board[2][5] = new Pawn(2, 5, Color.BLACK);
        board[2][6] = new Pawn(2, 6, Color.BLACK);
        board[2][7] = new Pawn(2, 7, Color.BLACK);
        board[2][8] = new Pawn(2, 8, Color.BLACK);
        board[7][1] = new Pawn(7, 1, Color.WHITE);
        board[7][2] = new Pawn(7, 2, Color.WHITE);
        board[7][3] = new Pawn(7, 3, Color.WHITE);
        board[7][4] = new Pawn(7, 4, Color.WHITE);
        board[7][5] = new Pawn(7, 5, Color.WHITE);
        board[7][6] = new Pawn(7, 6, Color.WHITE);
        board[7][7] = new Pawn(7, 7, Color.WHITE);
        board[7][8] = new Pawn(7, 8, Color.WHITE);

        // Rook
        board[1][1] = new Rook(1, 1, Color.BLACK);
        board[1][8] = new Rook(1, 8, Color.BLACK);
        board[8][1] = new Rook(8, 1, Color.WHITE);
        board[8][8] = new Rook(8, 8, Color.WHITE);

        // Knight
        board[1][2] = new Knight(1, 2, Color.BLACK);
        board[1][7] = new Knight(1, 7, Color.BLACK);
        board[8][2] = new Knight(8, 2, Color.WHITE);
        board[8][7] = new Knight(8, 7, Color.WHITE);

        // Bishop
        board[1][3] = new Bishop(1, 3, Color.BLACK);
        board[1][6] = new Bishop(1, 6, Color.BLACK);
        board[8][3] = new Bishop(8, 3, Color.WHITE);
        board[8][6] = new Bishop(8, 6, Color.WHITE);

        // Queen
        board[1][4] = new Queen(1, 4, Color.BLACK);
        board[8][4] = new Queen(8, 4, Color.WHITE);

        // Knight
        board[1][5] = new King(1, 5, Color.BLACK);
        board[8][5] = new King(8, 5, Color.WHITE);
    }

}
