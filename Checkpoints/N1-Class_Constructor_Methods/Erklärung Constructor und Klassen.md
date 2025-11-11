# Constructor

bei diesem Beispiel benutze ich lombok so muss ich nicht den Setter und Getter schreiben.

```Java
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class House {
    private String familyHouse;
    private int numberOfRooms;
    private String streetName;
    private int streetNumber;
    private double houseValue;
}

// Testbeispiel (nur zur Illustration)
public class TestHouse {
    public static void main(String[] args) {
        House houseSmith = new House();
        houseSmith.setFamilyHouse("Smith");
        houseSmith.setNumberOfRooms(5);
        System.out.println(houseSmith.getFamilyHouse());
        System.out.println(houseSmith.getNumberOfRooms());
    }
}

```
# Klassen

Hier instanziiere ich die Klasse und gebe den Attributen noch Werte

```Java
public class TestHouse {
    public static void main(String[] args) {
        // Objekt erzeugen
        House houseSmith = new House();

        // Attribute setzen (Setter)
        houseSmith.setFamilyHouse("Smith");
        houseSmith.setNumberOfRooms(5);
        houseSmith.setStreetName("Mainstreet");
        houseSmith.setStreetNumber(1291);
        houseSmith.setHouseValue(800000.0);
}

