package gr.aueb.cf.ch17.runnable;

public class Main {


    private final static Runnable knight1 = new Knight("black knight");
    private final static Runnable knight2 = new Knight("white knight");
    private final static Runnable knight3 = new Knight("red knight");


    public static void main(String[] args) {

        (new Thread(knight1)).start();
        (new Thread(knight2)).start();
        (new Thread(knight3)).start();

    }
}
