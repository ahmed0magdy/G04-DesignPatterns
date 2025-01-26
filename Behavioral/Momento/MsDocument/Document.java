package Behavioral.Momento.MsDocument;

public class Document {
    private String content;
    private String fontName;
    private int fontSize;

    public DocumentState createMemento() {
        return new DocumentState(content, fontName, fontSize);
    }

    public void restore(DocumentState momento) {
        content = momento.getContent();
        fontName = momento.getFontName();
        fontSize = momento.getFontSize();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getFontName() {
        return fontName;
    }

    public void setFontName(String fontName) {
        this.fontName = fontName;
    }

    public int getFontSize() {
        return fontSize;
    }

    public void setFontSize(int fontSize) {
        this.fontSize = fontSize;
    }

    @Override
    public String toString() {
        return "Document{" +
                "content='" + content + '\'' +
                ", fontName='" + fontName + '\'' +
                ", fontSize=" + fontSize +
                '}';
    }
}
