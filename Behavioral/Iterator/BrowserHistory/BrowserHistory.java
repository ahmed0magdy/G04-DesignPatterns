package Behavioral.Iterator.BrowserHistory;

public class BrowserHistory {
    private String[] urls = new String[10];
    private int count;

    public void push(String url) {
        urls[count++] = url;
    }

    public String pop() {
        return urls[--count];
    }

    public String[] getUrls() {
        return urls;
    }

    public int getCount() {
        return count;
    }

    public Iterator createIterator() {
        return new ArrayIterator(this);
    }

}
