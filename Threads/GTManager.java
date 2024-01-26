
//creates Thread objects, starts and manages them

import java.util.ArrayList;
import java.time.Duration;
import java.time.Instant;

public class GTManager {

    public void runOneThread() {

        // initialises new instance of GTThread
        GTThread gtthread = new GTThread();

        // starts new concurrent thread
        gtthread.start();

        // while threads napping, current thread sleeps
        try {
            Thread.sleep(GTConstant.GTMANAGER_SLEEP);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // sets isExiting to true causing the concurrent thread to exit the while loop
        gtthread.setIsExiting(true);

        return;
    }

    // runs many concurrent threads napping and waking
    public void runManyThreads() {

        // initialise arraylist of threads of predefined length
        // if length not predefined, add threads to list using while ([condition]) {add thread to list}
        ArrayList<GTThread> threadArray = new ArrayList<>(GTConstant.THREAD_ARRAY_LENGTH);

        for (int i = 0; i < GTConstant.THREAD_ARRAY_LENGTH; i++) {
            GTThread gtThread = new GTThread();
            threadArray.add(gtThread);
        }

        // looping through thread array starting each thread.
        for (GTThread thread : threadArray) {
            thread.start();
        }

        // while threads are napping, current thread sleeps
        try {
            GTThread.sleep(GTConstant.GTMANAGER_SLEEP);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // for each thread, set isExiting to true causing the concurrent threads to exit the while loop
        for (GTThread thread : threadArray) {
            thread.setIsExiting(true);
        }

        // begin while loop and timeout logic
        Instant startLoopTime = Instant.now();
        Duration timeout = Duration.ofSeconds(20);

        // if logic ensures message only printed once
        boolean printedMessage = false;

        while (GTThread.threadsAlive(threadArray)) {

            if (!printedMessage) {
                System.out.println("Some threads are still alive");
                printedMessage = true;
            }

            Instant currentTime = Instant.now();
            Duration loopDuration = Duration.between(startLoopTime, currentTime);
            // breaks out of while loop if timeout duration exceeded
            if (loopDuration.compareTo(timeout) > 0) {
                System.out.println("Timeout exceeded: some threads did not finish.");
                break;
            }

        }

        return;
    }

    public void runThreadsData() {

        // creates new instance of GTSynchronisedData
        GTSynchronisedData synchronisedData = new GTSynchronisedData();
        ArrayList<GTThread> threadArray = new ArrayList<>(GTConstant.THREAD_ARRAY_LENGTH);

        for (int i = 0; i < GTConstant.THREAD_ARRAY_LENGTH; i++) {

            // constructor takes instance just created (synchronisedData) as a parameter 
            // sets it to be the value of the instance variable synchronisedData in GTThread class
            // which is the value of that variable now possessed by the newly created gtThread
            GTThread gtThread = new GTThread();
            gtThread.setSynchronisedData(synchronisedData);
            threadArray.add(gtThread);
            gtThread.start();
        }

        try {
            Thread.sleep(GTConstant.GTMANAGER_SLEEP);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        for (GTThread thread : threadArray) {
            thread.setIsExiting(true);
        }

        Instant startLoopTime = Instant.now();
        Duration timeout = Duration.ofSeconds(20);
        boolean printedMessage = false;

        while (GTThread.threadsAlive(threadArray)) {
            if (!printedMessage) {
                System.out.println("Some threads are still alive");
                printedMessage = true;
            }

            Instant currentTime = Instant.now();
            Duration loopDuration = Duration.between(startLoopTime, currentTime);

            if (loopDuration.compareTo(timeout) > 0) {
                System.out.println("Timeout exceeded: some threads did not finish.");
                break;
            }
        }

        System.out.println("Final value of myProtectedInt: " + synchronisedData.getMyprotectedInt());
    }
}
