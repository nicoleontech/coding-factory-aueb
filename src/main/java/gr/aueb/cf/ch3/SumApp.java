package gr.aueb.cf.ch3;

/**
 * Υπολογίζει 1+2+3...+10
 * Συνολικό Άθροισμα αριθμών από το 1 - 10
 */
public class SumApp {

    public static void main(String[] args) {
        int sum = 0;
        int i=1;

        while (i<=10){
            sum += i;
            i++;
        }
        System.out.println(sum);
    }
}
