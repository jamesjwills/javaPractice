

## Working with polymorphism

1. Working in `OOProgramming.java` in the `main()` function, define an array of three `Person` references
1. Initialize it with one `Person` and two `Employees`, the order does not matter
1. Write a loop (any kind will do) to visit each element of the array and call the `display` function.
1. Compile and test. Note that the run-time automatically chooses the correct version of `display` depending on if the array element refers to a `Person` or an `Employee`
1. Once you have this working add an override of `toString` into `Person`
1. Have it return a human readable `String` including the `name` and `age` (`toString` should NOT print anything.  Just return the `String`)
1. Add an override of `toString` into class `Employee`
1. Have it return a human readable `String` including the `name`, the `age`, the `role` and the `salary`. Get the `name` and `age` part by calling `super.toString()`
1. Back in `OOProgramming.java`, use a loop to visit each item in the array; call `toString` and print the result


