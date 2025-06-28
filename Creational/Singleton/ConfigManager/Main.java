package Creational.Singleton.ConfigManager;

public class Main {
    public static void main(String[] args) {
        var settings = new ConfigManager();
        settings.set("name", "mego");

        var other = new ConfigManager();
        System.out.println(other.get("name"));
    }
}
