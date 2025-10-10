import java.math.BigDecimal;
import java.time.LocalDate;

public class Account extends Person {
    private String accountNumber;
    private BigDecimal balance;

    // Constructor – starts with zero balance by default
    public Account(int id, String name, String identity, LocalDate dob, String accountNumber) {
        super(id, name, identity, dob);
        this.accountNumber = accountNumber;
        this.balance = BigDecimal.ZERO;
    }

    public boolean deposit(BigDecimal amount) {
        if (amount.compareTo(BigDecimal.ZERO) <= 0) {
            System.out.println("❌ Deposit failed: amount must be positive.");
            return false;
        }
        balance = balance.add(amount);
        System.out.println("✅ Deposited " + amount + ". New balance: " + balance);
        return true;
    }

    public boolean withdraw(BigDecimal amount) {
        if (amount.compareTo(BigDecimal.ZERO) <= 0) {
            System.out.println("❌ Withdraw failed: amount must be positive.");
            return false;
        }
        if (amount.compareTo(balance) > 0) {
            System.out.println("❌ Withdraw failed: insufficient funds. Available: " + balance);
            return false;
        }
        balance = balance.subtract(amount);
        System.out.println("✅ Withdrawn " + amount + ". New balance: " + balance);
        return true;
    }

    public BigDecimal getBalance() { return balance; }

    @Override
    public String toString() {
        return "\nAccount Number: " + accountNumber +
                "\nBalance: " + balance +
                "\n" + super.toString();
    }
}


