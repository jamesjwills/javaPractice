import java.math.BigDecimal;

import com.firebrand.banking.*;

public class BankAccountClient {
    public static void main(String[] args) {
        BankAccount ba = new BankAccount();
        ba.deposit(BigDecimal.valueOf(99));
        ba.deposit(BigDecimal.valueOf(1));
    }
}
