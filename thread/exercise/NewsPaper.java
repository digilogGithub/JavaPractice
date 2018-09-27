package thread.exercise;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class NewsPaper {
    String newsContent;
    boolean newContent = false;
    ReentrantLock reentrantLock = new ReentrantLock();
    Condition readCondition = reentrantLock.newCondition();
    Condition writeCondition = reentrantLock.newCondition();

    public String getNewsContent() {

        reentrantLock.lock();
        try {
            if (newContent == false)
                readCondition.await();
            newContent = false;
            writeCondition.signal();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            reentrantLock.unlock();
        }
        return newsContent;
    }

    public void setNewsContent(String newsContent) {


        reentrantLock.lock();

        try {
            if (newContent == true)
                writeCondition.await();
//                newContent = true;
            this.newsContent = newsContent;
            newContent = true;
            readCondition.signalAll();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            reentrantLock.unlock();
        }
    }

}
