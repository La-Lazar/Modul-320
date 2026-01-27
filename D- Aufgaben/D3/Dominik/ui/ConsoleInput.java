package ui;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import logic.*;

public class ConsoleInput {
    private Scanner scanner = new Scanner(System.in);

    public List<PasswordRule> selectRules() {
        List<PasswordRule> rules = new ArrayList<>();

        System.out.println("\n=== Passwort-Validator Konfiguration ===\n");

        if (askYesNo("Mindestlänge prüfen? (empfohlen: 8 Zeichen)")) {
            int length = askNumber("Mindestlänge eingeben: ");
            rules.add(new MinLengthRule(length));
        }

        if (askYesNo("Mindestens eine Ziffer erforderlich?")) {
            rules.add(new NumberRule());
        }

        if (askYesNo("Mindestens ein Großbuchstabe erforderlich?")) {
            rules.add(new UppercaseRule());
        }

        if (rules.isEmpty()) {
            System.out.println("Keine Regeln ausgewählt. Verwende Standard-Regeln.\n");
            return PasswordValidator.defaultRules().getRules();
        }

        return rules;
    }

    public String readPassword() {
        System.out.print("\nBitte Passwort eingeben: ");
        return scanner.nextLine();
    }

    private boolean askYesNo(String question) {
        System.out.print(question + " (j/n): ");
        String answer = scanner.nextLine().trim().toLowerCase();
        return answer.equals("j") || answer.equals("yes");
    }

    private int askNumber(String question) {
        try {
            System.out.print(question);
            return Integer.parseInt(scanner.nextLine().trim());
        } catch (NumberFormatException e) {
            System.out.println("Ungültige Eingabe! Verwende 8.");
            return 8;
        }
    }
}
