package com.firebrand.banking;

import java.math.BigDecimal;

public class BankAccount {
    private BigDecimal balance = java.math.BigDecimal.valueOf(0);

    public void deposit(java.math.BigDecimal amount)
    {
        balance = balance.add(amount);
        printStatementLine("deposit", amount);
    }
    // ... incomplete code...
    public void withdraw(java.math.BigDecimal amount)
    {
        balance = balance.subtract(amount);
        printStatementLine("withdraw", amount);
    }
    private void printStatementLine(String type, java.math.BigDecimal amount)
    {
        System.out.println("There was a " + type + " of " + amount + " giving a balance of " + balance);
    }

    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        account.deposit(java.math.BigDecimal.valueOf(10));
        account.withdraw(java.math.BigDecimal.valueOf(10));
    }
}
