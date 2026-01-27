import java.io.IOException;

public class GameController {
    private Game game;
    private GameRenderer renderer;
    private InputHandler inputHandler;

    public GameController() {
        game = new Game();
        renderer = new GameRenderer();
        inputHandler = new InputHandler();
    }

    public void start() throws IOException, InvalidMoveException {
        System.out.println("Willkommen zum Konsolen-Spiel!");
        System.out.println("Bewege dich mit den Pfeiltasten. Sammle '0' auf. Drücke 'q' zum Beenden.");
        System.in.read();

        while (true) {
            System.out.print("\033[2J\033[H");
            System.out.print(renderer.renderToString(game.getBoard()));

            int input = inputHandler.getNextInput();
            if (input == 'q' || input == 'Q') {
                break;
            }
            handleInput(input);
        }

        System.out.println("Spiel beendet. Finale Punkte: " + game.getBoard().getScore());
    }

    private void handleInput(int input) throws IOException, InvalidMoveException {
        int dx = 0, dy = 0;

        // WASD für Bewegung
        switch (input) {
            case 'w': dy = -1; break;
            case 's': dy =  1; break;
            case 'a': dx = -1; break;
            case 'd': dx =  1; break;
        }

        if (dx != 0 || dy != 0) {
            game.getBoard().movePlayer(dx, dy);
        }
    }
}