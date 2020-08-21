package Vo_run;

import structural.facade.design.apttern.BankStatementGenerator;
import structural.facade.design.apttern.StatementType;

public class BankStatementTest {

    public static void main(String[] args) {
        BankStatementGenerator bankStatementGenerator = new BankStatementGenerator();

        bankStatementGenerator.generateReport(StatementType.HTML, null, null);

        bankStatementGenerator.generateReport(StatementType.PDF, null, null);

    }
}
