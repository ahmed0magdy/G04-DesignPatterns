package Structural.Decorator.CloudService;

public class Main {
    public static void main(String[] args) {


        storeCreditCard(new EncryptedCloudStream(new CompressedCloudStream( new CloudStream())));
        

    }


    public static void storeCreditCard(Stream stream){
        stream.write("2435-54352-6632-64325");
    }
}
 