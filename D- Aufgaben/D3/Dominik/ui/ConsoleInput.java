package ui;

import java.util.Scanner;

public class ConsoleInput {

    public String readPassword() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bitte Passwort eingeben: ");
        return scanner.nextLine();
    }
}
