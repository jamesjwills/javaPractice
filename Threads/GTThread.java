//GTThread class - run method naps and wakes thread

import java.util.ArrayList;

public class GTThread extends Thread {

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

    protected static boolean threadsAlive(ArrayList<GTThread> threads) {
        for (GTThread thread : threads) {
            if (thread.isAlive()) {
                return true;
            }
        }
        return false;
    }

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
                    e.printStackTrace();
                }

                System.out.println(Thread.currentThread().getName() + " wakes");
            }

        }

        setIsStarted(false);

        System.out.println(Thread.currentThread().getName() + " ends");

        return;

    }

}
