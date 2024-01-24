public class GTThread extends Thread {

    private int threadNumber;
    // one parameter constructor to give threads unique identifier
    public GTThread(int threadNumber) {
        this.threadNumber = threadNumber;
    }

    private boolean isStarted = true;

    private boolean isExiting = false;

    //Put code in run() method that you want to execute when Thread runs
    //wakes up every 1000ms to see if isExiting is true 
    //when thread wakes and isExiting is true, drops out of while loop sets isStarted to false then exits run
    public void run() {
        System.out.println("Thread " + threadNumber + " begins");
        while (!isExiting) {

            System.out.println("Thread " + threadNumber + " is running");

            try {
                Thread.sleep(GTConstant.THREAD_SLEEP_2);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }

        setIsStarted(false);

        System.out.println("Thread " + threadNumber + " ends");
        
        return;

    }


    //Synchronised method: only one thread can execute setIsExiting() on an instance of the class at a time.
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
