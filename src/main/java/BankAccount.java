import java.math.BigDecimal;
import statement.Row;
import statement.Statement;

import java.time.LocalDate;
import statement.TransactionType;

public class BankAccount {

    Statement statement = new Statement();

    public void deposit(double amount, LocalDate date) {
        statement.add(Row.row(amount, TransactionType.DEBIT, date, amount));
    }

    public Statement getStatement() {
        return statement;
    }
}
