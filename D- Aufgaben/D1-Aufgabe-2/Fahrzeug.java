public class Fahrzeug {
    private String FahrzeugName;
    private Integer Reparaturkosten;
    private boolean IstRepariert;

    public Fahrzeug(String fahrzeugName, Integer reparaturkosten, boolean istRepariert) {
        FahrzeugName = fahrzeugName;
        Reparaturkosten = reparaturkosten;
        IstRepariert = istRepariert;
    }

    public void SetIstRepariert(Integer reparaturkosten)
    {
        IstRepariert = reparaturkosten <= 0;
    }

    public void SetReparaturkosten(Integer reparaturkosten)
    {
        Reparaturkosten += reparaturkosten;
    }

    public void SetFahrzeugname(String fahrzeugname)
    {
        FahrzeugName = fahrzeugname;
    }

    public String getFahrzeugName() {
        return FahrzeugName;
    }

    public Integer getReparaturkosten() {
        return Reparaturkosten;
    }

    public boolean isIstRepariert() {
        return IstRepariert;
    }
}
