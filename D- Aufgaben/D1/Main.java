import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Raum raum1 = new Raum("Küche", 22, false);
        Raum raum2 = new Raum("Wohnzimmer", 20, true);
        Raum raum3 = new Raum("Schlafzimmer", 18, false);
        Raum raum4 = new Raum("Bad", 24, false);

        List<Raum> raeume = new ArrayList<>();

        raeume.add(raum1);
        raeume.add(raum2);
        raeume.add(raum3);
        raeume.add(raum4);

        PrintRaume(raeume);

        raeume.get(2).SchalteHeizungAnAb();
        raeume.get(1).AendereTemperatur(2);
        raeume.get(3).SchalteHeizungAnAb();
        raeume.get(3).AendereTemperatur(-5);

        PrintRaume(raeume);
    }

    public static void PrintRaume(List<Raum> raeume){
        for (Raum raum : raeume) {
            System.out.println(raum.Name + " " + raum.IstAngeschaltet + " " + raum.Temperatur);
        }

        System.out.println("----------------------");
    }
}
