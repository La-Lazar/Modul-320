import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class AirportRepository {

    private Map<String, Airport> airportMap = new HashMap<>();

    public void loadFromFile(String filePath) {

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {

            String line;

            while ((line = reader.readLine()) != null) {

                Airport airport = parseLine(line);

                if (airport != null) {

                    String iata = extractIata(line);

                    addAirport(iata, airport);

                }

            }

            System.out.println("CSV erfolgreich geladen");

        } catch (IOException e) {
            System.out.println("Fehler beim Einlesen der Datei:");
            e.printStackTrace();
        }
    }

    private Airport parseLine(String line) {

        String[] parts = line.split(",");

        // Sicherheitscheck
        if (parts.length < 2) {
            return null;
        }

        String name = parts[1].trim();

        return new Airport(name);

    }

    private String extractIata(String line) {

        String[] parts = line.split(",");

        if (parts.length < 1) {
            return null;
        }

        return parts[0].trim();

    }

    private void addAirport(String iata, Airport airport) {

        // Regel aus Auftrag: neuer Wert ersetzt alten
        airportMap.put(iata, airport);
    }

    public Airport findByIata(String iata) {
        return airportMap.get(iata);
    }
}
