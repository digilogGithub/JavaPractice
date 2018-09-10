package c23_thread.s04_ThreadNewSynchronized;

class UseReentrantLock {

    public void showDemo() {
        IHaveTwoNum numInst = new IHaveTwoNum();

        AccessThread at1 = new AccessThread(numInst);
        AccessThread at2 = new AccessThread(numInst);

        at1.start();
        at2.start();

        try {
            at1.join();
            at2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        numInst.showAllNums();
    }
}
