public class Katze extends Tier {

    public Katze(String name, int alter) {
        super(name, alter);
    }

    @Override
    public void geraeuschMachen() {
        System.out.println(getName() + " schnurrt: Miaow!");
    }
}

