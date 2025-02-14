package Behavioral.ChainOfResponsibility.webServer;

public abstract class Handler {
    private Handler next;

    public Handler(Handler next) {
        this.next = next;
    }

    // template Method Pattern
    public void handle(HttpRequest request) {
        if (doHandle(request))
            return;

        if (next != null)
            next.handle(request);
    }

    protected abstract boolean doHandle(HttpRequest request);
}
