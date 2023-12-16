import java.math.BigDecimal;

import com.firebrand.banking.BankAccount;

public class BankAccountClient {
    public static void main(String[] args) {
        BankAccount ba = new BankAccount();
        ba.deposit(BigDecimal.valueOf(10000.02));
        ba.withdraw(BigDecimal.valueOf(10000.01));
    }
}
