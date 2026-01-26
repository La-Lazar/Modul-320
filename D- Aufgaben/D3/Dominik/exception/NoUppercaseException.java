package exception;

public class NoUppercaseException extends PasswordException {
    public NoUppercaseException() {
        super("Passwort muss mindestens einen Großbuchstaben enthalten.");
    }
}
