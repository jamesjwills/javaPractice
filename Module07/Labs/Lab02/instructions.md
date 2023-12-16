# Place the class `BankAccount` into the package `com.firebrand.banking`

1. Modify the `BankAccount.java` file to put the class `BankAccount` into the package `com.firebrand.banking`
Hints:
    - Create a directory structure to match the package name
    - Move (not copy) the `BankAccount.java` file down into that directory structure
    - Modify the `BankAccountClient.java` file to import the fully qualified class name for `BankAccount`

1. Delete any class files that are in the main lab directory
1. Compile (`javac`) both `.java` files.  Hint:
    - you have options
    - compile both in one command
        - `javac BankAccountClient.java com\firebrand\banking\BankAccount.java`
    - compile them in separate commands
1. Run (`java BankAccountClient`) and see that the program works with the `BankAccount` class placed in its own package
