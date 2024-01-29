import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

// using locks instead of synchronsied methods for more fine-grained control
public class GTSynchronisedData {

    private long myprotectedInt = 0;

    // initialise new instance, lock, of Lock interface implemented as ReentrantLock
    private final Lock lock = new ReentrantLock();

    // increment and decrement methods with locks to block other threads from
    // accessing methods
    public void incrementMyValue() {

        lock.lock();

        try {

            try {
                System.out.println(Thread.currentThread().getName() + " entering incrementMyValue()");
                long oldValue = myprotectedInt;

                // Simulating some work before incrementing
                Thread.sleep(GTConstant.GTTHREAD_SLEEP);

                myprotectedInt++;

                System.out.println(Thread.currentThread().getName() + " incremented myprotectedInt from "
                        + oldValue + " to " + myprotectedInt);

            } catch (InterruptedException e) {
                System.out.println(Thread.currentThread().getName() + " was interrupted");
            }

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

    // decrement method
    public void decrementMyValue() {

        lock.lock();

        try {

            try {
                System.out.println(Thread.currentThread().getName() + " entering decrementMyValue()");
                long oldValue = myprotectedInt;

                // Simulating some work before decrementing
                Thread.sleep(GTConstant.GTTHREAD_SLEEP);

                myprotectedInt--;

                System.out.println(Thread.currentThread().getName() + " decremented myprotectedInt from " + oldValue + " to " + myprotectedInt);

            } catch (InterruptedException e) {
                System.out.println(Thread.currentThread().getName() + " was interrupted");
            }

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

    // getters and setters
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
