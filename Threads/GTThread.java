import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;

public class GTThread extends Thread {

    // ===========================================================================================================
    // INITIALIZATION
    // ===========================================================================================================

    private boolean isStarted = true;
    private boolean isExiting = false;
    private GTSynchronisedData synchronisedData;

    // ===========================================================================================================
    // METHOD threadsAlive
    // loops through ArrayList of threads and asks if they are alive
    // ===========================================================================================================

    // method to determine if threads are alive
    protected static boolean threadsAlive(ArrayList<GTThread> threads) {
        for (GTThread thread : threads) {
            if (thread.isAlive()) {
                return true;
            }
        }
        return false;
    }

    // ===========================================================================================================
    // METHOD waitForThreadsToFinish
    // prints ArrayList of live threads
    // updates and prints list if list of live threads changes
    // if timeout exceeded, interrupts threads and prints timeout message
    // ===========================================================================================================

    protected static void waitForThreadsToFinish(ArrayList<GTThread> threadArray, Duration timeout) {

        Instant startLoopTime = Instant.now();

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

        return;
    }

    // ===========================================================================================================
    // METHOD run
    // governs what threads do
    // ===========================================================================================================

    public void run() {
        System.out.println(Thread.currentThread().getName() + " begins");
        while (!isExiting) {

            if (this.synchronisedData != null) {

                if (Math.random() * 10 < 5) {

                    // increments value
                    synchronisedData.incrementMyValue();

                } else {

                    // decrements value
                    synchronisedData.decrementMyValue();

                }

            } else {

                System.out.println(Thread.currentThread().getName() + " naps");

                try {
                    Thread.sleep(GTConstant.GTTHREAD_SLEEP);
                } catch (InterruptedException e) {
                    System.out.println(Thread.currentThread().getName() + " was interrupted");
                }

                System.out.println(Thread.currentThread().getName() + " wakes");
            }

            if (Thread.interrupted()) {
                setIsExiting(true); // Set flag to ensure the thread terminates
                break;
            }

        }

        setIsStarted(false);

        System.out.println(Thread.currentThread().getName() + " ends");

        return;

    }

    // ===========================================================================================================
    // GETTERS AND SETTERS
    // ===========================================================================================================

    public GTSynchronisedData getSynchronisedData() {
        return synchronisedData;
    }

    public void setSynchronisedData(GTSynchronisedData synchronisedData) {
        this.synchronisedData = synchronisedData;
    }

    public synchronized void setIsExiting(boolean isExiting) {
        this.isExiting = isExiting;
    }

    public boolean getIsExiting() {
        return isExiting;
    }

    public synchronized void setIsStarted(boolean isStarted) {
        this.isStarted = isStarted;
    }

    public boolean getIsStarted() {
        return isStarted;
    }
}
