package structural.facade.design.apttern;

import javax.sql.DataSource;

public class BankStatementGenerator {


    public void generateReport(StatementType statementType, DataSource dataSource, String location) {
        if (statementType == null || dataSource == null) {
            //throw some exception
        }
        //Create report
        BankStatement bankStatement = new BankStatement();
        bankStatement.setBankStatementHeader(new BankStatementHeader());
        bankStatement.setBankStatementFooter(new BankStatementFooter());

        //Get data from dataSource and set to ReportData object

        bankStatement.setBankStatementData(new BankStatementData());

        //Write report
        StatementWriter statementWriter = new StatementWriter();
        switch (statementType) {
            case HTML:
                statementWriter.writeHTMLStatement(bankStatement, location);
                break;

            case PDF:
                statementWriter.writePDFStatement(bankStatement, location);
                break;
        }
    }
}


