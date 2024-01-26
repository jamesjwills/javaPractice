import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

// using locks instead of synchronsied methods for more fine-grained control
public class GTSynchronisedData {

    private long myprotectedInt = 0;

    // initialise new instance, lock, of Lock interface implemented as ReentrantLock
    private final Lock lock = new ReentrantLock();

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

    // increment and decrement methods with locks to block other threads from accessing methods

    public void incrementMyValue() {
        lock.lock();
        try {
            System.out.println(Thread.currentThread().getName() + " entering incrementMyValue()");
            long oldValue = myprotectedInt;
            // Simulating some work before incrementing
            try {
                Thread.sleep(GTConstant.GTTHREAD_SLEEP);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            myprotectedInt++;
            System.out.println(Thread.currentThread().getName() + " incremented myprotectedInt from "
                    + oldValue + " to " + myprotectedInt);
        } finally {
            lock.unlock();
            // Introduce a delay to allow other threads to acquire the lock
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void decrementMyValue() {
        lock.lock();
        try {
            System.out.println(Thread.currentThread().getName() + " entering decrementMyValue()");
            long oldValue = myprotectedInt;
            // Simulating some work before decrementing
            try {
                Thread.sleep(GTConstant.GTTHREAD_SLEEP);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            myprotectedInt--;
            System.out.println(Thread.currentThread().getName() + " decremented myprotectedInt from "
                    + oldValue + " to " + myprotectedInt);
        } finally {
            lock.unlock();
            // Introduce a delay to allow other threads to acquire the lock
            try {
                Thread.sleep(GTConstant.GTTHREAD_SLEEP);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
