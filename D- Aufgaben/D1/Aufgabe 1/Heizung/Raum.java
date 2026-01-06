public class Raum {
    private String Name;
    private Integer Temperatur;
    private boolean IstAngeschaltet;

    public Raum(String name, Integer temperatur, boolean istAngeschaltet) {
        Name = name;
        Temperatur = temperatur;
        IstAngeschaltet = istAngeschaltet;
    }

    public void SchalteHeizungAnAb()
    {
        IstAngeschaltet = !IstAngeschaltet;
    }

    public void AendereTemperatur(Integer temperatur)
    {
        Temperatur += temperatur;
    }

    public String getName() {
        return Name;
    }

    public Integer getTemperatur() {
        return Temperatur;
    }

    public boolean getIstAngeschaltet() {
        return IstAngeschaltet;
    }
}