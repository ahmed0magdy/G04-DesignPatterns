package Structural.Proxy.Ebook;

public class Main {
    public static void main(String[] args) {
        var Library = new Library();
        String[] ebooksNames = { "a", "b", "c" };
        for (var fileName : ebooksNames)
            Library.add(new Ebook(fileName));

        // user opens an ebook
        Library.openEbook("a");
    }
}
