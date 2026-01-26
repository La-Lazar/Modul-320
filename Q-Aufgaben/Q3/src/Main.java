import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        AirportRepository repo = new AirportRepository();
        repo.loadFromFile("../airports.csv");

        Scanner scanner = new Scanner(System.in);

        System.out.print("IATA-Code eingeben: ");
        String input = scanner.nextLine().toUpperCase();

        Airport airport = repo.findByIata(input);

        if (airport != null) {
            System.out.println(airport);
        } else {
            System.out.println("Kein Airport gefunden.");
        }
    }
}
