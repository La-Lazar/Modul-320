/**
 * Starter-Klasse: Einstiegspunkt für die Garage-App
 */
public class Starter {
    public static void main(String[] args) {
        Menu menu = new Menu();
        menu.initializeData();
        menu.showMenu();
    }
}
