package org.example;

public class PasswordValidator {

    public static void validate(String password) {
        int length = password.length();

        if (length < 8 || length > 12) {
            throw new IllegalArgumentException("Password length must be at least 8 characters");
        }
    }
}
