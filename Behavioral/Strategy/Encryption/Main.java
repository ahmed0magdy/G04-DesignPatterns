package Behavioral.Strategy.Encryption;

public class Main {
    public static void main(String[] args) {
        var client = new ChatClient();
        client.send("can you love me again", new AES());
    }
}
