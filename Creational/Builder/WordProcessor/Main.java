package Creational.Builder.WordProcessor;

public class Main {
    public static void main(String[] args) {
        try {
            Demo.show();
        } catch (java.io.IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
