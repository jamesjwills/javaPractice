
import java.util.ArrayList;

public class GTManager {

    // ===========================================================================================================
    // runOneThread
    // ===========================================================================================================

    public void runOneThread() {

        // initialises new instance of GTThread
        GTThread gtThread = new GTThread();

        // starts new concurrent thread
        gtThread.start();

        // while threads napping, current thread sleeps
        try {
            Thread.sleep(GTConstant.GTMANAGER_SLEEP);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // sets isExiting to true causing the concurrent thread to exit the while loop
        gtThread.setIsExiting(true);
        /*
         * as soon as isExiting is set to true, this method moves on to return which
         * takes it back to main which will go on to call runManyThreads
         * In the mean time, the concurrent thread is busy setting isStarted to false
         * and
         * printing out a statement which says it is ending, but which time some threads
         * from runManyThreads have already started printing that they have begun!
         * Therefore add join method to tell main thread to wait until gtthread is
         * finished
         * before proceeding to runManyThreads in Main
         */

        try {
            gtThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("runOneThread method ends");

        return;
    }

    // ===========================================================================================================
    // runManyThreads
    // runs many concurrent threads napping and waking
    // ===========================================================================================================

    public void runManyThreads() {

        /*
         * initialise arraylist of threads of predefined length
         * if length not predefined, add threads to list using while ([condition]) {add
         * thread to list}
         */

        ArrayList<GTThread> GTThreadArray = new ArrayList<>(GTConstant.THREAD_ARRAY_LENGTH);

        for (int i = 0; i < GTConstant.THREAD_ARRAY_LENGTH; i++) {
            GTThread gtThread = new GTThread();
            GTThreadArray.add(gtThread);
        }

        // looping through thread array starting each thread.
        for (GTThread thread : GTThreadArray) {
            thread.start();
        }

        // while threads are napping, current thread sleeps
        try {
            GTThread.sleep(GTConstant.GTMANAGER_SLEEP);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // for each thread, set isExiting to true causing the concurrent threads to exit
        // the while loop
        for (GTThread thread : GTThreadArray) {
            thread.setIsExiting(true);
        }

        // begin while loop and timeout logic
        GTThread.waitForThreadsToFinish(GTThreadArray, GTConstant.GTMANAGER_TIMEOUT);

        System.out.println("runManyThreads method ends");

        return;
    }

    // ===========================================================================================================
    // runThreadsData
    // runs many concurrent threads napping and waking and manipulating data governed by locks
    // ===========================================================================================================

    public void runThreadsData() {

        // creates new instance of GTSynchronisedData
        GTSynchronisedData synchronisedData = new GTSynchronisedData();
        ArrayList<GTThread> GTThreadArray = new ArrayList<>(GTConstant.THREAD_ARRAY_LENGTH);

        for (int i = 0; i < GTConstant.THREAD_ARRAY_LENGTH; i++) {
            /*
             * setter takes instance just created (synchronisedData) as a parameter
             * sets it to be the value of the instance variable synchronisedData in GTThread
             * class
             * which is the value of that variable now possessed by the newly created
             * gtThread
             */
            GTThread gtThread = new GTThread();
            gtThread.setSynchronisedData(synchronisedData);
            GTThreadArray.add(gtThread);
            gtThread.start();
        }

        try {
            Thread.sleep(GTConstant.GTMANAGER_SLEEP);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        for (GTThread thread : GTThreadArray) {
            thread.setIsExiting(true);
        }

        // begin while loop and timeout logic
        GTThread.waitForThreadsToFinish(GTThreadArray, GTConstant.GTMANAGER_TIMEOUT);

        System.out.println(
                "runThreadsData method ends. Final value of myProtectedInt: " + synchronisedData.getMyprotectedInt());

        return;
    }
}
