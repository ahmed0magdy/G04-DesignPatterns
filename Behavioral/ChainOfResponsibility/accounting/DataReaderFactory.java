package Behavioral.ChainOfResponsibility.accounting;

public class DataReaderFactory {
    public static DataReader getDataReaderChain() {
        var excel = new ExcelReader(null);
        var numbers = new NumbersReader(excel);
        var qbw = new QuickBookReader(numbers);

        return qbw;
    }
}
