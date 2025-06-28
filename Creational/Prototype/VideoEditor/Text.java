package Creational.Prototype.VideoEditor;

public class Text implements Component {
    private String content;

    public Text(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }

    @Override
    public Component clone() {
        Text copiedText = new Text(content);
        System.out.println("copying " + content);
        return copiedText;
    }
}
