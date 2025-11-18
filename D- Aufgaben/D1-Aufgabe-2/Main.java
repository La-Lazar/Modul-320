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
            fahrzeuge.get(0).SetIstRepariert();
            fahrzeuge.get(0).SetReparaturkosten(234);

            fahrzeuge.get(1).SetFahrzeugname("Mercedes");
            fahrzeuge.get(1).SetIstRepariert();
            fahrzeuge.get(1).SetReparaturkosten(2243534);

            fahrzeuge.get(2).SetFahrzeugname("Audi");
            fahrzeuge.get(2).SetReparaturkosten(35623);

            PrintFahrzeuge(fahrzeuge);

            
        }
            public static void PrintFahrzeuge(List<Fahrzeug> fahrzeuge){
        for (Fahrzeug fahrzeug : fahrzeuge) {
            System.out.println(fahrzeug.FahrzeugName + " " + fahrzeug.Reparaturkosten + " " + fahrzeug.IstRepariert);
        }
        System.out.println("----------------------");
    }
}
