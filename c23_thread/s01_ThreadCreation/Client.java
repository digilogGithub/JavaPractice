package c23_thread.s01_ThreadCreation;

class Client {
    public static void main(String[] args) {
        System.out.println("ShowThread");
        ShowThread st1 = new ShowThread("멋진 쓰레드");
        ShowThread st2 = new ShowThread("예쁜 쓰레드");
        st1.start();
        st2.start();

     /*   try {
            st1.join();
            st2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }*/

        System.out.println();
        System.out.println("AdderThread");
        AdderThread at1 = new AdderThread(1, 50);
        AdderThread at2 = new AdderThread(51, 100);

        Thread thread1 = new Thread(at1);
        Thread thread2 = new Thread(at2);

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("1~100까지 총합 : " + (at1.getNum() + at2.getNum()));

    }
}

