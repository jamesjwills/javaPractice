public class Lifetime {
    public static void main(String[] args) {
        int i = 1;
        String s = "abc";
        if (true) {
            int j = i;
            String t = s;
            // ...more code
        }
    }
}
