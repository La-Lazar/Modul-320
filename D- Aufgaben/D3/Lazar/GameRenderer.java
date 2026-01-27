
public class GameRenderer {

    public String renderToString(GameBoard board) {
        StringBuilder sb = new StringBuilder();

        char[][] grid = board.getBoard();

        // Spielfeld zeichnen
        for (int y = 0; y < board.getHeight(); y++) {
            for (int x = 0; x < board.getWidth(); x++) {
                sb.append(grid[y][x]).append(" ");
            }
            sb.append("\n");
        }

        // Punkte unten
        sb.append("Punkte: ").append(board.getScore()).append("\n");

        // Eingabe-Hinweis 2 Zeilen darunter
        sb.append("\n");
        sb.append("Bewege mit Pfeiltasten, 'q' zum Beenden.\n");

        return sb.toString();
    }
}