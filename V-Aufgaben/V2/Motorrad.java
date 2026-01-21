public class Motorrad extends Fahrzeug {
    private boolean hatSeitenwagen;
    private int hubraum;

    public Motorrad(String marke, String kundennummer, boolean istRepariert, boolean hatSeitenwagen, int hubraum) {
        super(marke, kundennummer, istRepariert);
        this.hatSeitenwagen = hatSeitenwagen;
        this.hubraum = hubraum;
    }

    public boolean isHatSeitenwagen() {
        return hatSeitenwagen;
    }

    public void setHatSeitenwagen(boolean hatSeitenwagen) {
        this.hatSeitenwagen = hatSeitenwagen;
    }

    public int getHubraum() {
        return hubraum;
    }

    public void setHubraum(int hubraum) {
        this.hubraum = hubraum;
    }

    @Override
    public void print() {
        System.out.println("=== MOTORRAD ===");
        System.out.println("Marke: " + marke);
        System.out.println("Kundennummer: " + kundennummer);
        System.out.println("Ist repariert: " + (istRepariert ? "Ja" : "Nein"));
        System.out.println("Hat Seitenwagen: " + (hatSeitenwagen ? "Ja" : "Nein"));
        System.out.println("Hubraum: " + hubraum + " ccm");
        System.out.println();
    }
}
