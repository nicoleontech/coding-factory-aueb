package gr.aueb.cf.ch20.regexapp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternStartOfString {

    public static void main(String[] args) {
        String s = "A12:B23:C!76:";

        Pattern pattern = Pattern.compile("^[A-Z].*?:");

        Matcher matcher = pattern.matcher(s);

        while (matcher.find()){
            System.out.println(matcher.group(0));
        }
    }
}
