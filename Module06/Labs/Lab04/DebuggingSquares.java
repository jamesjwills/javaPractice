public class DebuggingSquares {

    // The code in this file should run and print all the squares between 1 and 100
    // There is no input required at the terminal / console

    // FOr example, The output should be ....
    // The list of squares between the numbers 1 to 100 is :
    // 1
    // 4
    // 9
    // 16
    // 25
    // .....
    // ( and so on until )
    // 81
    // 100

    // However, there is an error somewhere in this code, and it doesn't work as
    // expected
    // when run ...

    // Your task is to discover the error in this program!

    // *** IMPORTANT **** : If for any reason, you need to get back to the command
    // prompt
    // Press Ctrl key and Z together at the same time. You might need to do this!

    // First, Run this program at the command prompt to discover what the unexpected
    // output or "bug" might be. It's possible you may see no output at all ... that
    // is a valid bug too. Or, you may see the compiler give you an error message.
    // (You might want to remember how to use Ctrl + Z keys when you do this! )

    // Next, go through the code LINE BY LINE, and try to figure out what may be
    // causing the program to behave unexpectedly

    // Once you have identified the bug or bugs, edit the code / add new code to
    // get the program working properly.

    // Good luck!

    // HINT : It can be helpful to write down the result of every line of code on
    // a piece of rough paper ... just to help you with your debugging process
    // Some of the most experienced programmers in the world still do this to help
    // them debug a program!

    // Also, if you are debugging a program that contains funtion calls, it is
    // helpful
    // to go through the program line by line, IN THE ORDER OF FLOW OF CONTROL.

    // Feel free to add Print statements at various points in the code to help you
    // figure out what may be going on

    public static void main(String[] args) {

        int lowerLimit = 1, upperLimit = 100, result;

        System.out.println(" The list of squares between the numbers 1 to 100 is  : ");

        for (int i = lowerLimit; i <= upperLimit; i++) {

            result = square(i);
            if ((result > 0) && (result <= 100))

                System.out.println(result);
        }

    }

    public static int square(int number) {

        int squareOfNumber = number * 2;

        return squareOfNumber;
    }
}
