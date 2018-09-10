package c23_thread.s02_ThreadFeature;

class AdderThread extends Thread {

    Sum sumInst;
    int start, end;

    public AdderThread(Sum sum, int start, int end) {
        sumInst = sum;
        this.start = start;
        this.end = end;
    }

    @Override
    public void run() {
        for (int i = start; i <= end; i++) {
            sumInst.addNum(i);
        }
    }
}
