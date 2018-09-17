package c19_memoryObject.s02_ObjectClass;

class ObjectFinalize {
    public void showDamo() {
        Myname obj1 = new Myname("Instance1");
        Myname obj2 = new Myname("Instance2");
        obj1 = null;
        obj2 = null;

        System.out.println("프로그램을 종료합니다");
        System.gc();
        System.runFinalization();
    }
}
