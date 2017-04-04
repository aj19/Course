import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class IncrementSynchronize {
    private int value = 0;

    public synchronized int getNextValue1() {
        value++;
        return value;
    }

    public int getNextValue2() {
        synchronized (this) {
            value++;
            return value;
        }
    }

    public int getNextValue3() {
        ReadWriteLock lock = new ReentrantReadWriteLock();

        lock.writeLock().lock();
        try {
            value++;
        } finally {
            lock.writeLock().unlock();
        }
        return value;
    }

}

