package Behavioral.ChainOfResponsibility.webServer;

public class Authenticator {
    public boolean authenticate(HttpRequest request) {
        var isValid = (request.getUsername() == "admin" && request.getPassword() == "1234");
        System.out.println("Authenticate");
        return isValid;
    }
}
