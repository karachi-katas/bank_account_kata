import static org.junit.Assert.assertEquals;
import static statement.Row.row;
import static statement.TransactionType.DEBIT;

import java.time.LocalDate;
import org.junit.Test;
import statement.Statement;

public class CustomerShould {

    @Test
    public void beAbleToDepositMoney() {

        BankAccount bankAccount = new BankAccount();
        bankAccount.deposit(1000, LocalDate.parse("2015-02-20"));
        Statement actualStatement = bankAccount.getStatement();

        Statement expectedStatement = new Statement.Builder()
                .with(row(10.0, DEBIT, LocalDate.parse("2015-02-20"), 10.0))
                .build();

        assertEquals(expectedStatement, actualStatement);
    }
}
