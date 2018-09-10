package c23_thread.s02_ThreadFeature;

class MessageSendingThreadThree extends Thread {
    String message;

    public MessageSendingThreadThree(String message, int prio) {
        this.message = message;
        setPriority(prio);
    }

    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(message + "(" + getPriority() + ")");

            try {
                sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
