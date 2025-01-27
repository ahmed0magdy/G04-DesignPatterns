package Behavioral.TemplateMethod.TransferMoney;

public abstract class Task {
    private AuditTrail auditTrail;

    public Task(AuditTrail auditTrail) {
        this.auditTrail = auditTrail;
    }

    public void execute() {
        auditTrail.record();
        doExecute();
    }

    public abstract void doExecute();
}
