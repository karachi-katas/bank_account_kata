import static statement.Row.row;
import static statement.TransactionType.DEBIT;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import statement.Statement;

public class BankAccount {

    List<Transaction> transactions = new ArrayList<>();

    public void deposit(double amount, LocalDate date) {
        transactions.add(new Transaction(amount, DEBIT, date));
    }

    public Statement getStatement() {
        Transaction transaction = transactions.get(0);
        Statement statement = new Statement.Builder()
                .with(row(transaction.getAmount(),
                        transaction.getType(),
                        transaction.getDate(),
                        transaction.getAmount())).build();
        return statement;
    }
}
