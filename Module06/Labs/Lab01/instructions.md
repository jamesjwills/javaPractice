
## Handling Exceptions

1. Initially this will not compile because `printFile` calls library functions that throw checked exceptions. `printfile` does not meet the catch or specify requirement.
1. Check the documentation for `FileReader`'s constructor, and for `BufferedReader`'s `readLine` method to see what exceptions they throw.
1. Specify them for `printFile`

1. The code STILL won't compile because now `main` does not meet the catch or specify requirement
1. Wrap the calls to `printFile` in a `try`/`catch` block to meet the catch requirement
    - You should separately catch missing files and input/output errors and produce suitable error messages
    - The code should now run and correctly report a missing `NoFile.txt`
1. In the event of an exception, `printFile` does not close the `BufferedReader`.
1. Adjust the code to use a `try`/`finally` to fix this
1. Improve the code in `printFile` to use try with resources. It works the same but it's  better practice, and automates error prone code

