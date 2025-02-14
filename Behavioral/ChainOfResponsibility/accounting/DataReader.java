package Behavioral.ChainOfResponsibility.accounting;

public abstract class DataReader {
    private DataReader next;

    public DataReader(DataReader next) {
        this.next = next;
    }

    public void read(String filename) {
        if (filename.endsWith(hasExtension())) {
            this.doRead(filename);
            return;
        }

        if (next != null)
            next.read(filename);

    }

    protected abstract String hasExtension();

    protected abstract void doRead(String filename);

}
