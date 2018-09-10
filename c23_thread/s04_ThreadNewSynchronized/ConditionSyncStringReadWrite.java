package c23_thread.s04_ThreadNewSynchronized;

class ConditionSyncStringReadWrite {
    public void showDemo() {
        StringComm stringComm = new StringComm();
        StringReader stringReader = new StringReader(stringComm);
        StringWriter stringWriter = new StringWriter(stringComm);

        System.out.println("입출력 쓰레드의 실행...");
        stringReader.start();
        stringWriter.start();
    }
}
