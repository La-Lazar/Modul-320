import java.util.Random;

public class GameBoard {
    private int width, height;
    private char[][] board;
    private int playerX, playerY;
    private int score;
    private Random random;

    public GameBoard(int width, int height) {
        this.width = width;
        this.height = height;
        this.board = new char[height][width];
        this.random = new Random();
        this.score = 0;
        initializeBoard();
        placePlayer();
        placeItems();
    }

    private void initializeBoard() {
        for (int y = 0; y < height; y++) {
            for (int x = 0; x < width; x++) {
                board[y][x] = '.'; 
            }
        }
    }

    private void placePlayer() {
        playerX = width / 2;
        playerY = height / 2;
        board[playerY][playerX] = '@'; // Spieler
    }

    private void placeItems() {
        for (int i = 0; i < 5; i++) { // 5 Items platzieren
            int x, y;
            do {
                x = random.nextInt(width);
                y = random.nextInt(height);
            } while (board[y][x] != '.');
            board[y][x] = '0'; // Item
        }
    }

    public void movePlayer(int dx, int dy) throws InvalidMoveException {
        int newX = playerX + dx;
        int newY = playerY + dy;

        if (newX >= 0 && newX < width && newY >= 0 && newY < height) {
            // Altes Feld leeren
            board[playerY][playerX] = '.';

            // Wenn Item, aufheben
            if (board[newY][newX] == '0') {
                score++;
                // Neues Item platzieren
                placeItem();
            }

            // Neue Position setzen
            playerX = newX;
            playerY = newY;
            board[playerY][playerX] = '@';
        } else {
            throw new InvalidMoveException("Bewegung außerhalb des Spielfelds: (" + newX + ", " + newY + ")");
        }
    }

    private void placeItem() {
        int x, y;
        do {
            x = random.nextInt(width);
            y = random.nextInt(height);
        } while (board[y][x] != '.');
        board[y][x] = '0';
    }

    public char[][] getBoard() {
        return board;
    }

    public int getScore() {
        return score;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }
}