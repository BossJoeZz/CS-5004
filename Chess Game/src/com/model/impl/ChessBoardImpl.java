package com.model.impl;

import com.model.ChessBoard;
import com.model.ChessPiece;
import com.model.Color;

import java.util.ArrayList;

/**
 * The ChessBoardImpl class implements the ChessBoard interface to represent a chess board.
 * It contains a 2D array to store the ChessPieces and an ArrayList to store all the ChessPieces.
 * It provides methods to initialize the ChessBoard with ChessPieces and get a ChessPiece using row and column.
 */
public class ChessBoardImpl implements ChessBoard {

    /**
     * Create a new ChessBoardImpl.
     *
     * @param chessPieces The total chessPieces.
     * @param chessBoard The chessPiece in the chessBoard, size 8*8.
     */

    // ArrayList to store all the ChessPieces
    ArrayList<ChessPiece> chessPieces = new ArrayList<>();

    // 2D array to store the ChessPieces
    public static ChessPiece[][] chessBoard = new ChessPiece[9][9];

    /**
     * Creates a new ChessBoardImpl object(8*8) and initializes it with the standard starting ChessPieces.
     */
    public ChessBoardImpl() {

        // Pawn
        chessBoard[2][1] = new Pawn(2, 1, Color.BLACK);
        chessBoard[2][2] = new Pawn(2, 2, Color.BLACK);
        chessBoard[2][3] = new Pawn(2, 3, Color.BLACK);
        chessBoard[2][4] = new Pawn(2, 4, Color.BLACK);
        chessBoard[2][5] = new Pawn(2, 5, Color.BLACK);
        chessBoard[2][6] = new Pawn(2, 6, Color.BLACK);
        chessBoard[2][7] = new Pawn(2, 7, Color.BLACK);
        chessBoard[2][8] = new Pawn(2, 8, Color.BLACK);
        chessBoard[7][1] = new Pawn(7, 1, Color.WHITE);
        chessBoard[7][2] = new Pawn(7, 2, Color.WHITE);
        chessBoard[7][3] = new Pawn(7, 3, Color.WHITE);
        chessBoard[7][4] = new Pawn(7, 4, Color.WHITE);
        chessBoard[7][5] = new Pawn(7, 5, Color.WHITE);
        chessBoard[7][6] = new Pawn(7, 6, Color.WHITE);
        chessBoard[7][7] = new Pawn(7, 7, Color.WHITE);
        chessBoard[7][8] = new Pawn(7, 8, Color.WHITE);

        // Rook
        chessBoard[1][1] = new Rook(1, 1, Color.BLACK);
        chessBoard[1][8] = new Rook(1, 8, Color.BLACK);
        chessBoard[8][1] = new Rook(8, 1, Color.WHITE);
        chessBoard[8][8] = new Rook(8, 8, Color.WHITE);

        // Knight
        chessBoard[1][2] = new Knight(1, 2, Color.BLACK);
        chessBoard[1][7] = new Knight(1, 7, Color.BLACK);
        chessBoard[8][2] = new Knight(8, 2, Color.WHITE);
        chessBoard[8][7] = new Knight(8, 7, Color.WHITE);

        // Bishop
        chessBoard[1][3] = new Bishop(1, 3, Color.BLACK);
        chessBoard[1][6] = new Bishop(1, 6, Color.BLACK);
        chessBoard[8][3] = new Bishop(8, 3, Color.WHITE);
        chessBoard[8][6] = new Bishop(8, 6, Color.WHITE);

        // Queen
        chessBoard[1][4] = new Queen(1, 4, Color.BLACK);
        chessBoard[8][4] = new Queen(8, 4, Color.WHITE);

        // Knight
        chessBoard[1][5] = new King(1, 5, Color.BLACK);
        chessBoard[8][5] = new King(8, 5, Color.WHITE);

    }

    /**
     * Creates a new ChessBoardImpl object with the given ArrayList of ChessPieces and initializes the
     * ChessBoard 2D array with the ChessPieces at their corresponding positions.
     * @param chessPieces An ArrayList of ChessPieces to be placed on the ChessBoard.
     */
    public ChessBoardImpl(ArrayList<ChessPiece> chessPieces) {
        this.chessPieces = chessPieces;
        for (ChessPiece chessPiece : chessPieces) {
            int row = chessPiece.getRow();
            int col = chessPiece.getColumn();
            chessBoard[row][col] = chessPiece;
        }
    }

    /**
     * Get piece through row and col
     * @param row row in the board.
     * @param col col in the board.
     * @return the chessPiece in the row,col
     */
    @Override
    public ChessPiece getPiece(int row, int col) {
         return this.chessBoard[row][col];
    }

}
