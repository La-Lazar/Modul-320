public abstract class Fahrzeug {
    protected String marke;
    protected String kundennummer;
    protected boolean istRepariert;

    public Fahrzeug(String marke, String kundennummer, boolean istRepariert) {
        this.marke = marke;
        this.kundennummer = kundennummer;
        this.istRepariert = istRepariert;
    }

    public String getMarke() {
        return marke;
    }

    public void setMarke(String marke) {
        this.marke = marke;
    }

    public String getKundennummer() {
        return kundennummer;
    }

    public void setKundennummer(String kundennummer) {
        this.kundennummer = kundennummer;
    }

    public boolean isIstRepariert() {
        return istRepariert;
    }

    public void setIstRepariert(boolean istRepariert) {
        this.istRepariert = istRepariert;
    }

    public abstract void print();
}
