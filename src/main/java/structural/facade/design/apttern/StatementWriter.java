package structural.facade.design.apttern;

public class StatementWriter {

    public void writeHTMLStatement(BankStatement bankStatement, String location){
        bankStatement.getBankStatementData().getBankStatementData();
        bankStatement.getBankStatementHeader().getBankStatementHeader();
        bankStatement.getBankStatementFooter().getBankStatementFooter();
    }


    public void writePDFStatement(BankStatement bankStatement, String location){
        bankStatement.getBankStatementData().getBankStatementData();
        bankStatement.getBankStatementHeader().getBankStatementHeader();
        bankStatement.getBankStatementFooter().getBankStatementFooter();
    }
}
