import java.util.Scanner;

/**
 * Menu-Klasse mit einfacher Benutzeroberfläche für die Garage-App
 */
public class Menu {
    private Garage garage;
    private Scanner scanner;

    public Menu() {
        this.garage = new Garage();
        this.scanner = new Scanner(System.in);
    }

    /**
     * Initialisiert die Garage mit Test-Daten
     */
    public void initializeData() {
        garage.addFahrzeug(new Auto("Toyota", "KD001", true, 4, 450));
        garage.addFahrzeug(new Auto("BMW", "KD002", false, 2, 380));
        garage.addFahrzeug(new Motorrad("Harley-Davidson", "KD003", true, false, 1200));
        garage.addFahrzeug(new Motorrad("Kawasaki", "KD004", false, true, 650));
        garage.addFahrzeug(new Lastwagen("Volvo", "KD005", true, 15000, 3));
        garage.addFahrzeug(new Lastwagen("MAN", "KD006", false, 20000, 4));
    }

    /**
     * Zeigt das Hauptmenü an
     */
    public void showMenu() {
        boolean running = true;
        while (running) {
            System.out.println("\n========== GARAGE VERWALTUNGS SYSTEM ==========");
            System.out.println("1. Alle Fahrzeuge anzeigen");
            System.out.println("2. Nach Kundennummer suchen");
            System.out.println("3. Nach Marke suchen");
            System.out.println("4. Reparierte Fahrzeuge anzeigen");
            System.out.println("5. Nicht reparierte Fahrzeuge anzeigen");
            System.out.println("6. Fahrzeug als repariert markieren");
            System.out.println("0. Beenden");
            System.out.print("Wählen Sie eine Option: ");

            try {
                int choice = scanner.nextInt();
                scanner.nextLine(); // Puffer leeren

                switch (choice) {
                    case 1:
                        garage.printAlleFahrzeuge();
                        break;
                    case 2:
                        sucheNachKundennummer();
                        break;
                    case 3:
                        sucheNachMarke();
                        break;
                    case 4:
                        garage.printReparierteFahrzeuge();
                        break;
                    case 5:
                        garage.printNichtReparierteFahrzeuge();
                        break;
                    case 6:
                        markierAlsRepariert();
                        break;
                    case 0:
                        System.out.println("Auf Wiedersehen!");
                        running = false;
                        break;
                    default:
                        System.out.println("Ungültige Option. Bitte versuchen Sie es erneut.");
                }
            } catch (Exception e) {
                System.out.println("Fehler bei der Eingabe. Bitte versuchen Sie es erneut.");
                scanner.nextLine(); // Puffer leeren
            }
        }
        scanner.close();
    }

    /**
     * Hilfsmethode: Nach Kundennummer suchen
     */
    private void sucheNachKundennummer() {
        System.out.print("Geben Sie die Kundennummer ein: ");
        String kundennummer = scanner.nextLine();
        Fahrzeug fahrzeug = garage.sucheNachKundennummer(kundennummer);
        if (fahrzeug != null) {
            System.out.println("========== SUCHERGEBNIS ==========");
            fahrzeug.print();
        } else {
            System.out.println("Fahrzeug mit Kundennummer " + kundennummer + " nicht gefunden.");
        }
        System.out.println();
    }

    /**
     * Hilfsmethode: Nach Marke suchen
     */
    private void sucheNachMarke() {
        System.out.print("Geben Sie die Marke ein: ");
        String marke = scanner.nextLine();
        garage.sucheNachMarke(marke);
    }

    /**
     * Hilfsmethode: Fahrzeug als repariert markieren
     */
    private void markierAlsRepariert() {
        System.out.print("Geben Sie die Kundennummer des Fahrzeugs ein: ");
        String kundennummer = scanner.nextLine();
        garage.markierAlsRepariert(kundennummer);
    }
}
