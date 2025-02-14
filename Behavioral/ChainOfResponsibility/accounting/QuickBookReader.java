package Behavioral.ChainOfResponsibility.accounting;

public class QuickBookReader extends DataReader {

    public QuickBookReader(DataReader next) {
        super(next);
    }

    @Override
    protected String hasExtension() {
        return ".qbw";
    }

    @Override
    protected void doRead(String filename) {
        System.out.println("Reading data from a QuickBooks file.");
    }

}
