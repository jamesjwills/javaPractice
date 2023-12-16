
# Convert from double arithmetic to BigDecimal

1. Compile and run the two files `BankAccountClient.java` and `BankAccount.java`.  See that with `double` arithmetic the
program gets an answer with rounding errors.

1. Open the `BankAccount` class and convert it to use `BigDecimal` instead of `double`. Hints:
    - import `java.math.BigDecimal`
    - change all the `doubles` to `BigDecimals`
    - The preferred way to create a `BigDecimal` object is to use the static `valueOf` method
    - operators (like + and +=) don't work with `BigDecimal` use the documentation to lookup `add` and `substract` methods to replace the operators

1. Once `BankAccount.java` is converted, convert `BankAccountClient.java`. Hints:
    - import `java.math.BigDecimal`
    - The preferred way to create a `BigDecimal` object is to use the static `valueOf` method
1. Re-run and see that the rounding errors are now gone
