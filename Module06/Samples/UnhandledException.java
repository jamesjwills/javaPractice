public class UnhandledException {
    public static void main(String[] args) {
        f1();
    }
    private static void f1(){
        f2("xyz");
    }

    private static void f2(String s){
        int i = Integer.parseInt(s);
    }
}
