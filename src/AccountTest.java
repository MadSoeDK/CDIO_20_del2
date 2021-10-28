import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AccountTest {

    Account account = new Account();

    @Test
    void getBalance() {
        assertEquals(1000, account.getBalance(), "Starting balance is not correct.");
    }
    void setBalance() {

        account.setBalance(100);
        assertEquals(1100, account.getBalance(), "Account balance is not correct");

        account.setBalance(-1500);
        assertEquals(0, account.getBalance(), "Negative balance check failed");
    }
}