package c23_thread.s04_ThreadNewSynchronized;

class StringWriter extends Thread {
    StringComm stringComm;

    public StringWriter(StringComm stringComm) {
        this.stringComm = stringComm;
    }

    public void run() {
        for (int i = 0; i < 3; i++) {
            System.out.println("read string : " + stringComm.getNewString());
        }
    }
}
