package c23_thread.s03_ThreadSynchronized;

class Calculator {
    int opCnt = 0;

/*  No synchronized
    public int add(int n1, int n2) {
        opCnt++;
        return n1 + n2;
    }

    performance issue synchronized
    public synchronized int add(int n1, int n2) {
        opCnt++;
        return n1 + n2;
    }*/

    //    recommand synchronized
    public int add(int n1, int n2) {
        synchronized (this) {
            opCnt++;
        }
        return n1 + n2;
    }

/*  No synchronized
    public int min(int n1, int n2) {
        opCnt++;
        return n1 - n2;
    }

      performance issue synchronized
    public synchronized int min(int n1, int n2) {
        opCnt++;
        return n1 - n2;
    }*/

    //    recommend synchronized
    public int min(int n1, int n2) {
        synchronized (this) {
            opCnt++;
        }
        return n1 - n2;
    }

    public void showOptCnt() {
        System.out.println("총 연산 횟수 : " + opCnt);
    }
}
