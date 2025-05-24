package Structural.Facade.NotificationServer;

public class NotificationServer {
     // connect() -> connection -> to disconnect
     // authenticate(appID, key) -> AuthToken
     // send(authToken, message, target)
     // conn.disconnect

     public Connection connect(String ipAddress) {
          return new Connection(ipAddress);
     }

     public AuthToken authenticate(String appID, String key) {
          return new AuthToken(appID, key);
     }

     public void send(AuthToken authToken, Message message, String target) {
          System.out.println("sending " + message + " to " + target);
     }
}
