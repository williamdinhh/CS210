package Week6;

import java.util.Arrays;

public class battleShip {
    private int boardSize;
    private char[][] board;

    public battleShip(int size) {
        this.boardSize = size;
        this.board = new char[boardSize][boardSize];
        createBoard();
    }

    public void createBoard() {
        for (char[] row : board) {
            Arrays.fill(row, '0');
        }
    }

    public void printBoard() {
        for (char[] row : board) {
            System.out.println(new String(row));
        }
        System.out.println();
    }

    public boolean placeShip(int startX, int startY, String shipType, String direction) {
        int shipLength = getShipLength(shipType);

        if (!isValidPosition(startX, startY, shipLength, direction)) {
            System.out.println("Invalid position to place ship.");
            return false;
        }

        char shipSymbol = '-';
        if (direction.equals("vertical")) {
            for (int i = 0; i < shipLength; i++) {
                board[startX + i][startY] = shipSymbol;
            }
        } else if (direction.equals("horizontal")) {
            for (int i = 0; i < shipLength; i++) {
                board[startX][startY + i] = shipSymbol;
            }
        }

        return true;
    }

    public void fire(int x, int y) {
        if (board[x][y] == '-') {
            System.out.println("Hit!");
            board[x][y] = 'X';
        } else if (board[x][y] == '0') {
            System.out.println("Miss!");
            board[x][y] = '?';
        } else if (board[x][y] == 'X' || board[x][y] == '?') {
            System.out.println("Already fired at this position.");
        }
    }

    private int getShipLength(String shipType) {
        switch (shipType) {
            case "Carrier":
                return 5;
            case "Battleship":
                return 4;
            case "Destroyer":
            case "Cruiser":
            case "Submarine":
                return 3;
            default:
                return 0;
        }
    }

    private boolean isValidPosition(int startX, int startY, int shipLength, String direction) {
        if (direction.equals("vertical")) {
            if (startX + shipLength > boardSize) {
                return false;
            }
            for (int i = 0; i < shipLength; i++) {
                if (board[startX + i][startY] != '0') {
                    return false;
                }
            }
        } else if (direction.equals("horizontal")) {
            if (startY + shipLength > boardSize) {
                return false;
            }
            for (int i = 0; i < shipLength; i++) {
                if (board[startX][startY + i] != '0') {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        battleShip game = new battleShip(20);

        // Placing ships
        game.placeShip(0, 0, "Carrier", "horizontal");
        game.placeShip(1, 1, "Battleship", "vertical");
        game.placeShip(2, 2, "Destroyer", "horizontal");
        game.placeShip(3, 3, "Cruiser", "vertical");
        game.placeShip(4, 4, "Submarine", "horizontal");

        // Printing initial board
        System.out.println("Initial Board:");
        game.printBoard();

        // Firing
        game.fire(0, 0); // This should hit the Carrier
        game.fire(1, 1); // This should hit the Battleship
        game.fire(5, 5); // This should miss
        game.fire(0, 0); // Test firing at the same position

        // Printing updated board after firing
        System.out.println("Updated Board:");
        game.printBoard();
    }
}
