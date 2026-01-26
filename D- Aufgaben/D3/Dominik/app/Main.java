package app;

import ui.ConsoleInput;
import service.PasswordService;

public class Main {
    public static void main(String[] args) {
        ConsoleInput input = new ConsoleInput();
        PasswordService service = new PasswordService();

        String password = input.readPassword();

        try {
            service.checkPassword(password);
            System.out.println("✅ Passwort ist gültig!");
        } catch (Exception e) {
            System.out.println("❌ Fehler: " + e.getMessage());
        }
    }
}
