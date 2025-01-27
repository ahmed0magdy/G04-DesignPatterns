package Behavioral.TemplateMethod.TransferMoney;

public class Main {
    public static void main(String[] args) {
        var transfer = new TransferMoneyTask(new AuditTrail());
        transfer.execute();
    }
}
