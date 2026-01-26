package exception;

public class NoNumberException extends PasswordException {
    public NoNumberException() {
        super("Passwort muss mindestens eine Zahl enthalten.");
    }
}
