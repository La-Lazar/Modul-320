import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> liste = new ArrayList<>();
        liste.add("Test 1");
        liste.add("Test 2");
        liste.add("Test 4");

        Iterator<String> iterator = liste.iterator();
        while (iterator.hasNext()) {
            String frucht = iterator.next();
            System.out.println(frucht);
        }
    }
}
