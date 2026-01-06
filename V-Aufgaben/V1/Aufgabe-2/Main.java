import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> liste = new ArrayList<>();
        liste.add("Apfel");
        liste.add("Banane");
        liste.add("Kirsche");

        Iterator<String> iterator = liste.iterator();
        while (iterator.hasNext()) {
            String frucht = iterator.next();
            System.out.println(frucht);
        }
    }
}
