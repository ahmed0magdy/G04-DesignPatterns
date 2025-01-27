package Behavioral.TemplateMethod.TransferMoney;

public abstract class Task {
    private AuditTrail auditTrail;

    public Task() {
        auditTrail = new AuditTrail();
    }

    public Task(AuditTrail auditTrail) { // useful if auditTrail was an interface
        this.auditTrail = auditTrail;
    }

    public void execute() {
        auditTrail.record();
        doExecute();
    }

    protected abstract void doExecute();
}
