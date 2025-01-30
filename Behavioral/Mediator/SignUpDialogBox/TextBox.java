package Behavioral.Mediator.SignUpDialogBox;

public class TextBox extends UIControl {
    private String content;

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
        notifyObservers();
    }

    public boolean isEmpty() {
        return content == null || content.isEmpty();
    }
}
