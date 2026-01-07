public abstract class Tier implements Comparable<Tier> {

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

    @Override
    public int compareTo(Tier anderesTier) {
        return Integer.compare(this.alter, anderesTier.getAlter());
    }

    @Override
    public String toString() {
        return name + " (" + alter + " Jahre)";
    }

    public abstract void geraeuschMachen();
}
