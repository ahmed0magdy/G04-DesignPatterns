package Structural.Facade.NotificationServer;

public class Main {
    public static void main(String[] args) {
        var service = new NotificationService();
        service.send("Hello Me Again", "target");
    }
}
