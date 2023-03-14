package gr.aueb.cf.miniprojects.tictactoe;

import java.util.Arrays;
import java.util.Scanner;

class TicTacToe {
    private static final int BOARD_DIMENSION = 3;
    private static char[][] board;

    private Player playerX;
    private Player playerO;

    private Player currentPlayer;

    boolean firstMove;

    public static void main(String[] args) {

        TicTacToe ticTacToe = new TicTacToe();

        Scanner scanner = new Scanner(System.in);

        Player winner = null;

        System.out.println("Welcome to Tic Tac Toe game.");
        ticTacToe.printBoard();
        System.out.println("Let's start");


        while (winner == null) {

            ticTacToe.nextMove();
            ticTacToe.setFirstMove(false);
            String move = scanner.nextLine();
            ticTacToe.validateMove(move);
            ticTacToe.printBoard();
            winner = ticTacToe.checkWinner();

        }

    }

    public TicTacToe() {
        board = new char[BOARD_DIMENSION][BOARD_DIMENSION];
        this.playerX = new Player('X');
        this.playerO = new Player('O');
        this.currentPlayer = playerX;
        this.firstMove = true;
    }

    public void setFirstMove(boolean firstMove) {
        this.firstMove = firstMove;
    }


    char[][] getBoard() {
        return board;
    }

    Player getPlayerX() {
        return playerX;
    }

    Player getPlayerO() {
        return playerO;
    }

    void printBoard() {
        for (char[] row : board) {
            System.out.println("\n");
            for (char column : row) {
                System.out.print(column);
                System.out.print("\t");
            }
        }
        System.out.println();
    }

    void nextMove() {
        if (!firstMove) {
            currentPlayer = currentPlayer == playerX ? playerO : playerX;
        }
        System.out.println(currentPlayer + " make your move");
        System.out.println("Enter two numbers for row and column");

    }

    boolean validateMove(String input) {

        if (input == null || input.isEmpty()) {
            return false;
        }
        String[] moves = input.split(",");
        if (moves.length != 2) {
            return false;
        }
        try {
            int moveX = Integer.parseInt(moves[0].trim());
            int moveY = Integer.parseInt(moves[1].trim());
            if (moveX >= BOARD_DIMENSION || moveY >= BOARD_DIMENSION) {
                return false;
            } else if (!firstMove && (board[moveX][moveY] != '\u0000')) {
                System.out.println("This position is already played. Choose another one!");
                return false;
            } else {
                board[moveX][moveY] = currentPlayer.getSignature();
            }
        } catch (NumberFormatException e) {
            return false;
        }

        return true;
    }

    Player checkWinner() {
        Player winnerRows = checkRows();
        Player winnerColumns = checkColumns();
        if (winnerRows == null && winnerColumns == null && checkDiagonal() == null) {
            return null;
        } else if (winnerRows != null) {
            return winnerRows;
        } else if (winnerColumns != null) {
            return winnerColumns;
        } else if (checkDiagonal() != null) {
            return checkDiagonal();
        }
        return null;
    }

    Player checkRows() {
        for (int i = 0; i < board.length; i++) {
            var row = board[i];
            if (isPlayerXWinner(row)) {
                return playerX;
            } else if (isPlayerOWinner(row)) {
                return playerO;
            }
        }
        return null;
    }

    Player checkColumns() {

        for (int j = 0; j < BOARD_DIMENSION; j++) {
            var cell1 = board[0][j];
            var cell2 = board[1][j];
            var cell3 = board[2][j];
            var column = new char[]{cell1, cell2, cell3};

            if (isPlayerXWinner(column)) {
                return playerX;
            } else if (isPlayerOWinner(column)) {
                return playerO;
            }
        }
        return null;
    }

    Player checkDiagonal() {
        var firstDiagonal = new char[]{board[0][0], board[1][1], board[2][2]};
        var secondDiagonal = new char[]{board[0][2], board[1][1], board[2][0]};
        if (isPlayerXWinner(firstDiagonal) || isPlayerXWinner(secondDiagonal)) {
            return playerX;
        } else if (isPlayerOWinner(firstDiagonal) || isPlayerOWinner(secondDiagonal)) {
            return playerO;
        }
        return null;
    }

    boolean isPlayerXWinner(char[] input) {
        return Arrays.equals(input, new char[]{'X', 'X', 'X'});
    }

    boolean isPlayerOWinner(char[] input) {
        return Arrays.equals(input, new char[]{'O', 'O', 'O'});
    }


}
