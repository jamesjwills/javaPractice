class Squares {
    public static void main(String[] args) {

        int num = 2, square;
        square = calculateSquare(num);

        System.out.println(square);

        System.out.println(
                calculateSquare2(num + 1));

        printHelloWorld();
    }

    public static void printHelloWorld() {
        System.out.println("Hello World");
    }

    public static int calculateSquare(int n) {
        // An integer to hold the square of n
        int mySquare;

        // Multiply the number by itself
        // and store it
        mySquare = n * n;

        // Now we return the squared value
        // back to the caller
        return mySquare;
    }

    // Shorter version
    public static int calculateSquare2(int n) {
        return n * n;
    }
}
