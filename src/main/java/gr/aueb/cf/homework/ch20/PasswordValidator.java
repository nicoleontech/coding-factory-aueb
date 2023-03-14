package gr.aueb.cf.homework.ch20;

import java.util.regex.Pattern;

public class PasswordValidator {


    private static final int PASSWORD_MINIMUM_LENGTH = 8;
    private final Pattern passwordPattern = Pattern.compile("^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[#?!@$%^&*-]).+$");

    public boolean isPasswordValid(String password) {
        return password.length() >= PASSWORD_MINIMUM_LENGTH && passwordPattern.matcher(password).matches();
    }
}
