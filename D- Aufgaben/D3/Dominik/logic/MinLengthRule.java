package logic;

public class MinLengthRule implements PasswordRule {
    private int minLength;

    public MinLengthRule(int minLength) {
        this.minLength = minLength;
    }

    @Override
    public boolean isValid(String password) {
        return password.length() >= minLength;
    }

    @Override
    public String getErrorMessage() {
        return "Passwort muss mindestens " + minLength + " Zeichen lang sein.";
    }
}
