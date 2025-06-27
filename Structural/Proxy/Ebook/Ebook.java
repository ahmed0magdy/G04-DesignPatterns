package Structural.Proxy.Ebook;

public class Ebook {
    private String fileName;

    public Ebook(String fileName) {
        this.fileName = fileName;
        load();
    }

    private void load() {
        System.out.println(fileName + " Ebook loaded");
    }

    public void show() {
        System.out.println("showing ebook " + fileName);
    }

    public String getFileName() {
        return fileName;
    }
}
