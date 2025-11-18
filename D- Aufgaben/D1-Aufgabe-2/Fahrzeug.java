public class Fahrzeug {
    public String FahrzeugName;
    public Integer Reparaturkosten;
    public boolean IstRepariert;

    public Fahrzeug(String fahrzeugName, Integer reparaturkosten, boolean istRepariert) {
        FahrzeugName = fahrzeugName;
        Reparaturkosten = reparaturkosten;
        IstRepariert = istRepariert;
    }

    public void SetIstRepariert()
    {
        IstRepariert = !IstRepariert;
    }

    public void SetReparaturkosten(Integer reparaturkosten)
    {
        Reparaturkosten += reparaturkosten;
    }
    public void SetFahrzeugname(String fahrzeugname)
    {
        FahrzeugName = fahrzeugname;
    }
}