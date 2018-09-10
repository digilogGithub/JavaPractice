package c23_thread.s02_ThreadFeature;

class PriorityTestThree {
    public void showDemo() {
        MessageSendingThreadThree tr1 = new MessageSendingThreadThree("First", Thread.MAX_PRIORITY);
        MessageSendingThreadThree tr2 = new MessageSendingThreadThree("Second", Thread.NORM_PRIORITY);
        MessageSendingThreadThree tr3 = new MessageSendingThreadThree("Third", Thread.MIN_PRIORITY);

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
