package Behavioral.Momento.MsDocument;

public class DocumentState {
    private String content;
    private String fontName;
    private int fontSize;

    public DocumentState(String content, String fontName, int fontSize) {
        this.content = content;
        this.fontName = fontName;
        this.fontSize = fontSize;
    }

    public int getFontSize() {
        return fontSize;
    }

    public String getFontName() {
        return fontName;
    }

    public String getContent() {
        return content;
    }

}
