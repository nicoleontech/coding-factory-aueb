package gr.aueb.cf.ch7;

public class PrimitivesToStringApp {

    public static void main(String[] args) {
        int num = 5;
        float f = 6.64F;
        String s1="";
        String s2="";

        s1 = String.valueOf(num);
        s2 = String.valueOf(f);

        System.out.println(num);
        System.out.println(f);
    }
}
