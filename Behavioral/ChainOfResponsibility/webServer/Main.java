package Behavioral.ChainOfResponsibility.webServer;

public class Main {
    public static void main(String[] args) {
        // authenticator -> logger -> compressor
        var compressor = new Compressor(null);
        var logger = new Logger(compressor);
        var authenticator = new Authenticator(logger);
        var webServer = new WebServer(authenticator);
        var request = new HttpRequest("admin", "1234");
        webServer.handle(request);

    }
}
