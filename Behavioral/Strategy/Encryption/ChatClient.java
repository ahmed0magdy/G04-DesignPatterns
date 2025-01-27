package Behavioral.Strategy.Encryption;

public class ChatClient {

    public void send(String message, EncryptionAlgorithm encryptionAlgorithm) {
        encryptionAlgorithm.apply(message);

        System.out.println("Sending the encrypted message...");
    }
}
