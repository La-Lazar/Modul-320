import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
            GameController controller = new GameController();
            controller.start();
        } catch (IOException e) {
            System.err.println("Fehler beim Spiel: " + e.getMessage());
        } catch (InvalidMoveException e) {
            System.err.println("Ungültige Bewegung: " + e.getMessage());
        }
    }
}