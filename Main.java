package TICTOCTOEGAME;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Introduce thee game
        System.out.println("Heyyy !! Let's Play TIC TOC TOE with Shreyansh ");
        // Creating a tic-tac-toe board for Visualization using a 2D array
        char[][] Board = new char[3][3];
        initializeBoard(Board); // Call a separate method to initialize the board

        char player = 'X';
        boolean gameover = false;
        Scanner sc = new Scanner(System.in);

        while (!gameover) {
            printBoard(Board); // Use printBoard for better naming convention
            System.out.println("Player " + player + " enter row and column (0-2):");
            int row = sc.nextInt();
            int column = sc.nextInt();

            // Check for valid input
            if (isValidMove(row, column, Board)) {
                Board[row][column] = player; // Place the element
                gameover = hasWon(Board, player); // Use hasWon for better naming
                if (gameover) {
                    System.out.println("Player " + player + " has won!");
                } else {
                    player = (player == 'X') ? 'O' : 'X';
                }
            } else {
                System.out.println("Invalid move, cell already taken.");
            }
        }
        printBoard(Board);
        sc.close(); // Close the scanner
    }

    public static void initializeBoard(char[][] Board) {
        for (int row = 0; row < Board.length; row++) {
            for (int column = 0; column < Board[row].length; column++) {
                Board[row][column] = ' ';
            }
        }
    }

    public static boolean isValidMove(int row, int column, char[][] Board) {
        return row >= 0 && row < Board.length && column >= 0 && column < Board[0].length && Board[row][column] == ' ';
    }

    public static boolean hasWon(char[][] Board, char player) {
        // Check rows for player win
        for (int row = 0; row < Board.length; row++) {
            if (Board[row][0] == player && Board[row][1] == player && Board[row][2] == player) {
                return true;
            }
        }
        // Check columns for player win
        for (int column = 0; column < Board[0].length; column++) {
            if (Board[0][column] == player && Board[1][column] == player && Board[2][column] == player) {
                return true;
            }
        }
        // Check diagonals for player win
        if (Board[0][0] == player && Board[1][1] == player && Board[2][2] == player) {
            return true;
        }

        if (Board[0][2] == player && Board[1][1] == player && Board[2][0] == player) {
            return true;
        }
        return false;
    }

    public static void printBoard(char[][] Board) {
        for (int row = 0; row < Board.length; row++) {
            for (int column = 0; column < Board[row].length; column++) {
                System.out.print(Board[row][column] + " | ");
            }
            System.out.println();
        }
    }
}