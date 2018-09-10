package c23_thread.s03_ThreadSynchronized;

class AddThread extends Thread {
    Calculator calculator;

    public AddThread(Calculator calculator) {
        this.calculator = calculator;
    }

    public void run() {
        System.out.println("1+2=" + calculator.add(1, 2));
        System.out.println("2+4=" + calculator.add(2, 4));
    }
}
