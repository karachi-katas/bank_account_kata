package statement;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Row {

    LocalDate date;
    TransactionType transactionType;
    BigDecimal amount;
    BigDecimal balance;

    private Row(double amount, TransactionType transactionType, LocalDate date, double balance) {
        this.amount = BigDecimal.valueOf(amount);
        this.transactionType = transactionType;
        this.date = date;
        this.balance = BigDecimal.valueOf(balance);
    }

    public static Row row(double amount, TransactionType transactionType, LocalDate date, double balance) {
        return new Row(amount, transactionType, date, balance);
    }
}
