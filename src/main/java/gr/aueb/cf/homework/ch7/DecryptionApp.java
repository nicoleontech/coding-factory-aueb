package gr.aueb.cf.homework.ch7;

public class DecryptionApp {

    public static void main(String[] args) {

        System.out.println(decryptString("Ojdpmf"));
        String output = String.valueOf(decryptString("Ojdpmf"));
        String expected = "Nicole";
        if (!expected.contentEquals(output)) throw new AssertionError();
    }


    public static StringBuilder decryptString(String str) {
        if (str.trim().isEmpty()) {
            throw new IllegalArgumentException();
        }
        StringBuilder stringBuilder = new StringBuilder();
        for (char ch : str.toCharArray()) {
            char prevChar = (char) ((int) ch - 1);
            stringBuilder.append(prevChar);
        }
        return stringBuilder;
    }

    public static char decipher(int ch, int key) {
        int m, c;

        c = ch - 65;
        m = ((c - key) + 26) % 26;
        return (char) (m + 65);
    }

    public static String decrypt(String s, int key) {
        StringBuilder encrypted = new StringBuilder();
        char ch;
        for (int i = 0; i < s.length(); i++) {
            ch = s.charAt(i);
            if (Character.isUpperCase(ch)) {
                encrypted.append(decipher(ch, key));
            } else {
                encrypted.append(ch);
            }
        }
        return encrypted.toString();
    }
}
