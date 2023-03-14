package gr.aueb.cf.ch4;

/**
 * Evaluates the sum and mul between 1 - 10.
 */
public class SumMulApp {

    public static void main(String[] args) {
         int sum = 0;
         int mul = 1;

         for(int i = 1; i<=10; i++){
             sum += i ;
             mul *=i;
         }

        System.out.println("Sum= "+sum);
        System.out.println("Mul= "+mul);

    }
}
