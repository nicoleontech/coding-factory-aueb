package gr.aueb.cf.ch3;

/**
 * Εκτυπώνει 10 σειρές με αστεράκια σε αύξουσα σειρά
 */
public class StarsAscOrder {


    public static void main(String[] args) {
        //1st solution
//        int i =1;
//        int j = 1;
//
//        while (i<=10){
//
//            j = 1;
//
//            while (j<=i){
//                System.out.print("*");
//                j++;
//            }
//            System.out.println();
//            i++;
//        }

        //2nd solution
        for (int i = 1; i <= 10; i++) {
            System.out.println();
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
        }
    }
}