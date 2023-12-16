public class MixedMode {
    public static void main(String[] args) {
        // Define a double, give it a value with a fractional part, and print it
        // Cast it to an int and print the result
        // See that the fractional part is lost
        // Convert the int back to a double and print it
        // See that the fractional part cannot be recovered

        double myDouble = 3.14;
        int myDoubleAsInt = (int) myDouble;
        System.out.println(myDouble);
        System.out.println(myDoubleAsInt);
        double myDoubleAsIntAndBackToDouble = (double) myDoubleAsInt;
        System.out.println(myDoubleAsIntAndBackToDouble);

    }
}
