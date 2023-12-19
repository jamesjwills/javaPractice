public class Bar {
    public Bar() {
        this("E");
        System.out.println("R");
    }
    public Bar(String message) {
        System.out.println(message);
    }

        public static void main(String[] args) {
        //new Foo();
        System.out.println("Hello ");
        System.out.print("World ");
    }
}

class Foo extends Bar {
    public Foo() {
        super();
        System.out.println("A");
    }


}
