package gr.aueb.cf.ch4;

/**
 * Compares 2 chars
 * Τα ελληνικά έχουν μεγαλύτερο ordinal number
 */
public class CompareApp {

    public static void main(String[] args) {
        char ch1 = 'a';
        char ch2 = 'A';
        char greek = 'α';
        boolean isGreater = false;
        boolean isGreekGrater = false;

        System.out.println(ch1);
        System.out.println(ch2);

        if (ch1 > ch2){
            isGreater = true;
        }

        if( greek > ch1){
            isGreekGrater = true;
        }

        System.out.println("ch1 is greater? "+ isGreater);
        System.out.println("greek is greater? "+ isGreekGrater);
    }
}
