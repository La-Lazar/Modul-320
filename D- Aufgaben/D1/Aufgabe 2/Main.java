import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Fahrzeug fahrzeug1 = new Fahrzeug("nichts", 0, false);
        Fahrzeug fahrzeug2 = new Fahrzeug("nichts", 0, false);
        Fahrzeug fahrzeug3 = new Fahrzeug("nichts", 0, false);

        List<Fahrzeug> fahrzeuge = new ArrayList<>();
        fahrzeuge.add(fahrzeug1);
        fahrzeuge.add(fahrzeug2);
        fahrzeuge.add(fahrzeug3);

        PrintFahrzeuge(fahrzeuge);

        fahrzeuge.get(0).SetFahrzeugname("BMW");
        fahrzeuge.get(0).SetReparaturkosten(0);
        fahrzeuge.get(0).SetIstRepariert(fahrzeuge.get(0).getReparaturkosten());

        fahrzeuge.get(1).SetReparaturkosten(2243534);
        fahrzeuge.get(1).SetFahrzeugname("Mercedes");
        fahrzeuge.get(1).SetIstRepariert(fahrzeuge.get(1).getReparaturkosten());

        fahrzeuge.get(2).SetReparaturkosten(35623);
        fahrzeuge.get(2).SetFahrzeugname("Audi");
        fahrzeuge.get(2).SetIstRepariert(fahrzeuge.get(2).getReparaturkosten());

        PrintFahrzeuge(fahrzeuge);
    }

    public static void PrintFahrzeuge(List<Fahrzeug> fahrzeuge){
        for (Fahrzeug fahrzeug : fahrzeuge) {
            System.out.println(
                fahrzeug.getFahrzeugName() + " " +
                fahrzeug.getReparaturkosten() + " " +
                fahrzeug.isIstRepariert()
            );
        }
        System.out.println("----------------------");
    }
}
