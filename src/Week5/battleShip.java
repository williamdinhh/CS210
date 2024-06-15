package Week5;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.InputMismatchException;

public class battleShip {

    private int boardSize;
    private char[][] board;
    private ArrayList<int[]> shipCoordinates;
    private ArrayList<int[]> firedShots;

    public battleShip(int size) {
        this.boardSize = size;
        this.board = new char[boardSize][boardSize];
        this.shipCoordinates = new ArrayList<>();
        this.firedShots = new ArrayList<>();
        createBoard();
    }

    public void createBoard() {
        for (int i = 0; i < boardSize; i++) {
            for (int j = 0; j < boardSize; j++) {
                board[i][j] = '0';
            }
        }
    }

    public void printBoard() {
        for (char[] row : board) {
            System.out.println(new String(row));
        }
        System.out.println();
    }

    public boolean placeShip(int x, int y, int length, String direction) {
        if (direction.equals("horizontal")) {
            if (y + length > boardSize) {
                return false;
            }
            for (int i = 0; i < length; i++) {
                if (board[x][y + i] != '0') {
                    return false;
                }
            }
            for (int i = 0; i < length; i++) {
                board[x][y + i] = '-';
            }
        } else if (direction.equals("vertical")) {
            if (x + length > boardSize) {
                return false;
            }
            for (int i = 0; i < length; i++) {
                if (board[x + i][y] != '0') {
                    return false;
                }
            }
            for (int i = 0; i < length; i++) {
                board[x + i][y] = '-';
            }
        } else {
            return false;
        }
        return true;
    }

    public void fire(int x, int y) {
        try {
            if (x < 0 || x >= boardSize || y < 0 || y >= boardSize) {
                throw new IndexOutOfBoundsException("Coordinates out of bounds! Please enter valid coordinates. (0-19)");
            }

            if (board[x][y] == '-') {
                board[x][y] = 'X';
                System.out.println("Hit!");
            }
            else if (board[x][y] == '0') {
                board[x][y] = '?';
                System.out.println("Miss!");
            }
            else {
                System.out.println("Already targeted!");
            }
        }
        catch (IndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void main(String[] args) {
        battleShip gameBoard = new battleShip(20);

        gameBoard.placeShip(2, 2, 5, "horizontal"); // Carrier
        gameBoard.placeShip(5, 5, 4, "vertical");   // Battleship
        gameBoard.placeShip(7, 7, 2, "horizontal"); // Destroyer
        gameBoard.placeShip(10, 10, 3, "vertical"); // Cruiser
        gameBoard.placeShip(13, 13, 3, "horizontal"); // Submarine

        gameBoard.printBoard();

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Enter coordinates to fire (x y) or -1 to exit: ");
            try {
                int x = scanner.nextInt();
                if (x == -1) break;
                int y = scanner.nextInt();

                gameBoard.fire(x, y);
                gameBoard.printBoard();
            }
            catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter integers (in the form 'x y' x for coordinates.");
                scanner.next();
            }
        }
    }
}
