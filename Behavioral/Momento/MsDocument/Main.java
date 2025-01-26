package Behavioral.Momento.MsDocument;

public class Main {
    public static void main(String[] args) {
        var document = new Document();
        var history = new History();

        document.setContent("Mego");
        history.push(document.createMemento());
        document.setFontName("font1");
        history.push(document.createMemento());
        document.setFontSize(25);
        System.out.println(document);

        document.restore(history.pop());
        System.out.println(document);

        document.restore(history.pop());
        System.out.println(document);

    }

}
