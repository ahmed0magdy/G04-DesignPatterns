package Behavioral.Mediator.SignUpDialogBox;

import java.util.ArrayList;
import java.util.List;

public abstract class UIControl {
    private List<Observer> observers = new ArrayList<>();

    protected void attach(Observer observer) {
        observers.add(observer);
    }

    protected void removeObservers(Observer observer) {
        observers.remove(observer);
    }

    protected void notifyObservers() {
        for (var observer : observers)
            observer.update();
    }
}
