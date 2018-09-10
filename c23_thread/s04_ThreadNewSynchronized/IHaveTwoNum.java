package c23_thread.s04_ThreadNewSynchronized;

import java.util.concurrent.locks.ReentrantLock;

class IHaveTwoNum {
    private final ReentrantLock key1 = new ReentrantLock();
    private final ReentrantLock key2 = new ReentrantLock();
    int num1 = 0;
    int num2 = 0;

    public void showAllNums() {
        System.out.println("num1 : " + num1);
        System.out.println("num2 : " + num2);
    }

    // New way Synchronized
    public void addOneNum1() {
        key1.lock();
        try {
            num1 += 1;
        } finally {
            key1.unlock();
        }
    }

    public void addTwoNum1() {
        key1.lock();
        try {
            num1 += 2;
        } finally {
            key1.unlock();
        }
    }

    public void addOneNum2() {
        key2.lock();
        try {
            num2 += 1;
        } finally {
            key2.unlock();
        }
    }

    public void addTwoNum2() {
        key2.lock();
        try {
            num2 += 2;
        } finally {
            key2.unlock();
        }
    }

    /*  // No synchronized
      public void addOneNum1() {
          num1 += 1;
      }

      public void addTwoNum1() {
          num1 += 2;
      }

      public void addOneNum2() {
          num2 += 1;
      }

      public void addTwoNum2() {
          num2 += 2;
      }

      // performance issue synchronized
      public synchronized void addOneNum1() {
          num1 += 1;
      }

      public synchronized void addTwoNum1() {
          num1 += 2;
      }

      public synchronized void addOneNum2() {
          num2 += 1;
      }

      public synchronized void addTwoNum2() {
          num2 += 2;
      }

      //recommend synchronized
      Object syncKey1 = new Object();

      public void addOneNum1() {
          synchronized (this) {
              num1 += 1;
          }
      }

      public void addTwoNum1() {
          synchronized (this) {
              num1 += 2;
          }
      }

      public void addOneNum2() {
          synchronized (syncKey1) {
              num2 += 1;
          }
      }

      public void addTwoNum2() {
          synchronized (syncKey1) {
              num2 += 2;
          }
      }
      */

}
