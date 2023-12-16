
public class DebuggingPart1 {

    
    // The code in this file should print the sum of ten numbers
    // Starting from 1, 2, 3.... upto 10
    // So, the program should print the result of 1 + 2 + 3 .... 10 , which is 55

    // However, there is a bug lurking in this code, and it doesn't work as expected
    // when run ...

    // Your task is to Debug this program!

    // First, Run this program at the command prompt to discover what the unexpected
    // output or "bug" might be. It's possible you may see no output at all ... that
    // is a valid bug too. Or, you may see the compiler give you an error message.
    // If you need to stop a run away program press Ctrl-C

    // Next, go through the code LINE BY LINE, and try to figure out what may be
    // causing the program to behave unexpectedly

    // Once you have identified the bug or bugs, edit the code / add new code to
    // get the program working properly. 

    // Good luck!

    // HINT : It can be helpful to write down the result of every line of code on
    // a piece of rough paper ... just to help you with your debugging process
    // Some of the most experienced programmers in the world still do this to help
    // them debug a program!

    public static void main(String[] args) {
        
        int currentNumber = 1 , sumOfNumbers = 0 ; 

        while (currentNumber < 11)
        {
            sumOfNumbers = sumOfNumbers + currentNumber;
        }

        System.out.println("The Sum of the numbers from 1 to 10 is : " + sumOfNumbers); 

    }

}
