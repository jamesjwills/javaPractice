
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
    private double balance = 0;

    public void deposit(double amount) {
        balance += amount;
        printStatementLine("deposit", amount);
    }

    public void withdraw(double amount) {
        balance -= amount;
        printStatementLine("withdraw", amount);
    }

    private void printStatementLine(String type, double amount) {
        System.out.println("There was a " + type + " of " + amount + " giving a balance of " + balance);
    }

}
