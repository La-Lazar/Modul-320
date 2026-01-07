import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Tier hund = new Hund("Bello", 5);
        Tier katze = new Katze("Mimi", 3);
        
        List<Tier> liste = new ArrayList<>();
        liste.add(hund);
        liste.add(katze);

        Collections.sort(liste);

        Scanner scanner = new Scanner(System.in);
        boolean running = true;
        
        while (running) {
            System.out.println("\n=== Tier Menü ===");
            System.out.println("1. Hund Laut machen");
            System.out.println("2. Katze Laut machen");
            System.out.println("3. Hund Informationen");
            System.out.println("4. Katze Informationen");
            System.out.println("5. Alle Tiere vorstellen");
            System.out.println("6. Sortierte Tierliste nach Alter");
            System.out.println("7. Beenden");
            System.out.print("Wähle eine Option: ");
            
            int choice = scanner.nextInt();
            scanner.nextLine();
            
            clearConsole();
            
            switch (choice) {
                case 1 -> {
                    System.out.println("=== Hund Laut machen ===");
                    hund.geraeuschMachen();
                }
                case 2 -> {
                    System.out.println("=== Katze Laut machen ===");
                    katze.geraeuschMachen();
                }
                case 3 -> {
                    System.out.println("=== Hund Informationen ===");
                    System.out.println("Hund: " + hund.getName() + ", Alter: " + hund.getAlter() + " Jahre");
                }
                case 4 -> {
                    System.out.println("=== Katze Informationen ===");
                    System.out.println("Katze: " + katze.getName() + ", Alter: " + katze.getAlter() + " Jahre");
                }
                case 5 -> {
                    System.out.println("=== Alle Tiere vorstellen ===");
                    hund.geraeuschMachen();
                    katze.geraeuschMachen();
                    System.out.println("Hund: " + hund.getName() + ", Alter: " + hund.getAlter() + " Jahre");
                    System.out.println("Katze: " + katze.getName() + ", Alter: " + katze.getAlter() + " Jahre");
                }
                case 6 -> {
                    System.out.println("=== Sortierte Tierliste nach Alter ===");
                    for (Tier tier : liste) {
                        System.out.println(tier);
                    }
                }
                case 7 -> {
                    running = false;
                    System.out.println("Auf Wiedersehen!");
                }
                default -> {
                    System.out.println("Ungültige Option. Versuche es erneut.");
                    scanner.nextLine();
                    continue;
                }
            }
            
            System.out.print("\nDrücke Enter um fortzufahren...");
            scanner.nextLine();
            clearConsole();
        }
        
        scanner.close();
    }
    
    private static void clearConsole() {
        try {
            if (System.getProperty("os.name").contains("Windows")) {
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            } else {
                new ProcessBuilder("clear").inheritIO().start().waitFor();
            }
        } catch (Exception e) {
            for (int i = 0; i < 50; i++) {
                System.out.println();
            }
        }
    }
}
