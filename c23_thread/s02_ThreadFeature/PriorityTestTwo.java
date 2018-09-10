package c23_thread.s02_ThreadFeature;

class PriorityTestTwo {
    public void showDemo() {
        MessageSendingThreadTwo tr1 = new MessageSendingThreadTwo("First", Thread.MAX_PRIORITY);
        MessageSendingThreadTwo tr2 = new MessageSendingThreadTwo("Second", Thread.NORM_PRIORITY);
        MessageSendingThreadTwo tr3 = new MessageSendingThreadTwo("Third", Thread.MIN_PRIORITY);

        tr1.start();
        tr2.start();
        tr3.start();

        try {
            tr1.join();
            tr2.join();
            tr3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
