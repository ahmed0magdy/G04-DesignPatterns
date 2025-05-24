package Structural.Facade.NotificationServer;

public class Connection {
    private String ipAddress;

    public Connection(String ipAddress) {
        this.ipAddress = ipAddress;
        System.out.println("connecting to " + ipAddress);
    }

    public void disconnect() {
        System.out.println("disconnecting...");
    }
}
