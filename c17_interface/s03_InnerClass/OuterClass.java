package c17_interface.s03_InnerClass;

public class OuterClass {
    String name;
    int num;

    public OuterClass(String name, int num) {
        this.name = name;
        this.num = num;
    }

    void whoAreYou() {
        System.out.println(name + " OuterClass " + num);
        num++;
    }

    public class InnerClass {
        public InnerClass() {
            whoAreYou();
        }
    }
}
