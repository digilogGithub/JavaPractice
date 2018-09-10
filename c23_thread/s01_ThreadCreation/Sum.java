package c23_thread.s01_ThreadCreation;

class Sum {
    int num;

    public Sum() {
        num = 0;
    }

    public void addNum(int n) {
        num += n;
    }

    public int getNum() {
        return num;
    }
}
