package Creational.Singleton.ConfigManager;

public class Main {
    public static void main(String[] args) {
        var settings = ConfigManager.getInstance();
        settings.set("name", "mego");

        var other = ConfigManager.getInstance();
        System.out.println(other.get("name"));
    }
}
