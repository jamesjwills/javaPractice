package com.firebrand.banking;

import java.math.BigDecimal;


public class BankAccount {
    private BigDecimal balance = BigDecimal.valueOf(0);

    public void deposit(BigDecimal amount) {
        balance = balance.add(amount);
        printStatementLine("deposit", amount);
    }

    public void withdraw(BigDecimal amount) {
        balance = balance.subtract(amount);
        printStatementLine("withdraw", amount);
    }

    private void printStatementLine(String type, BigDecimal amount) {
        System.out.println("There was a " + type + " of " + amount + " giving a balance of " + balance);
    }

}
