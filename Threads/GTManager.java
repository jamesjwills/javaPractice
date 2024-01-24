
//creates Thread objects, starts and manages them

import java.util.ArrayList;
import java.time.Duration;
import java.time.Instant;

public class GTManager {

    // private method because only needs to be accessed in this class
    // loops through ArrayList of threads returns true if at least one is alive and false otherwise
    private boolean threadsAlive(ArrayList<GTThread> threads) {
        for (GTThread thread : threads) {
            if (thread.isAlive()) {
                return true;
            }
        }
        return false;
    }
    
    public void runOneThread() {

        // initialises new instance of GTThread
        GTThread gtthread = new GTThread(1);

        // starts new concurrent thread
        gtthread.start();
        
        // while threads napping, current thread sleeps
        try {
            Thread.sleep(GTConstant.GTMANAGER_SLEEP);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // sets isExiting to true causing the concurrent thread to exit the while loop
        // don't put join method here else while loop won't exit
        // what should argument of setter be?
        gtthread.setIsExiting(true);
        
        return;
    }

    
    public void runManyThreads() {

        // initialise arraylist of threads of predefined length
        // if length not predefined, add threads to list using while ([condition]) {add thread to list}
        ArrayList<GTThread> threadArray = new ArrayList<>(GTConstant.THREAD_ARRAY_LENGTH);
        //adding items to threadArray
        for (int i = 0; i < GTConstant.THREAD_ARRAY_LENGTH; i++) {
            GTThread gtthread = new GTThread(i);
            threadArray.add(gtthread);
        }

        // looping through thread array starting each thread.
        for (GTThread thread : threadArray) {
            thread.start();
        }

        // while threads are napping, current thread sleeps
        try {
            Thread.sleep(GTConstant.GTMANAGER_SLEEP);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // for each thread, set isExiting to true causing the concurrent threads to exit the while loop
        for (GTThread thread : threadArray) {
            thread.setIsExiting(true);
        }
        
        // wait in loop until all threads have stopped
        // potential for infinite loop here
        // implement timeout logic using Instant and Duration classes
        Instant startLoopTime = Instant.now();
        Duration timeout = Duration.ofSeconds(20);

        // variable to ensure printout displayed only once in case while code runs
        boolean printedMessage = false;
        
        while (threadsAlive(threadArray)) {
            // ensures message only printed once
            if (!printedMessage) {
                System.out.println("Some threads are still alive");
                printedMessage = true;
            }

            Instant currentTime = Instant.now();
            Duration loopDuration = Duration.between(startLoopTime, currentTime);
    
            if (loopDuration.compareTo(timeout) > 0) {
                System.out.println("Timeout exceeded: some threads did not finish.");
                // breaks out of while loop if timeout duration exceeded
                break;
            }

        }

        return;
    }

    //still to do: runThreadsData method.
}
