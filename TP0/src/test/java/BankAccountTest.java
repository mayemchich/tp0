import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BankAccountTest {

    @Test
    void testDepositIncreasesBalanceForPositiveAmount() {
        // Arrange
        BankAccount account = new BankAccount(950, 0.02);

        // Act
        account.deposit(500);

        // Assert
        assertEquals(1450, account.getBalance());
    }

    @Test
    void testDepositThrowsExceptionForNegativeAmount() {
        // Arrange
        BankAccount account = new BankAccount(400, 0.07);

        // Act and Assert
        assertThrows(IllegalArgumentException.class, () -> account.deposit(-250));
    }

    @Test
    void testWithdrawDecreasesBalanceForSufficientFunds() {
        // Arrange
        BankAccount account = new BankAccount(630, 0.00);

        // Act
        account.withdraw(500);

        // Assert
        assertEquals(130, account.getBalance());
    }

    @Test
    void testWithdrawThrowsExceptionForNegativeAmount() {
        // Arrange
        BankAccount account = new BankAccount(1200, 0.1);

        // Act and Assert
        assertThrows(IllegalArgumentException.class, () -> account.withdraw(-300));
    }

    @Test
    void testWithdrawThrowsExceptionForInsufficientFunds() {
        // Arrange
        BankAccount account = new BankAccount(370, 0.04);

        // Act and Assert
        assertThrows(IllegalStateException.class, () -> account.withdraw(960));
    }

    @Test
    void testTransferMovesMoneyBetweenAccounts() {
        // Arrange
        BankAccount sourceAccount = new BankAccount(1300, 0.02);
        BankAccount targetAccount = new BankAccount(460, 0.02);

        // Act
        sourceAccount.transfer(200, targetAccount);

        // Assert
        assertEquals(1100, sourceAccount.getBalance());
        assertEquals(660, targetAccount.getBalance());
    }

    @Test
    void testTransferThrowsExceptionForNegativeAmount() {
        // Arrange
        BankAccount sourceAccount = new BankAccount(951, 0.06);
        BankAccount targetAccount = new BankAccount(890, 0.05);

        // Act and Assert
        assertThrows(IllegalArgumentException.class, () -> sourceAccount.transfer(-200, targetAccount));
    }

    @Test
    void testTransferThrowsExceptionForNullTargetAccount() {
        // Arrange
        BankAccount sourceAccount = new BankAccount(1000, 0.02);

        // Act and Assert
        assertThrows(NullPointerException.class, () -> sourceAccount.transfer(733, null));
    }

    @Test
    void testAddInterestIncreasesBalanceAccordingToInterestRate() {
        // Arrange
        BankAccount account = new BankAccount(100, 0.02);

        // Act
        account.addInterest();

        // Assert
        assertEquals(102, account.getBalance());
    }
}
