package Behavioral.ChainOfResponsibility.webServer;

public class WebServer {
    public void handle(HttpRequest request) {
        // Authentication
        var authenticator = new Authenticator();
        authenticator.authenticate(request); // tightly coupled so can create an interface but can't change
        // logging
        // compression
    }
}
