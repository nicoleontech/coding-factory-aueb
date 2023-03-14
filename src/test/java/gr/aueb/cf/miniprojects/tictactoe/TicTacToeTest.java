package gr.aueb.cf.miniprojects.tictactoe;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class TicTacToeTest {

    TicTacToe sut = new TicTacToe();

    @Test
    void createsBoard_WithDimensionsThreeTimesThree() {
        assertThat(sut.getBoard()).isNotNull();
        assertThat(sut.getBoard().length).isEqualTo(3);
    }

    @Test
    void createsTwoPlayers() {
        assertThat(sut.getPlayerX()).isNotNull();
        assertThat(sut.getPlayerO()).isNotNull();

    }

    @Test
    void nextMove_distinguishesPlayersTurn() {
        sut.nextMove();
    }

    @Test
    void validateMove_returnsFalse_whenInputIsEmpty() {
        var result = sut.validateMove("");
        assertThat(result).isFalse();
    }

    @Test
    void validateMove_returnsFalse_whenInputDoesNotContainComma() {
        var result = sut.validateMove("I am funny");
        assertThat(result).isFalse();
    }

    @Test
    void validateMove_returnsFalse_whenInputIsNotNumeric() {
        var result = sut.validateMove("I, am funny");
        assertThat(result).isFalse();
    }

    @Test
    void validateMove_returnsTrue_whenInputIsValid() {
        var result = sut.validateMove("  0    , 1");
        assertThat(result).isTrue();
    }

    @Test
    void validateMove_returnsFalse_whenMoveIsAlreadyPlayed() {
        var result = sut.validateMove("0,1");
        sut.setFirstMove(false);
        var result1 = sut.validateMove("0,1");
        assertThat(result1).isFalse();
    }

    @Test
    void checkWinner_returnsWinnerX_whenX_WinsHorizontally() {
        var board = sut.getBoard();
        board[0][0] = 'X';
        board[0][1] = 'X';
        board[0][2] = 'X';
        var winner = sut.checkWinner();
        assertThat(winner).isEqualTo(sut.getPlayerX());
    }

    @Test
    void checkWinner_returnsWinnerX_whenX_WinsVertically() {
        var board = sut.getBoard();
        board[0][0] = 'X';
        board[1][0] = 'X';
        board[2][0] = 'X';
        var winner = sut.checkWinner();
        assertThat(winner).isEqualTo(sut.getPlayerX());
    }

    @Test
    void checkWinner_returnsWinnerO_whenO_WinsDiagonal() {
        var board = sut.getBoard();
        board[0][0] = 'O';
        board[1][1] = 'O';
        board[2][2] = 'O';
        var winner = sut.checkWinner();
        assertThat(winner).isEqualTo(sut.getPlayerO());
    }

    @Test
    void checkWinner_returnsWinnerX_whenX_WinsDiagonal() {
        var board = sut.getBoard();
        board[0][2] = 'X';
        board[1][1] = 'X';
        board[2][0] = 'X';
        var winner = sut.checkWinner();
        assertThat(winner).isEqualTo(sut.getPlayerX());
    }

    @Test
    void checkRows_returnRows(){
        sut.checkRows();
    }

    @Test
    void checkRows_returnsWinnerX_whenX_WinsHorizontally() {
        var board = sut.getBoard();
        board[0][0] = 'X';
        board[0][1] = 'X';
        board[0][2] = 'X';
        var winner = sut.checkRows();
        assertThat(winner).isEqualTo(sut.getPlayerX());
    }

    @Test
    void checkRows_returnsWinnerO_whenO_WinsHorizontally() {
        var board = sut.getBoard();
        board[2][0] = 'O';
        board[2][1] = 'O';
        board[2][2] = 'O';
        var winner = sut.checkRows();
        assertThat(winner).isEqualTo(sut.getPlayerO());
    }

    @Test
    void checkColumns(){
        sut.checkColumns();
    }

    @Test
    void checkWinner_returnsWinnerO_whenO_WinsVertically() {
        var board = sut.getBoard();
        board[0][0] = 'O';
        board[1][0] = 'O';
        board[2][0] = 'O';
        var winner = sut.checkColumns();
        assertThat(winner).isEqualTo(sut.getPlayerO());
    }

    @Test
    void checkColumnsWinner_returnsWinnerX_whenX_WinsVertically() {
        var board = sut.getBoard();
        board[0][2] = 'X';
        board[1][2] = 'X';
        board[2][2] = 'X';
        var winner = sut.checkColumns();
        assertThat(winner).isEqualTo(sut.getPlayerX());
    }

}


