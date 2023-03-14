package gr.aueb.cf.ch7;

import java.io.IOException;

public class TraverseWithSubstring {

    public static void main(String[] args) throws IOException {
        System.out.println(traverseWihSubstring("Coding Factory"));


    }


    public static String traverseWihSubstring(String s) {
        String subStr = "";
        for (int i = 0; i < s.length(); i++) {
            System.out.print(s.substring(i, i + 1) + " ");
            subStr += s.substring(i, i + 1) + " ";
        }
        return subStr;
    }

}