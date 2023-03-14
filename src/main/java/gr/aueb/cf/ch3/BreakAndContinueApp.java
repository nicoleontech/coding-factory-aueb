package gr.aueb.cf.ch3;

/**
 *
 */
public class BreakAndContinueApp {

    public static void main(String[] args) {
        int i = 0, j = 0;
        int result = 0;

        while (true) {
            if (i == 5) {
                break;
            }
            i++;
        }

        while (j <= 10) {
            j++;
            if (j == 5) {
                continue;
            }
            result = result + j;
        }
        System.out.println("result= " + result);
    }
}
