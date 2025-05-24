package Structural.Facade.NotificationServer;

public class AuthToken {
    private String appId;
    private String key;

    public AuthToken(String appId, String key) {
        this.appId = appId;
        this.key = key;
        System.out.println("authtoken");
    }

}
