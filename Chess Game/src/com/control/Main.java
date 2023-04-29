package com.control;

import com.model.ChessBoard2;
import com.model.impl.ChessBoardImpl;
import com.service.ChessBoardService;

import java.util.Random;
import java.util.Scanner;

/**
 * This is the start point of the program for playing Chess Game.
 * I have no UI parts, so have to play Chess Game by executing this Main class.
 * @author  Zheng Qiao CS 5004 Final Project
 */
public class Main {

    // Initialize the board
    static ChessBoard2 chessBoard2 = new ChessBoard2();
    static ChessBoardImpl chessBoard = new ChessBoardImpl();
    static Main m = new Main();

    public static void main(String[] args) {

        while (true) {

            System.out.println("=======================");
            System.out.println("   Chess Game     ");
            System.out.println("   1: Player VS Player   ");
            System.out.println("   2: Player VS AI    ");
            System.out.println("=======================");

            int finalWhiteRow = 8, finalWhiteCol = 5, finalBlackRow = 1, finalBlackCol = 5;

            // Wait for user input to start the game
            System.out.println("Please enter：");
            Scanner scanner = new Scanner(System.in);
            int param1 = scanner.nextInt();

            ChessBoardService chessBoardService = new ChessBoardService();
            chessBoardService.initChessBoard(chessBoard2);

            // Choose 1: Player VS Player
            if (param1 == 1) {
                // Is the game over?
                boolean isPrime = false;
                while (!isPrime) {

                    // Print game options for the user to choose from
                    System.out.println("==============================");
                    System.out.println("   WHITE's turn     ");
                    System.out.println("   1: Move one of your pieces   ");
                    System.out.println("   2: Kill one piece     ");
                    System.out.println("==============================");
                    System.out.println("Please enter：");
                    int param2 = scanner.nextInt();

                    // WHITE's turn and choose 1: Move one of your pieces
                    if (param2 == 1) {
                        // White
                        boolean isPrimePieceWhite = false;
                        while (!isPrimePieceWhite) {

                            int x1 = 0, y1 = 0;

                            boolean isPrimeColorWHite = false;
                            while (!isPrimeColorWHite) {
                                System.out.println("Please enter the coordinate of the piece that need to be moved");
                                x1 = scanner.nextInt();
                                y1 = scanner.nextInt();

                                // Determine whether the piece is a white piece
                                if (chessBoard2.board[x1][y1].getColor().equals("WHITE")) {
                                    isPrimeColorWHite = true;
                                } else {
                                    isPrimeColorWHite = false;
                                    System.out.println("The piece is not white!");
                                }
                            }

                            System.out.println("Please enter the coordinate of your destination");
                            int x2 = scanner.nextInt();
                            int y2 = scanner.nextInt();

                            // judgement to check if can move
                            if (chessBoard2.board[x1][y1].canMove(x2, y2)) {

                                // judgement for King
                                if (chessBoard2.board[x1][y1].toString().equals("King  ")) {
                                    finalWhiteRow = x2;
                                    finalWhiteCol = y2;
                                }

                                m.move(x1, y1, x2, y2);
                                m.move2(x1, y1, x2, y2);
                                isPrimePieceWhite = true;
                            } else {
                                System.out.println("cannot move to this location！");
                            }
                        }
                    }

                    // White's turn and choose 2: Kill one piece
                    if (param2 == 2) {
                        // White
                        boolean isPrimePieceWhite = false;
                        while (!isPrimePieceWhite) {

                            int x1 = 0, y1 = 0;

                            boolean isPrimeColorWHite = false;
                            while (!isPrimeColorWHite) {
                                System.out.println("Please enter the coordinate of the piece that need to be moved");
                                x1 = scanner.nextInt();
                                y1 = scanner.nextInt();

                                // Determine whether the piece is a white piece
                                if (chessBoard2.board[x1][y1].getColor().equals("WHITE")) {
                                    isPrimeColorWHite = true;
                                } else {
                                    isPrimeColorWHite = false;
                                    System.out.println("The piece is not white！");
                                }
                            }

                            System.out.println("Please enter the coordinate of the opponent's chess piece being killed: ");
                            int x2 = scanner.nextInt();

                            int y2 = scanner.nextInt();

                            // judgement to check if can kill
                            if (chessBoard2.board[x1][y1].canKill(chessBoard2.board[x2][y2])) {

                                // judgement for King
                                if (chessBoard2.board[x1][y1].toString().equals("King  ")) {
                                    finalWhiteRow = x2;
                                    finalWhiteCol = y2;
                                }

                                // If the opposing king is killed, white wins and the game ends
                                if (x2 == finalBlackRow && y2 == finalBlackCol) {
                                    System.out.println("White wins, game over！");
                                    isPrime = true;
                                    break;
                                }

                                m.move(x1, y1, x2, y2);
                                m.move2(x1, y1, x2, y2);
                                isPrimePieceWhite = true;
                            } else {
                                System.out.println("cannot kill this piece");
                            }
                        }
                    }


                    // Check board status
                    chessBoardService.initChessBoard(chessBoard2);

                    // BLACK's turn, if loop to execute this
                    System.out.println("===============================");
                    System.out.println("   BLACK's turn     ");
                    System.out.println("   1: Move one of your pieces   ");
                    System.out.println("   2: Kill one piece     ");
                    System.out.println("===============================");
                    System.out.println("Please enter：");
                    param2 = scanner.nextInt();

                    // Black's turn and choose 1: Move one of your pieces
                    if (param2 == 1) {
                        // Black
                        boolean isPrimePieceBlack = false;
                        while (!isPrimePieceBlack && !isPrime) {

                            int x1 = 0, y1 = 0;

                            boolean isPrimeColorBlack = false;
                            while (!isPrimeColorBlack) {
                                System.out.println("Please enter the coordinate of the piece that need to be moved");
                                x1 = scanner.nextInt();
                                y1 = scanner.nextInt();

                                // Determine whether the piece is a white piece
                                if (chessBoard2.board[x1][y1].getColor().equals("BLACK")) {
                                    isPrimeColorBlack = true;
                                } else {
                                    isPrimeColorBlack = false;
                                    System.out.println("This piece is not black！");
                                }
                            }

                            System.out.println("Please enter the coordinate of your destination");
                            int x2 = scanner.nextInt();
                            int y2 = scanner.nextInt();

                            // Judgement
                            if (chessBoard2.board[x1][y1].canMove(x2, y2)) {

                                // Judgement for King
                                if (chessBoard2.board[x1][y1].toString().equals("King  ")) {
                                    finalBlackRow = x2;
                                    finalBlackCol = y2;
                                }

                                m.move(x1, y1, x2, y2);
                                m.move2(x1, y1, x2, y2);
                                isPrimePieceBlack = true;
                            } else {
                                System.out.println("cannot move to this location！！！");
                            }
                        }
                    }

                    if (param2 == 2) {
                        // Black
                        boolean isPrimePieceBlack = false;
                        while (!isPrimePieceBlack && !isPrime) {

                            int x1 = 0, y1 = 0;

                            boolean isPrimeColorBlack = false;
                            while (!isPrimeColorBlack) {
                                System.out.println("Please enter the coordinate of the pieces that need to be moved");
                                x1 = scanner.nextInt();
                                y1 = scanner.nextInt();

                                // Determine whether this piece is black
                                if (chessBoard2.board[x1][y1].getColor().equals("BLACK")) {
                                    isPrimeColorBlack = true;
                                } else {
                                    isPrimeColorBlack = false;
                                    System.out.println("The piece is not black!");
                                }
                            }

                            System.out.println("Please enter the coordinate of the opponent's chess piece being killed:");
                            int x2 = scanner.nextInt();
                            int y2 = scanner.nextInt();

                            // Judgement
                            if (chessBoard2.board[x1][y1].canKill(chessBoard2.board[x2][y2])) {

                                // Judgement for king
                                if (chessBoard2.board[x1][y1].toString().equals("King  ")) {
                                    finalBlackRow = x2;
                                    finalBlackCol = y2;
                                }

                                // If the king of black is killed, then game is over
                                if (x2 == finalWhiteRow && y2 == finalWhiteCol) {
                                    System.out.println("Black win, game over！");

                                    System.out.println("Do you want to continue with the next one Y/N?");
                                    String s = scanner.nextLine();
                                    if (s.equals("Y"))
                                    {
                                        isPrime = true;
                                        break;
                                    }
                                    else
                                    {
                                        return;
                                    }
                                }

                                m.move(x1, y1, x2, y2);
                                m.move2(x1, y1, x2, y2);
                                isPrimePieceBlack = true;
                            } else {
                                System.out.println("cannot kill the piece");
                            }
                        }
                    }
                    // check the board status
                    chessBoardService.initChessBoard(chessBoard2);
                }
            }


            // Player VS AI
            if (param1 == 2) {

                // Is the game over?
                boolean isPrime = false;
                while (!isPrime) {

                    System.out.println("================");
                    System.out.println("   WHITE's turn     ");
                    System.out.println("   1: Move one of your pieces   ");
                    System.out.println("   2: Kill one piece     ");
                    System.out.println("================");
                    System.out.println("Please enter：");
                    int param2 = scanner.nextInt();

                    // WHITE's turn and choose 1: Move one of your pieces
                    if (param2 == 1) {
                        // White
                        boolean isPrimePieceWhite = false;
                        while (!isPrimePieceWhite) {

                            int x1 = 0, y1 = 0;

                            boolean isPrimeColorWHite = false;
                            while (!isPrimeColorWHite) {
                                System.out.println("Please enter the coordinate of the piece that need to be moved");
                                x1 = scanner.nextInt();
                                y1 = scanner.nextInt();

                                // Determine whether the piece is a white piece
                                if (chessBoard2.board[x1][y1].getColor().equals("WHITE")) {
                                    isPrimeColorWHite = true;
                                } else {
                                    isPrimeColorWHite = false;
                                    System.out.println("The piece is not white!");
                                }
                            }

                            System.out.println("Please enter the coordinate of your destination");
                            int x2 = scanner.nextInt();
                            int y2 = scanner.nextInt();

                            // judgement
                            if (chessBoard2.board[x1][y1].canMove(x2, y2)) {

                                // judgement for King
                                if (chessBoard2.board[x1][y1].toString().equals("King  ")) {
                                    finalWhiteRow = x2;
                                    finalWhiteCol = y2;
                                }

                                m.move(x1, y1, x2, y2);
                                m.move2(x1, y1, x2, y2);
                                isPrimePieceWhite = true;
                            } else {
                                System.out.println("cannot move to this location！！！");
                            }
                        }
                    }

                    // White's turn and choose 2: Kill one piece
                    if (param2 == 2) {
                        // White
                        boolean isPrimePieceWhite = false;
                        while (!isPrimePieceWhite) {

                            int x1 = 0, y1 = 0;

                            boolean isPrimeColorWHite = false;
                            while (!isPrimeColorWHite) {
                                System.out.println("Please enter the coordinate of the pieces that need to be moved");
                                x1 = scanner.nextInt();
                                y1 = scanner.nextInt();

                                // Determine whether the piece is a white piece
                                if (chessBoard2.board[x1][y1].getColor().equals("WHITE")) {
                                    isPrimeColorWHite = true;
                                } else {
                                    isPrimeColorWHite = false;
                                    System.out.println("The piece is not white！");
                                }
                            }

                            System.out.println("Please enter the coordinate of the opponent's chess piece being killed:");
                            int x2 = scanner.nextInt();
                            int y2 = scanner.nextInt();

                            // judgement
                            if (chessBoard2.board[x1][y1].canKill(chessBoard2.board[x2][y2])) {

                                // judgement for King
                                if (chessBoard2.board[x1][y1].toString().equals("King  ")) {
                                    finalWhiteRow = x2;
                                    finalWhiteCol = y2;
                                }

                                if (x2 == finalBlackRow && y2 == finalBlackCol) {
                                    System.out.println("White wins, game over！");
                                    isPrime = true;
                                    break;
                                }

                                m.move(x1, y1, x2, y2);
                                m.move2(x1, y1, x2, y2);
                                isPrimePieceWhite = true;
                            } else {
                                System.out.println("cannot kill the piece");
                            }
                        }
                    }


                    // Check board status
                    chessBoardService.initChessBoard(chessBoard2);

                    // AI operation

                    Random r1 = new Random();
                    param2 = 1;

                    if (param2 == 1) {
                        // Black
                        boolean isPrimePieceBlack = false;
                        while (!isPrimePieceBlack && !isPrime) {

                            int x1 = 0, y1 = 0;
                            long before = System.currentTimeMillis();

                            boolean isPrimeColorBlack = false;
                            while (!isPrimeColorBlack) {
                                Random r2 = new Random();
                                x1 = r2.nextInt(8) + 1;
                                //x1 = 2;
                                Random r3 = new Random();
                                y1 = r3.nextInt(8) + 1;

                                // Determine whether the piece is a black piece
                                if (chessBoard2.board[x1][y1] != null && chessBoard2.board[x1][y1].getColor().equals("BLACK")) {
                                    isPrimeColorBlack = true;
                                } else {
                                    isPrimeColorBlack = false;
                                }
                            }

                            boolean isPrimeMoveBlack = false;
                            while (!isPrimeMoveBlack) {

                                Random r4 = new Random();
                                int x2 = r4.nextInt(8) + 1;

                                Random r5 = new Random();
                                int y2 = r5.nextInt(8) + 1;

                                // Judgement
                                if (chessBoard2.board[x1][y1].canMove(x2, y2)) {

                                    isPrimeMoveBlack = true;

                                    // Judgement for King
                                    if (chessBoard2.board[x1][y1].toString().equals("King  ")) {
                                        finalBlackRow = x2;
                                        finalBlackCol = y2;
                                    }

                                    m.move(x1, y1, x2, y2);
                                    m.move2(x1, y1, x2, y2);
                                    isPrimePieceBlack = true;
                                } else {
                                    //System.out.println("cannot move to this location！！！！");
                                }
                                long later = System.currentTimeMillis();
                                if (later - before >= 100)
                                    break;
                            }
                        }
                    }

                    if (param2 == 2) {
                        // Black
                        boolean isPrimePieceBlack = false;
                        while (!isPrimePieceBlack && !isPrime) {

                            int x1 = 0, y1 = 0;

                            boolean isPrimeColorBlack = false;
                            while (!isPrimeColorBlack) {
                                System.out.println("Please enter the coordinate of the piece that need to be moved");

                                x1 = scanner.nextInt();
                                y1 = scanner.nextInt();

                                if (chessBoard2.board[x1][y1].getColor().equals("BLACK")) {
                                    isPrimeColorBlack = true;
                                } else {
                                    isPrimeColorBlack = false;
                                    System.out.println("The piece is not black！");
                                }
                            }

                            System.out.println("Please enter the coordinate of the opponent's chess piece being killed:");
                            int x2 = scanner.nextInt();
                            int y2 = scanner.nextInt();

                            // Judgement
                            if (chessBoard2.board[x1][y1].canKill(chessBoard2.board[x2][y2])) {

                                // Judgement for King
                                if (chessBoard2.board[x1][y1].toString().equals("King  ")) {
                                    finalBlackRow = x2;
                                    finalBlackCol = y2;
                                }

                                // If the opposing king is killed, black wins and the game ends
                                if (x2 == finalWhiteRow && y2 == finalWhiteCol) {
                                    System.out.println("Black wins, game over！");
                                    isPrime = true;
                                    break;
                                }

                                m.move(x1, y1, x2, y2);
                                m.move2(x1, y1, x2, y2);
                                isPrimePieceBlack = true;
                            } else {
                                System.out.println("cannot move to this location！！！");
                            }
                        }
                    }
                    // Check board status
                    chessBoardService.initChessBoard(chessBoard2);
                }
            }
        }
    }

    /**
     * Moves a chess piece from the specified starting position to the specified ending position
     * on the chess board represented by the "chessBoard2" object.
     *
     * @param x1 the row index of the starting position (0-indexed)
     * @param y1 the column index of the starting position (0-indexed)
     * @param x2 the row index of the ending position (0-indexed)
     * @param y2 the column index of the ending position (0-indexed)
     */
    public void move2(int x1, int y1, int x2, int y2)
    {
        chessBoard2.board[x1][y1].setCol(y2);
        chessBoard2.board[x1][y1].setRow(x2);
        chessBoard2.board[x2][y2] = chessBoard2.board[x1][y1];
        chessBoard2.board[x1][y1] = null;
    }

    public void move(int x1, int y1, int x2, int y2)
    {
        chessBoard.chessBoard[x1][y1].setCol(y2);
        chessBoard.chessBoard[x1][y1].setRow(x2);
        chessBoard.chessBoard[x2][y2] = chessBoard2.board[x1][y1];
        chessBoard.chessBoard[x1][y1] = null;
    }
}
