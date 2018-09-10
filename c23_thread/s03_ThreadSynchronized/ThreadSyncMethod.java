package c23_thread.s03_ThreadSynchronized;

class ThreadSyncMethod {
    public void showDemo() {
        Calculator calculator = new Calculator();
        AddThread addThread = new AddThread(calculator);
        MinThread minThread = new MinThread(calculator);

        addThread.start();
        minThread.start();

        try {
            addThread.join();
            minThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        calculator.showOptCnt();
    }
}
