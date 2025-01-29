package Behavioral.Observer.DataSource;

import java.util.ArrayList;
import java.util.List;

public class Subject {
    private List<Observer> observers = new ArrayList<>();

    protected void addObserver(Observer observer) {
        observers.add(observer);
    }

    protected void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    protected void notifyObservers() {
        for (var observer : observers)
            observer.update();
    }
}
