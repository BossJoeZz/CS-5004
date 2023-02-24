package com.company.impl;

import com.company.ChessBoard;
import com.company.ChessPiece;

import java.util.ArrayList;

public class ChessBoardImpl implements ChessBoard {

    /**
     * Create a new ChessBoardImpl.
     *
     * @param chessPieces The tatal chessPieces.
     * @param chessBoard The chessPiece in the chessBoard, size 8*8.
     */
    ArrayList<ChessPiece> chessPieces = new ArrayList<>();
    public static ChessPiece[][] chessBoard = new ChessPiece[8][8];

    public ChessBoardImpl() {
    }

    /**
     * use chessPieces init chessBoard
     *
     * @param chessPieces The tatal chessPieces.
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
     * get piece through row and col
     *
     * @param row row in the board.
     * @param col col in the board.
     * @return the chessPiece in the row,col
     */
    @Override
    public ChessPiece getPiece(int row, int col) {
         return this.chessBoard[row][col];
    }

}
