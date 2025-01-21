package Behavioral.Momento.Editor;

public class Editor {
    private String content;

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public EditorState createState() {
        return new EditorState(content);
    }

    public void undo(EditorState state) {
        content = state.getContent();
    }
}
