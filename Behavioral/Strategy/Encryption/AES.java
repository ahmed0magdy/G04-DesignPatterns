package Behavioral.Strategy.Encryption;

public class AES implements EncryptionAlgorithm {

    @Override
    public void apply(String message) {
        System.out.println("Encrypting message using AES");
    }

}
