public class Main {
    public static void main(String[] args) {
        Tier hund = new Hund("Bello", 5);
        Tier katze = new Katze("Mimi", 3);

        hund.geraeuschMachen();
        katze.geraeuschMachen();
    }
}
