package Structural.Proxy.Ebook;

import java.util.HashMap;
import java.util.Map;

public class Library {
    private Map<String, Ebook> ebooks = new HashMap<>();

    public void add(Ebook ebook) {
        ebooks.put(ebook.getFileName(), ebook);
    }

    public void openEbook(String fileName) {
        if (!ebooks.containsKey(fileName))
            throw new IllegalArgumentException("Ebook not found: " + fileName);
        ebooks.get(fileName).show();
    }
}
