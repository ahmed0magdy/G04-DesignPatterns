package Behavioral.Strategy.Encryption;

public class DES implements EncryptionAlgorithm {

    @Override
    public void apply(String message) {
        System.out.println("Encrypting message using DES");
    }

}
