package logic;

public class UppercaseRule implements PasswordRule {
    @Override
    public boolean isValid(String password) {
        return password.chars().anyMatch(Character::isUpperCase);
    }

    @Override
    public String getErrorMessage() {
        return "Passwort muss mindestens einen Großbuchstaben enthalten.";
    }
}
