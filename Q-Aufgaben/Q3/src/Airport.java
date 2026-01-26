public class Airport {

    private String name;

    public Airport(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Airport Name: " + name;
    }
}
