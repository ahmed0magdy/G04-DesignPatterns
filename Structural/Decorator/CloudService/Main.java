package Structural.Decorator.CloudService;

public class Main {
    public static void main(String[] args) {
        var cloudStream = new CloudStream();
        cloudStream.write("hey there");

        var encryptedCloudStream = new EncryptedCloudStream();
        encryptedCloudStream.write("hey there");
        

    }
}
 