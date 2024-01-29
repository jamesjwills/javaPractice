import java.util.concurrent.locks.Lock;
// using locks instead of synchronsied methods for more fine-grained control
import java.util.concurrent.locks.ReentrantLock;

public class GTSynchronisedData {

    // ===========================================================================================================
    // INITIALIZATION
    // initializes data field and lock
    // ===========================================================================================================

    private long myprotectedInt = 0;
    private final Lock lock = new ReentrantLock();

    // ===========================================================================================================
    // METHOD incrementMyValue
    // increments myprotectedInt by one
    // ===========================================================================================================

    public void incrementMyValue() {

        lock.lock();

        try {
            System.out.println(Thread.currentThread().getName() + " entering incrementMyValue()");
            long oldValue = myprotectedInt;

            // Simulating some work before incrementing
            Thread.sleep(GTConstant.GTTHREAD_SLEEP);

            myprotectedInt++;

            System.out.println(Thread.currentThread().getName() + " incremented myprotectedInt from "
                    + oldValue + " to " + myprotectedInt);

            // Simulating some work after incrementing
            Thread.sleep(GTConstant.GTTHREAD_SLEEP);

        } catch (InterruptedException e) {
            System.out.println(Thread.currentThread().getName() + " was interrupted");
        } finally {

            lock.unlock();

            // Introduce a delay to allow other threads to acquire the lock
            try {
                Thread.sleep(GTConstant.GTTHREAD_SLEEP);
            } catch (InterruptedException e) {
                System.out.println(Thread.currentThread().getName() + " was interrupted");
            }
        }
    }

    // ===========================================================================================================
    // METHOD decrementMyValue
    // decrements myprotectedInt by one
    // ===========================================================================================================

    public void decrementMyValue() {

        lock.lock();

        try {
            System.out.println(Thread.currentThread().getName() + " entering decrementMyValue()");
            long oldValue = myprotectedInt;

            // Simulating some work before decrementing
            Thread.sleep(GTConstant.GTTHREAD_SLEEP);

            myprotectedInt--;

            System.out.println(Thread.currentThread().getName() + " decremented myprotectedInt from " + oldValue
                    + " to " + myprotectedInt);

            // Simulating some work before decrementing
            Thread.sleep(GTConstant.GTTHREAD_SLEEP);

        } catch (InterruptedException e) {
            System.out.println(Thread.currentThread().getName() + " was interrupted");
        } finally {

            lock.unlock();

            // Introduce a delay to allow other threads to acquire the lock
            try {
                Thread.sleep(GTConstant.GTTHREAD_SLEEP);
            } catch (InterruptedException e) {
                System.out.println(Thread.currentThread().getName() + " was interrupted");
            }
        }
    }

    // ===========================================================================================================
    // GETTERS AND SETTERS
    // ===========================================================================================================

    public long getMyprotectedInt() {
        lock.lock();
        try {
            return myprotectedInt;
        } finally {
            lock.unlock();
        }
    }

    public void setMyprotectedInt(long value) {
        lock.lock();
        try {
            this.myprotectedInt = value;
        } finally {
            lock.unlock();
        }
    }
}
