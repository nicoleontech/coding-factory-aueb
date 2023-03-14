package gr.aueb.cf.ch5;

public class FloatingExpressionsApp {

    public static void main(String[] args) {
        int intNum = 10;
        double doubleNum = 0.1;
        float floatNum = 10.5F;
        double doubleNum2 = 25D;

        float floatResult = 0.0F;
        double doubleResult = 0.0;

        floatResult = floatNum + intNum;
        doubleResult = doubleNum + floatNum + intNum;
        System.out.printf("FloatResult = %f",floatResult);
        System.out.println();
        System.out.printf("DoubleResult = %f",doubleResult);

    }
}
