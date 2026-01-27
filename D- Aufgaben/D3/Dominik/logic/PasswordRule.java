package logic;

public interface PasswordRule {
    boolean isValid(String password);

    String getErrorMessage();
}
