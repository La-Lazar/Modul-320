import java.util.ArrayList;
import java.util.List;

/**
 * Garage-Klasse verwaltet eine Liste von Fahrzeugen
 */
public class Garage {
    private List<Fahrzeug> fahrzeuge;

    public Garage() {
        this.fahrzeuge = new ArrayList<>();
    }

    /**
     * Fahrzeug zur Garage hinzufügen
     */
    public void addFahrzeug(Fahrzeug fahrzeug) {
        fahrzeuge.add(fahrzeug);
    }

    /**
     * Alle Fahrzeuge anzeigen
     */
    public void printAlleFahrzeuge() {
        if (fahrzeuge.isEmpty()) {
            System.out.println("Die Garage ist leer.");
            return;
        }
        System.out.println("========== ALLE FAHRZEUGE ==========");
        for (Fahrzeug fahrzeug : fahrzeuge) {
            fahrzeug.print();
        }
    }

    /**
     * Nach Kundennummer suchen
     */
    public Fahrzeug sucheNachKundennummer(String kundennummer) {
        for (Fahrzeug fahrzeug : fahrzeuge) {
            if (fahrzeug.getKundennummer().equals(kundennummer)) {
                return fahrzeug;
            }
        }
        return null;
    }

    /**
     * Nach Marke suchen
     */
    public void sucheNachMarke(String marke) {
        System.out.println("========== FAHRZEUGE VON " + marke.toUpperCase() + " ==========");
        boolean found = false;
        for (Fahrzeug fahrzeug : fahrzeuge) {
            if (fahrzeug.getMarke().equalsIgnoreCase(marke)) {
                fahrzeug.print();
                found = true;
            }
        }
        if (!found) {
            System.out.println("Keine Fahrzeuge von " + marke + " gefunden.");
        }
        System.out.println();
    }

    /**
     * Alle reparierten Fahrzeuge anzeigen
     */
    public void printReparierteFahrzeuge() {
        System.out.println("========== REPARIERTE FAHRZEUGE ==========");
        boolean found = false;
        for (Fahrzeug fahrzeug : fahrzeuge) {
            if (fahrzeug.isIstRepariert()) {
                fahrzeug.print();
                found = true;
            }
        }
        if (!found) {
            System.out.println("Keine reparierten Fahrzeuge in der Garage.");
        }
        System.out.println();
    }

    /**
     * Alle nicht reparierten Fahrzeuge anzeigen
     */
    public void printNichtReparierteFahrzeuge() {
        System.out.println("========== NICHT REPARIERTE FAHRZEUGE ==========");
        boolean found = false;
        for (Fahrzeug fahrzeug : fahrzeuge) {
            if (!fahrzeug.isIstRepariert()) {
                fahrzeug.print();
                found = true;
            }
        }
        if (!found) {
            System.out.println("Alle Fahrzeuge sind repariert!");
        }
        System.out.println();
    }

    /**
     * Fahrzeug basierend auf Kundennummer als repariert markieren
     */
    public void markierAlsRepariert(String kundennummer) {
        Fahrzeug fahrzeug = sucheNachKundennummer(kundennummer);
        if (fahrzeug != null) {
            fahrzeug.setIstRepariert(true);
            System.out.println("Fahrzeug mit Kundennummer " + kundennummer + " wurde als repariert markiert.");
        } else {
            System.out.println("Fahrzeug mit Kundennummer " + kundennummer + " nicht gefunden.");
        }
        System.out.println();
    }
}
