package Structural.Facade.NotificationServer;

public class Message {
    private String content;

    public Message(String content) {
        this.content = content;
        System.out.println(this.content);
    }

    @Override
    public String toString() {
        return content;
    }
}
