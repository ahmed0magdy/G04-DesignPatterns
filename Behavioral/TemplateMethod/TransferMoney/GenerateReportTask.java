package Behavioral.TemplateMethod.TransferMoney;

public class GenerateReportTask extends Task {

    public GenerateReportTask(AuditTrail auditTrail) {
        super(auditTrail);
    }

    @Override
    public void doExecute() {
        System.out.println("Generate Report");
    }

}
