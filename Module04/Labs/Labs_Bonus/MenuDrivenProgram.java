import java.util.Scanner;

public class MenuDrivenProgram {
    static void isPrime(int num) {
        
    }

    static void isOddOrEven(int num) {
        System.out.println("testcode2");
    }

    static void calculateFactorial(int num) {
        int factorial = 1;
        for (int i = 1; i < num; i++) {
            factorial *= i+1;
        }
        System.out.println(factorial);
    }
    // Write a menu driven program which accepts an integer number, and offers the
    // following options:
    // 1. Calculate Factorial of a number
    // 2. Check if number is Prime or not
    // 3. Check if number is Odd or Even
    // 4. Exit

    // Print your menu options at the console and prompt the user for an input

    // You may want to consider using a switch statement to drive your menu choices
    // You may also want to think about using separate functions for each menu
    // option

    // You can write your program without one or both of these suggestions, if you
    // wish

    // Finally, what do you need for your menu to run repeatedly until you choose to
    // exit?

    public static void main(String[] args) {

        int choice;

        // Write your print statements for the menu here
        System.out.println("This program will provide some information about any integer");
        System.out.println("Enter an integer");
        Scanner sc = new Scanner(System.in);
        int numberChoice = sc.nextInt();
        

        // Accept the input for the variable "choice" from the console .. write that
        // code
        // here
        System.out.println("Enter 1 to calculate the factorial of number.");
        System.out.println("Enter 2 find out if the number is odd or even");
        System.out.println("Enter 3 to find out if the number is prime");
        System.out.println("Enter 4 to exit the program.");

        choice = sc.nextInt();
        sc.close();

        // Here is a suggested switch-case code skeleton for you to use to run your menu
        // driven program ...

        switch (choice) {
            case 1:
                // Write code here for calculating the factorial of a number here
                calculateFactorial(numberChoice);
                break;
            case 2:
                // Write code here for checking if a number is Prime or Not
                isPrime(numberChoice);
                break;
            case 3:
                // Write code here for checking if a number is Even or Odd
                isOddOrEven(numberChoice);
                break;
            case 4:
                // The exit here function in Java will terminate your program immediately
                System.exit(0);
        }
    }

}
