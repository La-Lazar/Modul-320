public class Game {
    private GameBoard board;

    public Game() {
        board = new GameBoard(10, 10);
    }

    public GameBoard getBoard() {
        return board;
    }
}
