package app;

import java.util.List;
import logic.PasswordValidator;
import ui.ConsoleInput;

public class Main {
    public static void main(String[] args) {
        ConsoleInput input = new ConsoleInput();

        // Regeln konfigurieren
        var rules = input.selectRules();
        PasswordValidator validator = new PasswordValidator(rules);

        boolean valid = false;

        while (!valid) {
            String password = input.readPassword();

            List<String> errors = validator.validate(password);

            if (errors.isEmpty()) {
                System.out.println("\n Passwort ist gültig!\n");
                valid = true;
            } else {
                System.out.println("\n Passwort ungültig:");
                for (String error : errors) {
                    System.out.println("  - " + error);
                }
                System.out.println("\n Bitte erneut versuchen:\n");
            }
        }
    }
}
