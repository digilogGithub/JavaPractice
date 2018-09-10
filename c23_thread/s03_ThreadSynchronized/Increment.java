package c23_thread.s03_ThreadSynchronized;

class Increment {
    int num = 0;

    public void increment() {
//    but sometimes following way makes performance issue
//    public synchronized void increment() {
        num++;
    }

    public int getNum() {
        return num;
    }
}
