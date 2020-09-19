import java.math.BigDecimal;
import java.time.LocalDate;

public class Transaction {

    LocalDate date;
    TransactionType transactionType;
    BigDecimal amount;

    public Transaction(double amount, TransactionType transactionType, LocalDate date) {
        this.amount = BigDecimal.valueOf(amount);
        this.transactionType = transactionType;
        this.date = date;
    }
}
