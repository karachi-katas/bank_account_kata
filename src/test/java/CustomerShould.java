import static org.junit.Assert.assertEquals;

import java.time.LocalDate;
import org.junit.Test;

public class CustomerShould {

    @Test
    public void beAbleToDepositMoney() {

        BankAccount bankAccount = new BankAccount();
        bankAccount.deposit(1000, LocalDate.parse("2015-02-20"));
        Statement actualStatement = bankAccount.getStatement();

        Statement expectedStatement = new Statement.Builder()
                .withTransaction(new Transaction(10.0, TransactionType.DEBIT,
                        LocalDate.parse("2015-02-20")))
                .build();

        assertEquals(expectedStatement, actualStatement);

    }
}
