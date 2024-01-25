//GTThread class - run method naps and wakes thread

import java.util.ArrayList;

public class GTThread extends Thread {

    private int threadNumber;
    private boolean isStarted = true;
    private boolean isExiting = false;
    private GTSynchronisedData synchronisedData;

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

    // one parameter constructor to give threads unique identifier
    public GTThread(int threadNumber) {
        this.threadNumber = threadNumber;
    }

    // two parameter constructor
    public GTThread(int threadNumber, GTSynchronisedData synchronisedData) {
        this.threadNumber = threadNumber;
        this.synchronisedData = synchronisedData;
    }

    protected static boolean threadsAlive(ArrayList<GTThread> threads) {
        for (GTThread thread : threads) {
            if (thread.isAlive()) {
                return true;
            }
        }
        return false;
    }

    public void run() {
        System.out.println("Thread " + threadNumber + " begins");
        while (!isExiting) {
            

            if (this.synchronisedData != null) {
                System.out.println("Thread " + threadNumber + " increments value");
                
                // displays initial value of myprotectedInt
                System.out.println("Initial value of myprotectedInt for Thread " + threadNumber + " is "
                        + synchronisedData.getMyprotectedInt());

                // increments value before nap
                synchronisedData.incrementMyValue();

                // displays value after increment
                System.out.println("New value of myprotectedInt for Thread " + threadNumber + " is "
                        + synchronisedData.getMyprotectedInt());
            }

            System.out.println("Thread " + threadNumber + " naps");

            try {
                Thread.sleep(GTConstant.GTTHREAD_SLEEP);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println("Thread " + threadNumber + " wakes");

        }

        setIsStarted(false);

        System.out.println("Thread " + threadNumber + " ends");

        return;

    }

}
