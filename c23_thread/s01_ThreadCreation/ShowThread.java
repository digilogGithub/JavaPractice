package c23_thread.s01_ThreadCreation;

class ShowThread extends Thread {
    String threadName;

    public ShowThread(String threadName) {
        this.threadName = threadName;
    }

    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("안녕하세요, " + threadName + "입니다.");
            try {
                sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
}
