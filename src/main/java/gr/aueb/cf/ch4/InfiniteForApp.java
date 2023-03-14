package gr.aueb.cf.ch4;

public class InfiniteForApp {

    public static void main(String[] args) {
        int count = 0;

        for (; ; ) {
            System.out.println("Forever");

            count++;
            if (count % 20 == 0) {
                System.out.println();
            }
            if (count == 100) {
                break;
            }
        }
    }
}
