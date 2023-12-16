public class Strings {
    public static void main(String[] args) {
        String helloWorld = "Hello World";
        System.out.println(helloWorld);

        String hello = "Hello";
        String world = "World";

        String message = hello + " " + world;

        int i = 99;
        double d = 10.7;

        String s = String.format("i contains %d and d contains %f!", i, d);
        System.out.println(s); // i contains 99 and d contains 10.700000!
    }
}
