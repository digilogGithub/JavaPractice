package c23_thread.s02_ThreadFeature;

class ThreadHeapMultiAccess {
    public void showDemo() {
        Sum sum = new Sum();
        AdderThread at1 = new AdderThread(sum, 1, 50);
        AdderThread at2 = new AdderThread(sum, 51, 100);
        at1.start();
        at2.start();

        try {
            at1.join();
            at2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("1~100까지의 합 : " + sum.getNum());
    }
}
