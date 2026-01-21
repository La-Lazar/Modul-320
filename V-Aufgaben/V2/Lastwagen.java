public class Lastwagen extends Fahrzeug {
    private int maxZuladung;
    private int anzahlAchsen;

    public Lastwagen(String marke, String kundennummer, boolean istRepariert, int maxZuladung, int anzahlAchsen) {
        super(marke, kundennummer, istRepariert);
        this.maxZuladung = maxZuladung;
        this.anzahlAchsen = anzahlAchsen;
    }

    public int getMaxZuladung() {
        return maxZuladung;
    }

    public void setMaxZuladung(int maxZuladung) {
        this.maxZuladung = maxZuladung;
    }

    public int getAnzahlAchsen() {
        return anzahlAchsen;
    }

    public void setAnzahlAchsen(int anzahlAchsen) {
        this.anzahlAchsen = anzahlAchsen;
    }

    @Override
    public void print() {
        System.out.println("=== LASTWAGEN ===");
        System.out.println("Marke: " + marke);
        System.out.println("Kundennummer: " + kundennummer);
        System.out.println("Ist repariert: " + (istRepariert ? "Ja" : "Nein"));
        System.out.println("Max. Zuladung: " + maxZuladung + " kg");
        System.out.println("Anzahl Achsen: " + anzahlAchsen);
        System.out.println();
    }
}
