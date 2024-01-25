import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

// using locks instead of synchronsied methods for more fine-grained control
public class GTSynchronisedData {

    private long myprotectedInt = 0;

    // initialise new instance, lock, of Lock interface implemented as ReentrantLock
    private final Lock lock = new ReentrantLock();

    // getters and setters for myprotectedInt for better encapsulation
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

    //increment and decrement methods with locks to block other threads from accessing methods

    public void incrementMyValue() {
        lock.lock();
        try {
            myprotectedInt++;
        } finally {
            lock.unlock();
        }
    }

    public void decrementMyValue() {
        lock.lock();
        try {
            myprotectedInt--;
        } finally {
            lock.unlock();
        }
    }
}
