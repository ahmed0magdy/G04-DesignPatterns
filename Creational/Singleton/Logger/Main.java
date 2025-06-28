package Creational.Singleton.Logger;

public class Main {
    public static void main(String[] args) {
        var logger1 = Logger.getInstance("file1");
        var logger2 = Logger.getInstance("file1");
        System.out.println(logger1 == logger2);

        var logger3 = Logger.getInstance("file2");
        System.out.println(logger1 == logger3);
    }
}
