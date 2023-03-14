package gr.aueb.cf.ch20.regexapp;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        String s = "green";
        System.out.println(isRedOrGreen(s));
        System.out.println(isRredOrGgreen(s));

        System.out.println(Arrays.toString(getTokens("hello  world")));
        System.out.println(normalizeStr("h    el lo"));
        System.out.println(mutuallyChange("h    el lo"));
    }

    private static boolean isRedOrGreen(String s) {
        return s.matches("Red|Green");
    }

    private static boolean isRredOrGgreen(String s) {
        return s.matches("[Rr]ed|[Gg]reen");
    }

    private static boolean beginWithOneUppercaseEndWithIng(String s) {
        return s.matches("[A-Z]ing");
    }

    private static boolean isAnySpaceDigit(String s) {
        return s.matches("\\s\\d");
    }

    private static boolean isLetterDigit(String s) {
        return s.matches("\\w\\d");
    }

    private static boolean isValidEmail(String s) {
        return s.matches("\\w*\\.?\\w+@\\w+\\.(com|gr)");
    }

    private static boolean isTwoUppercaseLettersDashSevenDigits(String s) {
        return s.matches("[A-Z]{2}-\\d{7}");
    }

    //Returns an array of tokens delimited by one or more spaces
    private static String[] getTokens(String s) {
        return s.split("\\s+");
    }

    private static String normalizeStr(String s) {
        return s.replaceAll("\\s+", " ");
    }

    private static String mutuallyChange(String s) {
        return s.replaceAll("(.*)\\s+(.*)", "$2 $1");
    }

}
