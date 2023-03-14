package gr.aueb.cf.ch7;

public class LowerUpperTrimApp {

    public static void main(String[] args) {
        String s = "       Athens University";
        String lowercase = "";
        String uppercase = "";
        String trimmed = "";

        lowercase = s.toLowerCase();
        uppercase = s.toUpperCase();
        trimmed = s.trim();

        System.out.println(lowercase);
        System.out.println(uppercase);
        System.out.println(trimmed);

        System.out.println("*".repeat(10));

    }
}
