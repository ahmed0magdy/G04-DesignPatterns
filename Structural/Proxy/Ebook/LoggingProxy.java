package Structural.Proxy.Ebook;

public class LoggingProxy implements Ebook {
    private String fileName;
    private RealEbook ebook;

    public LoggingProxy(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void show() {
        if (ebook == null)
            ebook = new RealEbook(fileName);
        System.out.println("Logging ebook " + fileName);
        ebook.show();
    }

    @Override
    public String getFileName() {
        return fileName;
    }

}
