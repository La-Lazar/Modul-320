public class Raum {
    public String Name;
    public Integer Temperatur;
    public boolean IstAngeschaltet;

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
}