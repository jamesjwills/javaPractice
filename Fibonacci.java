/*
 * Build a method that filters an array for odd or even numbers (bonus points if it can do either depending on arguments passed in!).
Build a method that returns an ArrayList of the first n primes in an array.
Build a method that returns an ArrayList of the first n Fibonacci numbers.
 */

import java.util.ArrayList;

public class Fibonacci {

    static void addFibonacci(ArrayList<Integer> arr) {

        int lastElementIndex = arr.size() - 1;
        int penultimateElementIndex = arr.size() - 2;
        int next = arr.get(lastElementIndex) + arr.get(penultimateElementIndex);
        arr.add(next);

    }

    public static void main(String[] args) {
        ArrayList<Integer> fib = new ArrayList<>();
        fib.add(0, 0);
        fib.add(1, 1);
        while (fib.size() <= Integer.parseInt(args[0])) {
            addFibonacci(fib);
        }
        for (int i = 0; i < fib.size(); i++) {
            System.out.println(fib.get(i));
        }
    }

}
