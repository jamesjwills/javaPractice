## "Hello World" - the simplest starter program

1. As you write your code you must stay between the open and close curly brace characters `{}`. (There is a comment in the code to guide you.)

1. Suggestions to try out.  Remember: each time you change the code you must save the file, and run both javac (to compile the new version) and java (to execute it).
    > `javac Hello.java`
    > `java Hello`

    - Change `"Hello World\n"` to display your name.  You have to keep everything inside `""`
    - Try removing the `\n` - how is the output different?
    - instead of `println`, use `print` - how is the output different
    - use `print` to display `"Hello"`, and a second `print` (copy paste the line) to display `"World"` What choices do you have to get the space between Hello and World?

1. Suggestions that will cause error messages.  Don't be scared by error messages, they exist to help you get your program correct.  Read them carefully.
        - Try removing the `;` at the end of a statement
        - Change `print` (or `println`) to `Print` (or `Println`).  See that (sadly) the compiler is not clever enough to say exactly what you should do.  It just tells you that it does not recognize the symbol 
        - Remove the starting `"` character from one of the output texts
        - Remove the ending `"` character from one of the output texts
        - Remove both `"` characters from one of the output texts
1. If you have more time experiment further