

public class BankAccountTest {

    // Test deposit
    @Test
    void testDeposit() {
        BankAccount acc = new BankAccount(1000);
        acc.deposit(500);
        assertEquals(1500, acc.getBalance());
    }

    @Test
    void testDeposit_Invalid() {
        BankAccount acc = new BankAccount(1000);
        assertThrows(IllegalArgumentException.class, () -> acc.deposit(-100));
    }

    // Test withdraw
    @Test
    void testWithdraw() {
        BankAccount acc = new BankAccount(1000);
        acc.withdraw(400);
        assertEquals(600, acc.getBalance());
    }

    @Test
    void testWithdraw_InsufficientBalance() {
        BankAccount acc = new BankAccount(1000);
        assertThrows(IllegalArgumentException.class, () -> acc.withdraw(2000));
    }

    @Test
    void testWithdraw_InvalidAmount() {
        BankAccount acc = new BankAccount(1000);
        assertThrows(IllegalArgumentException.class, () -> acc.withdraw(0));
    }

    // Test check balance
    @Test
    void testGetBalance() {
        BankAccount acc = new BankAccount(500);
        assertEquals(500, acc.getBalance());
    }

    // Test initial balance validation
    @Test
    void testInitialBalance_Invalid() {
        assertThrows(IllegalArgumentException.class, () -> new BankAccount(-100));
    }
}
}
