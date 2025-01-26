package Behavioral.Iterator.BrowserHistory;

public class ArrayIterator implements Iterator {
    private BrowserHistory history;
    private int index;

    public ArrayIterator(BrowserHistory history) {
        this.history = history;
    }

    @Override
    public boolean hasNext() {
        return (index < history.getCount());
    }

    @Override
    public String current() {
        return history.getUrls()[index];
    }

    @Override
    public void next() {
        index++;
    }

}
