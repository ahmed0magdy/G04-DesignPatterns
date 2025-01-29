package Behavioral.Observer.DataSource;

public class Main {
    public static void main(String[] args) {
        var dataSource = new DataSource();
        var chart = new Chart(dataSource);
        var SpreadSheet1 = new SpreadSheet(dataSource);
        var SpreadSheet2 = new SpreadSheet(dataSource);

        dataSource.addObserver(chart);
        dataSource.addObserver(SpreadSheet1);
        dataSource.addObserver(SpreadSheet2);
        dataSource.setValue(10);
    }
}
