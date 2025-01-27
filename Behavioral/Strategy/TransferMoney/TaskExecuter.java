package Behavioral.Strategy.TransferMoney;

public class TaskExecuter {
    private AuditTrail auditTrail;

    public TaskExecuter(AuditTrail auditTrail) {
        this.auditTrail = auditTrail;
    }

    public void execute(Task task) {
        auditTrail.record();
        task.execute();
    }
}
