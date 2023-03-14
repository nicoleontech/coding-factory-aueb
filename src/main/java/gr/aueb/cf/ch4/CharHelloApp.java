package gr.aueb.cf.ch4;

/**
 * To 'h' είναι ένας int! Ta '' είναι ένας τελεστής που μετατρέπει σε char
 * Άρα μπορώ και το αντίστροφο να κάνω typecast σε int
 */
public class CharHelloApp {

    public static void main(String[] args) {
       // int h = 'h';
        char h = 'h';
        char e = 'e';
        char l = 'l';
        char o = 'o';
        char exclamationMark = '!';

        System.out.print(h);
        System.out.print(e);
        System.out.print(l);
        System.out.print(l);
        System.out.print(o);
        System.out.print((int)o);
        System.out.print(exclamationMark);


    }
}
