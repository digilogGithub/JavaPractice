package c23_thread.s02_ThreadFeature;

class PriorityTestOne {

    public void showDemo() {
        MessageSendingThreadOne tr1 = new MessageSendingThreadOne("First");
        MessageSendingThreadOne tr2 = new MessageSendingThreadOne("Second");
        MessageSendingThreadOne tr3 = new MessageSendingThreadOne("Third");

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
