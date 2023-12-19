public class fibonacciRecursion {

    public static void main(String[] args) {
        int num = Integer.parseInt(args[0]);
        for (int i = 0; i < num; i++) {
            System.out.println(fibonacci(i));
        }

    }

    static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }

    }
}
