package c23_thread.s03_ThreadSynchronized;

class MinThread extends Thread {
    Calculator calculator;

    public MinThread(Calculator calculator) {
        this.calculator = calculator;
    }

    public void run() {
        System.out.println("2-1=" + calculator.min(2, 1));
        System.out.println("4-2=" + calculator.min(4, 2));
    }
}
