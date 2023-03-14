package gr.aueb.cf.homework.ch7;

public class EncryptionApp {

    public static void main(String[] args) {

        //Testing the method
        System.out.println(encryptString("Nicole"));
        String output = String.valueOf(encryptString("Nicole"));
        String expected = "Ojdpmf";
        if (!expected.contentEquals(output)) throw new AssertionError();

        System.out.println(encrypt("NICOLE", 1));

        String s = "JULIUS CAESAR";
        final int key = 3;
        System.out.println(encrypt(s, key));

    }

    public static StringBuilder encryptString(String str) {
        if (str.trim().isEmpty()) {
            throw new IllegalArgumentException();
        }
        StringBuilder stringBuilder = new StringBuilder();
        for (char ch : str.toCharArray()) {
            char nextChar = (char) ((int) ch + 1);
            stringBuilder.append(nextChar);
        }
        return stringBuilder;
    }

    public static char cipher(char ch, int key) {
        int m, c;
        //starting from 0
        m = ch - 65;
        //0-25, c= cipher
        c = (m + key) % 26;
        return (char) (c + 65);
    }

    public static String encrypt(String s, int key) {
        StringBuilder encrypted = new StringBuilder();
        char ch;
        for (int i = 0; i < s.length(); i++) {
            ch = s.charAt(i);
            if (Character.isUpperCase(ch)) {
                encrypted.append(cipher(ch, key));
            } else {
                encrypted.append(ch);
            }
        }
        return encrypted.toString();
    }

}

