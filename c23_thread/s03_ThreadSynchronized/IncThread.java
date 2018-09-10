package c23_thread.s03_ThreadSynchronized;

class IncThread extends Thread {
    Increment inc;

    public IncThread(Increment inc) {
        this.inc = inc;
    }

    public void run() {
        for (int i = 0; i < 1000; i++) {
            for (int j = 0; j < 1000; j++) {
                inc.increment();
            }
        }
    }
}
