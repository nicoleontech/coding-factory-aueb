package gr.aueb.cf.ch3;

/**
 * Εκτυπώνει 10 σειρές με αστεράκια σε φθίνουσα σειρά
 */
public class StarsDescOrder {


    public static void main(String[] args) {
        //1st solution
    /*   int i =1;
        int j = 10;

        while (i<=10){

            j = 10;

            while (j >= i){
                System.out.print("*");
                j--;
            }
            System.out.println();
            i++;
        }
        */

        //2nd solution
//        for (int i = 1; i <= 10; i++) {
//            System.out.println();
//            for (int j = 10; j >= i; j--) {
//                System.out.print("*");
//            }
//        }

        //3rd solution
        for (int i = 1; i <= 10; i++) {
            System.out.println();
            for (int j = i; j <= 10; j++) {
                System.out.print("*");
            }
        }


    }
}