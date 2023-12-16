public class BankAccount {
    private int balance = 0;

    public void deposit(int amount)
    {
        balance = balance + amount;
        printStmtLine("deposit", amount);
    }
    public void withdraw(int amount)
    {
        balance = balance - amount;
        printStmtLine("withdraw", amount);
    }
    private void printStmtLine(String type, int amount)
    {
        System.out.println("A " + type 
            + " of " + amount 
            + ", balance " + balance);
    }

    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        account.deposit(10);
        account.withdraw(10);
    }
}
