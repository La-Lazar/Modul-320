import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
            Game game = new Game();
            game.start();
        } catch (IOException e) {
            System.err.println("Fehler beim Spiel: " + e.getMessage());
        }
    }
}