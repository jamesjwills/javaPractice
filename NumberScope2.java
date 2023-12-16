public class NumberScope2 {
    static int x = 10;
    int y = 10;

    public void test() {
        int x = 20;
        int y = 20;

        System.out.println("x = " + x);
        System.out.println("this.x = " + NumberScope2.x);
        System.out.println("y = " + y);
        System.out.println("NumberScope2 = " + this.y);
    }
    public static void main(String[] args) {
        NumberScope2 sc = new NumberScope2();
        sc.test();
    }
}
