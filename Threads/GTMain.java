public class GTMain {

    public static void main(String[] args) {

        System.out.println(Thread.currentThread().getName() + " thread begins");

        GTManager gtManager = new GTManager();
        gtManager.runOneThread();
        gtManager.runManyThreads();
        gtManager.runThreadsData();

        System.out.println(Thread.currentThread().getName() + " thread ends");

        System.exit(0);

    }

}
