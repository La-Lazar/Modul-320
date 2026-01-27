package logic;

public class NumberRule implements PasswordRule {
    @Override
    public boolean isValid(String password) {
        return password.chars().anyMatch(Character::isDigit);
    }

    @Override
    public String getErrorMessage() {
        return "Passwort muss mindestens eine Ziffer enthalten.";
    }
}
