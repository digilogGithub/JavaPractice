package c23_thread.s02_ThreadFeature;

class MessageSendingThreadTwo extends Thread {
    String message;

    public MessageSendingThreadTwo(String message, int prio) {
        this.message = message;
        setPriority(prio);
    }

    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(message + "(" + getPriority() + ")");
        }
    }
}
