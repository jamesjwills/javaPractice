package com.firebrand.BankAccount;
import java.math.BigDecimal;
//  Convert this class to use BigDecimal instead
//  of double.
//  Hints
//  - import java.math.BigDecimal
//  - change all the doubles to BigDecimals
//  - The preferred way to create a BigDecimal
//  object is to use the static valueOf method
//  - operators (like + and +=) don't work with BigDecimal
//  use the documentation to lookup add and substract methods 
//  to replace the operators

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
