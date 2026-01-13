/**
 * Subklasse Auto
 * Zusätzliche Attribute: Anzahl der Türen, Trunk-Volumen (in Litern)
 */
public class Auto extends Fahrzeug {
    private int anzahlTueren;
    private int trunkVolumen;

    public Auto(String marke, String kundennummer, boolean istRepariert, int anzahlTueren, int trunkVolumen) {
        super(marke, kundennummer, istRepariert);
        this.anzahlTueren = anzahlTueren;
        this.trunkVolumen = trunkVolumen;
    }

    public int getAnzahlTueren() {
        return anzahlTueren;
    }

    public void setAnzahlTueren(int anzahlTueren) {
        this.anzahlTueren = anzahlTueren;
    }

    public int getTrunkVolumen() {
        return trunkVolumen;
    }

    public void setTrunkVolumen(int trunkVolumen) {
        this.trunkVolumen = trunkVolumen;
    }

    @Override
    public void print() {
        System.out.println("=== AUTO ===");
        System.out.println("Marke: " + marke);
        System.out.println("Kundennummer: " + kundennummer);
        System.out.println("Ist repariert: " + (istRepariert ? "Ja" : "Nein"));
        System.out.println("Anzahl Türen: " + anzahlTueren);
        System.out.println("Trunk-Volumen: " + trunkVolumen + " Liter");
        System.out.println();
    }
}
