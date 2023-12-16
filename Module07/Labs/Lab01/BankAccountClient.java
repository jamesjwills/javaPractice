
//  Compile and run the two files BankAccountClient.java and 
//  BankAccount.java.  See that with double arithmetic the
//  program gets an answer with rounding errors.

//  Open the BankAccount class and convert it
//  to use BigDecimal instead of double
//  There are some hints inside BankAccount.java

//  Once BankAccount.java is converted, convert
//  BankAccount client.
//  Hints
//  - you should import BigDecimal
//  - The preferred way to create a BigDecimal
//  object is to use the static valueOf method

//  See that the rounding errors are now gone

public class BankAccountClient {
    public static void main(String[] args) {
        BankAccount ba = new BankAccount();
        ba.deposit(10000.02);
        ba.withdraw(10000.01);
    }
}
