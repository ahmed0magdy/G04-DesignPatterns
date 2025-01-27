package Behavioral.Strategy.TransferMoney;

public class Main {
    public static void main(String[] args) {
        var task = new TaskExecuter(new AuditTrail());
        task.execute(new TransferMoneyTask());
        task.execute(new GenerateReportTask());
    }
}
