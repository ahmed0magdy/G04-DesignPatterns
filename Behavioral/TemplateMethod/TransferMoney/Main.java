package Behavioral.TemplateMethod.TransferMoney;

public class Main {
    public static void main(String[] args) {
        var task1 = new TransferMoneyTask();
        task1.execute();
        var task2 = new GenerateReportTask();
        task2.execute();
    }
}
