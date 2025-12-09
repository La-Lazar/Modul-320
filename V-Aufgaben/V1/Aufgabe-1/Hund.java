public class Hund extends Tier {

    public Hund(String name, int alter) {
        super(name, alter);
    }

    @Override
    public void geraeuschMachen() {
        System.out.println(getName() + " bellt: Wuff!");
    }
}

