package c19_memoryObject.finalize;

public class Myname {
    String objName;

    public Myname(String objName) {
        this.objName = objName;
        System.out.println(this.objName + "이 생성되었습니다.");
    }

    protected void finalize() throws Throwable {
        super.finalize();
        System.out.println(objName + "이 소멸되었습니다.");
    }
}
