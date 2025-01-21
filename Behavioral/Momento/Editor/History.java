package Behavioral.Momento.Editor;

import java.util.ArrayList;
import java.util.List;

public class History {
    private List<EditorState> history = new ArrayList<>();

    public void push(EditorState state) {
        history.add(state);
    }

    public EditorState pop() {
        var lastIndex = history.size() - 1;
        var lastState = history.get(lastIndex);
        history.remove(lastIndex);
        return lastState;
    }
}
