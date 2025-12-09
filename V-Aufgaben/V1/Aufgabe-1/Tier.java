public abstract class Tier {
    private final String name;
    private final int alter;

    public Tier(String name, int alter) {
        this.name = name;
        this.alter = alter;
    }

    public String getName() {
        return name;
    }

    public int getAlter() {
        return alter;
    }

    public abstract void geraeuschMachen();
}
