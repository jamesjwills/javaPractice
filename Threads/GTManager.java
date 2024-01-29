
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
            gtthread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("runOneThread method ends");

        return;
    }

    //-----------------------------------------------------------------------------------------

    // runs many concurrent threads napping and waking
    public void runManyThreads() {

        /*
         * initialise arraylist of threads of predefined length
         * if length not predefined, add threads to list using while ([condition]) {add
         * thread to list}
         */

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

        // for each thread, set isExiting to true causing the concurrent threads to exit
        // the while loop
        for (GTThread thread : threadArray) {
            thread.setIsExiting(true);
        }

        // begin while loop and timeout logic
        Instant startLoopTime = Instant.now();
        Duration timeout = Duration.ofSeconds(GTConstant.GTMANAGER_TIMEOUT);

        // List to store names of alive threads
        ArrayList<String> aliveThreads = new ArrayList<>();

        // add names of alive threads to aliveThreads list
        for (GTThread thread : threadArray) {
            if (thread.isAlive()) {
                aliveThreads.add(thread.getName());
            }
        }

        // print list if not empty
        if (!aliveThreads.isEmpty()) {
            System.out.println("Alive threads: " + aliveThreads);
        }

        while (GTThread.threadsAlive(threadArray)) {

            // stores aliveThreads in dummy variable
            ArrayList<String> t = new ArrayList<>(aliveThreads);

            /*
             * loops through threadArray
             * if a thread is no longer alive remove from aliveThreads
             */
            for (GTThread thread : threadArray) {
                if (!thread.isAlive()) {
                    aliveThreads.remove((thread.getName()));
                }
            }

            // if aliveThreads has changed (if some have died) print new list
            if (!t.equals(aliveThreads) && !aliveThreads.isEmpty()) {
                System.out.println("Alive threads: " + aliveThreads);
            }

            Instant currentTime = Instant.now();
            Duration loopDuration = Duration.between(startLoopTime, currentTime);

            // breaks out of while loop if timeout duration exceeded
            if (loopDuration.compareTo(timeout) > 0) {
                for (GTThread thread : threadArray) {

                    // interrupt thread after timeout exceeded
                    thread.interrupt();

                    // once interrupted allow it to run through and finish, printing its interrupted exceptions
                    try {
                        thread.join();
                        System.out.println("Timeout exceeded: " + thread.getName() + " did not finish.");
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }

        System.out.println("runManyThreads method ends");

        return;
    }

    //---------------------------------------------------------------------------------------

    public void runThreadsData() {

        // creates new instance of GTSynchronisedData
        GTSynchronisedData synchronisedData = new GTSynchronisedData();
        ArrayList<GTThread> threadArray = new ArrayList<>(GTConstant.THREAD_ARRAY_LENGTH);

        for (int i = 0; i < GTConstant.THREAD_ARRAY_LENGTH; i++) {
            /*
             * constructor takes instance just created (synchronisedData) as a parameter
             * sets it to be the value of the instance variable synchronisedData in GTThread
             * class
             * which is the value of that variable now possessed by the newly created
             * gtThread
             */
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

        // begin while loop and timeout logic
        Instant startLoopTime = Instant.now();
        Duration timeout = Duration.ofSeconds(GTConstant.GTMANAGER_TIMEOUT);

        // List to store names of alive threads
        ArrayList<String> aliveThreads = new ArrayList<>();

        // add names of alive threads to aliveThreads list
        for (GTThread thread : threadArray) {
            if (thread.isAlive()) {
                aliveThreads.add(thread.getName());
            }
        }

        // print list if not empty
        if (!aliveThreads.isEmpty()) {
            System.out.println("Alive threads: " + aliveThreads);
        }

        while (GTThread.threadsAlive(threadArray)) {

            // stores aliveThreads in dummy variable
            ArrayList<String> t = new ArrayList<>(aliveThreads);

            /*
             * loops through threadArray
             * if a thread is no longer alive remove from aliveThreads
             */
            for (GTThread thread : threadArray) {
                if (!thread.isAlive()) {
                    aliveThreads.remove((thread.getName()));
                }
            }

            // if aliveThreads has changed (if some have died) print new list
            if (!t.equals(aliveThreads) && !aliveThreads.isEmpty()) {
                System.out.println("Alive threads: " + aliveThreads);
            }

            Instant currentTime = Instant.now();
            Duration loopDuration = Duration.between(startLoopTime, currentTime);

            // interrupts threads if timeout duration exceeded
            if (loopDuration.compareTo(timeout) > 0) {
                for (GTThread thread : threadArray) {

                    // interrupt thread after timeout exceeded
                    thread.interrupt();

                    // once interrupted allow it to run through and finish, printing its interrupted
                    // exceptions
                    try {
                        thread.join();
                        System.out.println("Timeout exceeded: " + thread.getName() + " did not finish.");
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }

        System.out.println(
                "runThreadsData method ends. Final value of myProtectedInt: " + synchronisedData.getMyprotectedInt());

        return;
    }
}
