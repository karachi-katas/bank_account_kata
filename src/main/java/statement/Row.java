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

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        Row row = (Row) o;

        if (!date.equals(row.date)) {
            return false;
        }
        if (transactionType != row.transactionType) {
            return false;
        }
        if (!amount.equals(row.amount)) {
            return false;
        }
        return balance.equals(row.balance);
    }

    @Override
    public int hashCode() {
        int result = date.hashCode();
        result = 31 * result + transactionType.hashCode();
        result = 31 * result + amount.hashCode();
        result = 31 * result + balance.hashCode();
        return result;
    }
}
