package gr.aueb.cf.ch7;

public class CopyStrApp {

    public static void main(String[] args) {
        String s1 = "Nicole";
        String s2 = clone(s1);

        s2 = s2.toLowerCase();

        System.out.println(s1);
        System.out.println(s2);
    }

    //εδώ αρκεί αυτό, γιατί τα String είναι immutable
    public static String clone(String str){
        return str;
    }
}
