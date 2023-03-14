package gr.aueb.cf.ch7;

public class EmptyApp {

    public static void main(String[] args) {

        System.out.print("*".repeat(10));
        String s = "";

        if(s.isEmpty()){
            System.out.println(s.length());
        }
    }
}
