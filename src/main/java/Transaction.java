import java.math.BigDecimal;
import java.time.LocalDate;
import statement.TransactionType;

public class Transaction {

    private final double amount;
    private final TransactionType type;
    private final LocalDate date;

    public Transaction(double amount, TransactionType type, LocalDate date) {
        this.amount = amount;
        this.type = type;
        this.date = date;
    }

    public double getAmount() {
        return amount;
    }

    public TransactionType getType() {
        return type;
    }

    public LocalDate getDate() {
        return date;
    }
}
