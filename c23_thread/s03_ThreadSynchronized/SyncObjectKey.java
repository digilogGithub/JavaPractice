package c23_thread.s03_ThreadSynchronized;

class SyncObjectKey {
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
