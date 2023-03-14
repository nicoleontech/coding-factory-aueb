package gr.aueb.cf.miniprojects.tictactoe;

class Player {

    private char signature;

    public Player(char signature) {

        this.signature = signature;
    }

    public char getSignature() {
        return signature;
    }

    @Override
    public String toString() {

        return "Player with signature " + this.signature;
    }
}
