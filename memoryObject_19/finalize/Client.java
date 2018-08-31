package memoryObject_19.finalize;

public class Client {
    public static void main(String[] args) {
        Myname obj1 = new Myname("Instance1");
        Myname obj2 = new Myname("Instance2");
        obj1 = null;
        obj2 = null;

        System.out.println("프로그램을 종료합니다");
        System.gc();
        System.runFinalization();
    }
}
