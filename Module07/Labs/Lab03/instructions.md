# Use classpath to find library files.  Package a library into a jar file

1. Compile `BankAccountClient.java`, and `.\com\firebrand\banking\BankAccount.java`

1. Run the main program.  When it runs successfully that proves it correctly finds the `BankAccount.class` file

1. Create a directory, `libs`, in the main directory for the lab.  Move (NOT copy) the `com` directory into `libs`

1. Run the main program again, see that it cannot find class `BankAccount`.  This is because the default assumption is that the root of the package (`com`) will be in the current directory

1. Run specifying the classpath `libs` using the -cp switch to Java.  (`java -cp "libs" BankAccountClient`).  See that it still does not run.  This time it cannot find `BankAccountClient`.  Specifying **only** `libs` in the class path prevents it looking in the current directory.

1. Run specifying the classpath `"libs;."` (You will need quotes round it as it contains special characters).  This time it succeeds.  When it looks for the class `BankAccountClient` it will first search the directory `libs`.  When it fails to find `BankAccountClient` it moves on to search `.` - the current directory.

    This shows that classpath is used to locate all the class files required

1. Switch to the directory `libs`
1. Use the jar utility to create a `banking.jar` file from the `com` directory (`jar –cf .\banking.jar com`)

1. Switch back to the main directory for the lab
1. Create another directory jars

1. Run specifying the classpath `"jars;."` (Quotes required again).  See that it cannot find `BankAccount`. Not suprising as `jars` is an empty directory

1. Copy the `banking.jar` file to the `jars` directory
1. Run specifying the classpath `"jars\banking.jar;."` (Quotes required again)

1. See that the program now works.  It finds the `BankAccount.class` file from within `banking.jar`
