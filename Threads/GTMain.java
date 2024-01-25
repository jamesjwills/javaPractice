public class GTMain {

    public static void main(String[] args) {

        System.out.println(Thread.currentThread().getName() + " thread begins");

        GTManager gt = new GTManager();
        // gt.runOneThread();
        // gt.runManyThreads();
        gt.runThreadsData();

        System.out.println(Thread.currentThread().getName() + " thread ends");

        System.exit(0);

    }

}
