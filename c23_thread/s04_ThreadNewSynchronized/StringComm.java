package c23_thread.s04_ThreadNewSynchronized;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

class StringComm {
    private final ReentrantLock entLock = new ReentrantLock();
    private final Condition readCond = entLock.newCondition();
    private final Condition writeCond = entLock.newCondition();
    String newString;
    boolean isNewString = false;

    public String getNewString() {
        String retStr = null;

        entLock.lock();
        try {
            if (isNewString == false)
                readCond.await();
            retStr = newString;
            isNewString = false;
            writeCond.signal();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            entLock.unlock();
        }
        return retStr;
    }

    public void setNewString(String newString) {
        entLock.lock();
        try {
            if (isNewString == true)
                writeCond.await();
            this.newString = newString;
            isNewString = true;
            readCond.signal();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            entLock.unlock();
        }
    }
}
