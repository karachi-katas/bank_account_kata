import java.util.ArrayList;
import java.util.List;

public class Statement {

    List<Transaction> transactions;

    private Statement(List<Transaction> transactions) {
        this.transactions = transactions;
    }

    public static class Builder {

        List<Transaction> transactions = new ArrayList<>();

        Builder withTransaction(Transaction transaction) {
            transactions.add(transaction);
            return this;
        }

        Statement build() {
            return new Statement(transactions);
        }
    }
}
