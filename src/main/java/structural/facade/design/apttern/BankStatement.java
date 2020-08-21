package structural.facade.design.apttern;

/*
  Facade Design Pattern is a category of Structural pattern.

  The Facade pattern is appropriate when we have a complex system that we want to expose to clients
  in a simplified way.

  Please implement Facade Design Pattern.

  To design this pattern, whatever number of classes needed, please feel free to
  implement those.

 */

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class BankStatement {

    private BankStatementData bankStatementData;
    private BankStatementHeader bankStatementHeader;
    private BankStatementFooter bankStatementFooter;

    public BankStatementData getBankStatementData() {
        return bankStatementData;
    }

    public BankStatementHeader getBankStatementHeader() {
        return bankStatementHeader;
    }

    public BankStatementFooter getBankStatementFooter() {
        return bankStatementFooter;
    }


    public void setBankStatementData(BankStatementData bankStatementData) {
        this.bankStatementData = bankStatementData;
    }

    public void setBankStatementHeader(BankStatementHeader bankStatementHeader) {
        this.bankStatementHeader = bankStatementHeader;
    }

    public void setBankStatementFooter(BankStatementFooter bankStatementFooter) {
        this.bankStatementFooter = bankStatementFooter;
    }
}
