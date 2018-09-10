package c23_thread.s04_ThreadNewSynchronized;

class Client {
    public static void main(String[] args) {
        System.out.println("UseReentrantLock");
        UseReentrantLock useReentrantLock = new UseReentrantLock();
        useReentrantLock.showDemo();

        System.out.println();
        System.out.println("ConditionSyncStringReadWrite");
        ConditionSyncStringReadWrite conditionSyncStringReadWrite = new ConditionSyncStringReadWrite();
        conditionSyncStringReadWrite.showDemo();

    }
}

