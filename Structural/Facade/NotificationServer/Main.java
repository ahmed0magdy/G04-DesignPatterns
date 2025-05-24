package Structural.Facade.NotificationServer;

public class Main {
    public static void main(String[] args) {
        var server = new NotificationServer();
        var connection = server.connect("ip");
        var authToken = server.authenticate("appid", "key");
        var message = new Message("Hello Mego");
        server.send(authToken, message, "target");
        connection.disconnect();
    }
}
