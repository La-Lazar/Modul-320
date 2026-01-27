package logic;

import exception.*;

public class PasswordValidator {

    public void validate(String password) throws PasswordException {

        if (password.length() < 8) {
            throw new PasswordException("Passwort muss mindestens 8 Zeichen lang sein.");
        }

        if (!password.chars().anyMatch(Character::isDigit)) {
            throw new NoNumberException();
        }

        if (!password.chars().anyMatch(Character::isUpperCase)) {
            throw new NoUppercaseException();
        }
    }
}
