package Behavioral.Momento.MsDocument;

import java.util.ArrayDeque;
import java.util.Deque;

public class History {
    private Deque<DocumentState> history = new ArrayDeque<>();

    public void push(DocumentState state) {
        history.push(state);
    }

    public DocumentState pop() {
        return history.pop();
    }
}
