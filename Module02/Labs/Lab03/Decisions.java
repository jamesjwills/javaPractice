public class Decisions {
    public static void main(String[] args) {

        // Part 1
        // define an integer and give it a value
        // If the integer is less than 100 print the message "less than 100"
        // if it is greater or equal 100 print the message "greater or equal to 100"
        // Write your code here...

        int myInt = -30;
        if (myInt < 100) {
            System.out.println("less than 100");
        } else {
            System.out.println("greater or equal to 100");
        }

        // Part 2
        // if the integer is within the range 1, 100 inclusive print a message
        // if the integer is outside that range print a different message
        // test the code with different values to be sure it works correctly
        // Write your code here...
        if (myInt >= 100 && myInt <= 100) {
            System.out.println("Boo");

        } else {
            System.out.println("Noo");
        }
    }
}
