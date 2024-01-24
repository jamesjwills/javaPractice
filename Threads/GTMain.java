public class GTMain {

    public static void main(String[] args) {

        System.out.println(Thread.currentThread().getName() + " thread begins");

        GTManager gt = new GTManager();

        gt.runManyThreads();
        
        System.out.println(Thread.currentThread().getName() + " thread ends");

        System.exit(0);
        
    }
    
}
