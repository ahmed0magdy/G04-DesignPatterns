package Behavioral.Mediator.usingObserver;

import java.util.ArrayList;
import java.util.List;

public abstract class UIControl {
    private List<EventHandler> eventHandlers = new ArrayList<>();

    protected void addEventHandler(EventHandler observer) {
        eventHandlers.add(observer);
    }

    protected void remove(EventHandler observer) {
        eventHandlers.remove(observer);
    }

    protected void notifyEventHandlers() {
        for (var eventHandler : eventHandlers)
            eventHandler.handle();
    }

}
