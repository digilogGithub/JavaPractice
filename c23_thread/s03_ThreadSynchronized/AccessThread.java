package c23_thread.s03_ThreadSynchronized;

class AccessThread extends Thread {
    IHaveTwoNum twoNumInst;

    public AccessThread(IHaveTwoNum twoNumInst) {
        this.twoNumInst = twoNumInst;
    }

    public void run() {
        twoNumInst.addOneNum1();
        twoNumInst.addTwoNum1();

        twoNumInst.addOneNum2();
        twoNumInst.addTwoNum2();
    }
}
